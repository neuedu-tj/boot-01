package me.exception.handler;

import me.exception.StuException;
import me.exception.util.ResultUtil;
import me.vo.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;




@ControllerAdvice
public class StuExceptionHandler {


    public static final Logger logger = LoggerFactory.getLogger(StuExceptionHandler.class);

    @ExceptionHandler(value = StuException.class)
    public @ResponseBody Result handler(StuException e) {
        return ResultUtil.error( e.getCode() , e.getMessage());
    }

}
