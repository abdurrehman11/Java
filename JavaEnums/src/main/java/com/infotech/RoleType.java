package com.infotech;

public enum RoleType {

    ADMIN(2001, "This is admin"),
    DEV(2002, "This is dev"),
    MANAGER(2003, "This is manager"),
    HR(2004, "This is HR");

    private int code;
    private String message;

    RoleType(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
