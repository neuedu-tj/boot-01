package me.exception;

import me.enums.ResultEnum;

public class StuException extends RuntimeException{

    private Integer code;

    public StuException() {
    }

    public StuException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
