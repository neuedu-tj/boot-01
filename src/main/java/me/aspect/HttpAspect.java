package me.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);
    
    @Pointcut("execution(public * me.controller.EmpController.*(..))")
    public void empsPointCut(){

    }

    @Before("empsPointCut()")
    public void log(JoinPoint joinPoint) {

        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        
        logger.info("url = {}" , request.getRequestURL());

        logger.info("method = {}" , request.getMethod());
        logger.info("ip = {}" , request.getRemoteAddr());

        logger.info("invoked method = {}" , joinPoint.getSignature().getDeclaringTypeName() +"."+ joinPoint.getSignature().getName() );

        logger.info("args = {}" , joinPoint.getArgs());
    }


    //get return data                                                               
    @AfterReturning(returning = "object" , pointcut = "empsPointCut()")
    public void getAfterReturning(Object object){
        logger.info("response = {}" , object);
    }
}
