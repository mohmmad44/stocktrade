package com.slml.test.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectLogging {
	
	@Before("execution(* com.slml.test.services.*.*(..))")
	public void before(JoinPoint joinPoint) {
		
	}
	
	@After("execution(* com.slml.test.services.*.*(..))")
	public void after(JoinPoint joinPoint) {
		
	}
	
	@AfterThrowing("execution(* com.slml.test.services.*.*(..))")
	public void afterthrowing(JoinPoint joinPoint ) {
		
	}
}
