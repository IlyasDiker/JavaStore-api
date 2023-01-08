package com.gestion.service.api.validators;

public enum EnumError {
    ;

    private final String value;

    EnumError(String e) { value = e;}

    public String getValue() {
        return value;
    }

    public String getErrorDescription (String description, String data) {
        return String.format(description,data);
    }
}
