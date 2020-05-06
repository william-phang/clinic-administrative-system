package com.woniuxy.clinic.common;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data
public class CommonResult<T> implements Serializable{
	
	//状态码
//	private Long code;
//	//提示信息
//	private String message;
//	//响应数据
//	private List<T> data;
	
	//新添代码
	//状态码
    private Long code;
    //提示消息
    private String message;
   //响应数据
    private T data;

    public CommonResult(){}
    public CommonResult(Long code,String message){
        this.code = code;
        this.message = message;
    }

    public CommonResult(Long code ,String message,T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 响应成功的结果
     * @return 状态码 200
     */
    public static CommonResult success(){
        return  new CommonResult(ResultUtil.SUCCESS.getCode(),ResultUtil.SUCCESS.getMessage());
    }

    public static CommonResult success(String message){
        return  new CommonResult(ResultUtil.SUCCESS.getCode(),message);
    }

    public static <T> CommonResult success(T data){
        return  new CommonResult(ResultUtil.SUCCESS.getCode(),ResultUtil.SUCCESS.getMessage(),data);
    }
    public static <T> CommonResult success(String message,T data){
        return  new CommonResult(ResultUtil.SUCCESS.getCode(),message,data);
    }

    /**
     * 响应失败
     * @return 状态码500
     */
    public static CommonResult failed(){
        return new CommonResult(ResultUtil.FAILED.getCode(),ResultUtil.FAILED.getMessage());
    }

    public static CommonResult failed(String message){
        return new CommonResult(ResultUtil.FAILED.getCode(),message);
    }
    /**
     * 参数验证失败
     * @return 状态码 400
     */
    public static CommonResult validateFailed(){
        return new CommonResult(ResultUtil.VALIDATE_FAILED.getCode(),ResultUtil.VALIDATE_FAILED.getMessage());
    }

    /**
     * 未认证
     * @return 状态码401
     */
    public static CommonResult unathorizedFailed(){
        return new CommonResult(ResultUtil.UNAUTORIZED.getCode(), ResultUtil.UNAUTORIZED.getMessage());
    }

    /**
     * 未授权
     * @return 状态码403
     */
    public static CommonResult forbiddenFailed(){
        return new CommonResult(ResultUtil.FORBIDDEN.getCode(),ResultUtil.FORBIDDEN.getMessage());
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}


