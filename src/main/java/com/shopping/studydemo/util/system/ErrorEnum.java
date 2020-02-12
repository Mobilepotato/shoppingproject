package com.shopping.studydemo.util.system;

public enum ErrorEnum {
    /**
     * 错误信息
     */
    E_501("501","请求路径不存在"),
    E_500("500", "POST/GET请求方法错误"),
    E_400("400","参数类型不匹配"),
    E_123321("123321","用户名错误");


    private String errorCode;
    private String errorMsg;

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    ErrorEnum(String errorCode, String errorMsg){
        this.errorCode=errorCode;
        this.errorMsg=errorMsg;

    }

}
