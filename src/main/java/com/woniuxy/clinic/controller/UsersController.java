package com.woniuxy.clinic.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.woniuxy.clinic.entity.TUser;
import com.woniuxy.clinic.exception.UserException;
import com.woniuxy.clinic.service.UserService;
import com.woniuxy.clinic.tool.VerificationCode;
import com.woniuxy.clinic.tool.VerifyCode;
import com.woniuxy.clinic.util.SendSmsUtil;

import lombok.Data;

@Controller
public class UsersController {
	@Autowired
	UserService userService;
	@Autowired
    private SendSmsUtil sendSmsUtil;
	
	@Data
    public static class SmsData{
        String code;

        public SmsData(String code) {
            this.code = code;
        }
    }

	
	
    @RequestMapping("/user/login")
    public String login(String username,String password,String captcha,
    		HttpSession session,Model model) {
    	UsernamePasswordToken token=new UsernamePasswordToken(username, password);
    	Map<String, String> errors = new HashMap<String, String>();
		if (!username.matches("^[1][3,4,5,7,8][0-9]{9}$")) {
			errors.put("unameerror", "用户名必须为正确的手机号码");
		}

		if (password.length() < 3 || password.length() > 6) {
			errors.put("pwderror", "输入的密码长度必须为3-6");
		}
		
		if (!session.getAttribute("session_verifycode").toString().equalsIgnoreCase(captcha)) {
			errors.put("verifycodeerror", "输入验证码错误");
		}
		System.out.println(errors.size());
		if (errors.size() > 0) {
			model.addAttribute("errors", errors);
			return "login";
		}
    	try {
    		token.setRememberMe(true);
    		TUser login = userService.login(username, password);
        		session.setAttribute("user", login);
        		return "redirect:/index.html";
		} catch (UserException e) {
			model.addAttribute("msg", e.getMessage());	
			return "login";
		}	
    	}
  

    /**
     * 发送验证码
     * @param PhoneNumbers 手机号
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/sendSms",method = RequestMethod.POST)
    public String sendSms(String PhoneNumbers, HttpServletRequest request,Model model){
        HttpSession session = request.getSession();
        Boolean flag = false;
            //随机生成验证码
            String numeral = VerificationCode.getNumeral();
            SmsData smsData = new SmsData(numeral);
            Gson gson = new Gson();
            String code = gson.toJson(smsData);   
            try {
                //是否发送成功
            	flag = sendSmsUtil.aliSendSms(PhoneNumbers, code);
                session.setAttribute(PhoneNumbers,numeral);
                session.setMaxInactiveInterval(5 * 60);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(flag){
                return "1";
            }else{
                return "2";
            }
	
    }

    /**
     * 验证
     * @param PhoneNumbers
     * @param code
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/yanSms",method = RequestMethod.POST)
    public String yanSms(String PhoneNumbers, String code,HttpServletRequest request){
        HttpSession session = request.getSession();
        String ycode = (String) session.getAttribute(PhoneNumbers);
        if(ycode.equals(code)){
            return PhoneNumbers+"验证成功";
        }
        return PhoneNumbers+"验证失败";

    }

    @ResponseBody
    @RequestMapping("/updateFinances")
    public int updateFinances(int userId,int code,String userPassword){
        if (code==(Integer) SecurityUtils.getSubject().getSession().getAttribute("temp")){
            TUser user=new TUser();
            user.setUserId(userId);
            user.setUserPassword(userPassword);
            return userService.updateByPrimaryKeySelective(user);
        }else{
            return 404;
        }
    }
    @ResponseBody
    @RequestMapping("/selectAss")
    public List<TUser> selectass(Model model,TUser user) {   		
    	  List<TUser> selectallUser = userService.selectallUser(user);
		return selectallUser;

    	}
    
    @RequestMapping("/updatepass/{userid}")
    public String updatepass(@PathVariable("userid") Integer userId,Model model
    		) {
    	
    	TUser userbyid = userService.selectUserbyid(userId);
    	System.out.println(userId+"+"+userbyid);
    	model.addAttribute("user", userbyid);
			return "page/user-password.html";
    	}
    
    
    @RequestMapping("/img")
    public void login(HttpServletRequest req, 
    		HttpServletResponse resp,Model model) throws IOException {
    VerifyCode vc = new VerifyCode();
	BufferedImage image = vc.getImage();
	req.getSession().setAttribute("session_verifycode", vc.getText());
	VerifyCode.output(image, resp.getOutputStream());
    }
    

    

    @RequiresPermissions("user:add")
    @RequestMapping("/user/add")
    public ModelAndView orderdelete(HttpServletRequest req, HttpServletResponse resp,String password,String username) throws Exception {

		ModelAndView mv=new ModelAndView();
	    mv.addObject("msg", "oder-delete");
		mv.setViewName("/msg.jsp");
		return mv;
	}
   
	public void setUsersService(UserService userService) {
		this.userService = userService;
	}
}
