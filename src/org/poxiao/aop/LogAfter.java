package org.poxiao.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfter implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("后置通知。。。"+"目标对象"+target+","+"方法名"+method.getName()+","+"方法参数"+args.length+","+"返回值"+returnValue);
		
	}
	

}
