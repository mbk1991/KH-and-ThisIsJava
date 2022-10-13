package com.kh.junspring.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class AroundLog {
	
	@Pointcut("execution(* com.kh.junspring..*Impl.*(..))")
	public void allPointCut() {}
	
	@Around("allPointCut()")
	public Object aroundLogs(ProceedingJoinPoint pp) throws Throwable{
		//ProceedingJoinPoint는 JoinPoint를 상속받아 구현된 인터페이스
		//ProceedingJoinPoint를 사용하는 이유는 advice가 실행되는 시점을
		//프로그래밍 하기 위해서임.
		
		StopWatch stopWatch = new StopWatch();
		//start
		stopWatch.start();
		Object obj = pp.proceed();
		System.out.println("w");
		//stop
		stopWatch.stop();
		System.out.println("2번실행되나?");
		//메소드가 실행되는 시간 출력
		String methodName = pp.getSignature().getName();
		
		System.out.println(methodName + "()메소드 수행에 걸린시간 : "+stopWatch.getTotalTimeMillis()+"(ms)");
		
		
		return obj;
		
	}
}
