package me.enums;

public enum ResultEnum {
    UNKONW_ERROR(-1, "UNKOWN_ERROR"),
    SUCCESS(1 , "OK"),
    OVERAGE(2 , "OverAge")  ,
    TOOYOUNG(3 , "tooYoung");

    private Integer code;
    private String msg;

    ResultEnum() {
    }

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
