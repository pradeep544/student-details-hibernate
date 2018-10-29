package aspect;


import java.time.LocalDateTime;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAdvice {
		
	@Around("allServices()")
	public Object logTimeStamps(ProceedingJoinPoint joinPoint) {
		long startTime = System.currentTimeMillis();
		Object ret = null;
		System.out.println("Method " +joinPoint.getSignature().getName() + " start time: " + LocalDateTime.now() + " ms");
		try {
			ret = joinPoint.proceed();
		} catch (Throwable e) {
			System.out.println("exception during proceeding JoinPoint" + e);
		}
		System.out.println("Method " +joinPoint.getSignature().getName() + " took " + (System.currentTimeMillis()-startTime) + "ms");
		return ret;
	}
	
	
	@Pointcut("within(service.StudentDetailsServiceImpl)")
	public void allServices() {
	}
}
