package com.gestion.service.api.to;


public class ErrorMessage {

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorMessage(){

    }

    public ErrorMessage(String code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "ErrorMessage [code=" + code + ", message=" + message + "]";
    }
}
