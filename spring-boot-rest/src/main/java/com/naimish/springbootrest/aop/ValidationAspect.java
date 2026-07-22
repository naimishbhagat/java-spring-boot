package com.naimish.springbootrest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Aspect
public class ValidationAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* com.naimish.springbootrest.service.JobService.getJob(..)) && args(id)")
    public Object validateAndUpdate(ProceedingJoinPoint jp, int id) throws Throwable {
        if(id < 0){
            id = -id;
        }
        Object obj = jp.proceed(new Object[]{id});
        return obj;
    }
}
