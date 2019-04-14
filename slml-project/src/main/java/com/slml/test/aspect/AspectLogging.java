package com.slml.test.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectLogging {
	
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 
	 * @param joinPoint
	 */
	@Before("execution(* com.slml.test.*.*.*(..))")
	public void before(JoinPoint joinPoint) {
		logger.info("Entering this Method>>>>>>>>>>>>  " + joinPoint.getSignature().getName());
		
	}
	
	@After("execution(* com.slml.test.*.*.*(..))")
	public void after(JoinPoint joinPoint) {
		logger.info("Exiting this Method>>>>>>>>>>>>>>> " + joinPoint.getSignature().getName());
	}
	
	@AfterThrowing("execution(* com.slml.test.services.*.*(..))")
	public void afterthrowing(JoinPoint joinPoint ) {
		
	}
}
