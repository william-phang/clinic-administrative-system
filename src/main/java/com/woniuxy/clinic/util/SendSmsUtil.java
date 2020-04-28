package com.woniuxy.clinic.util;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.Gson;
import com.woniuxy.clinic.entity.TUser;
import com.woniuxy.clinic.exception.UserException;
import com.woniuxy.clinic.mapper.TUserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.Map;
/**
* @Description:    短信发送工具
* @Author:         Joe
* @CreateDate:     2020/3/21 15:49
*/
@Service
public class SendSmsUtil {

    @Value("${alisms.accessKeyId}")
    private String accessKeyId;
    @Value("${alisms.accessSecret}")
    private String accessSecret;
    @Value("${alisms.signName}")
    private String signName;
    @Value("${alisms.templateCode}")
    private String templateCode;
    @Autowired
    TUserMapper userMapper;


    public boolean aliSendSms(String PhoneNumbers,String TemplateParam) throws Exception{
 
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessSecret);
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", PhoneNumbers);
        request.putQueryParameter("SignName", signName);
        request.putQueryParameter("TemplateCode", templateCode);
        request.putQueryParameter("TemplateParam", TemplateParam);

            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
            String infojson = response.getData();
            Gson gson2 = new Gson();
            Map map = gson2.fromJson(infojson, Map.class);
            String codes = map.get("Message").toString();
            System.out.println("codes="+codes);
            if(codes.equals("OK")){
            	 return true;
           
            }

                return false;
    }

}
