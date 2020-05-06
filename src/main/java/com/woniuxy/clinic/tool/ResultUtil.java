package com.woniuxy.clinic.tool;

public enum ResultUtil {
	SUCCESS(200L,"操作成功"),
    FAILED(500L,"操作失败"),
    VALIDATE_FAILED(400L,"参数验证失败"),
    UNAUTORIZED(401L,"未认证或token过期"),
    FORBIDDEN(403L,"未授权");
    private Long code;
    private String message;

    ResultUtil(Long code, String message) {
        this.code = code;
        this.message = message;
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

}
