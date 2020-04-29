package com.woniuxy.clinic.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.entity.TStaff;
import com.woniuxy.clinic.entity.TUser;
import com.woniuxy.clinic.service.StaffService;
import com.woniuxy.clinic.service.UserService;
import com.woniuxy.clinic.tool.CommonResult;

@Controller
public class StaffController {
	@Autowired
	StaffService staffService;
	@Autowired
	UserService userService;
	@ResponseBody
	@GetMapping("/stafflist")
	public Object selectallstaff(@RequestParam(value="page",defaultValue = "1",required = false) Integer currentPage,
            @RequestParam(value="limit",defaultValue = "5",required = false) Integer pageSize,TStaff staff,String staffname) {
		 PageInfo info = null;
		 System.out.println(staffname);
		 staff.setStaffName(staffname);
	        try {    	
		List<TStaff> selectallStaff = staffService.selectallStaff(currentPage, pageSize, staff);
		info = new PageInfo(selectallStaff);
        return CommonResult.success(info);
    } catch (Exception e) {
        e.printStackTrace();
        return CommonResult.failed();
    }
	}
	
	
	@ResponseBody
    @RequestMapping("/addStaff")
    public int addFinances(Integer staffId,String staffName,String staffSex,String staffPhone,
    		int staffAge,String staffStatus,int departmentId,int roleId,String staffCard,
    		HttpSession session){ 
		TStaff card = staffService.selectStaffbyStaff_card(staffCard);
		if(card==null) {
            TStaff staff=new TStaff();
            staff.setDepartmentId(departmentId);
            staff.setStaffCard(staffCard);
            staff.setRoleId(roleId);
            staff.setStaffId(staffId);
            staff.setStaffName(staffName);
            staff.setStaffSex(staffSex);
            staff.setStaffPhone(staffPhone);
            staff.setStaffAge(staffAge);
            staff.setStaffStatus(staffStatus);
            staff.setStaffTime(new Date());
            
            return staffService.addStaff(staff);
		}else {
			return 404;
		}
}

	
    @RequestMapping("/staff/delete")
    public ModelAndView orderdelete(HttpServletRequest req, HttpServletResponse resp,String password,String username) throws Exception {
		
		ModelAndView mv=new ModelAndView();
	    mv.addObject("msg", "oder-delete");
		mv.setViewName("/msg.jsp");
		return mv;
	}
    
    /**
     * 根据id修改员工信息
     * @param userId
     * @param code
     * @param userPassword
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping("/updateStaff")
    public int updateFinances(int staffId,String staffName,String staffSex,String staffPhone,
    		int staffAge,String staffStatus,int departmentId,int roleId,HttpSession session){     
            TStaff staff=new TStaff();
            staff.setDepartmentId(departmentId);
            staff.setRoleId(roleId);
            staff.setStaffId(staffId);
            staff.setStaffName(staffName);
            staff.setStaffSex(staffSex);
            staff.setStaffPhone(staffPhone);
            staff.setStaffAge(staffAge);
            staff.setStaffStatus(staffStatus);
            return staffService.updateStaffbyStaff_id(staff);
        
}
}
