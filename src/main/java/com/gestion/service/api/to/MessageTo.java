package com.gestion.service.api.to;

import java.io.Serializable;

public class MessageTo implements Serializable {

    private Integer code;
    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
