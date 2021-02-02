package org.poxiao.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAround implements MethodInterceptor{

	Object result = null;
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		try {
			
			
			
			System.out.println("环绕实现的前置通知....");
			
			/*在这invocation.proceed();之前是前置通知，
			之后是后置通知在catch中是异常通知，
				同时也是调用addStudent
			 */
			result = invocation.proceed();
			
			
			System.out.println("环绕实现的后置通知....");
			System.out.println("通过参数invocation实现一些方法目标"+"目标对象："+invocation.getThis()+"调用的方法名"+invocation.getMethod().getName()+"方法的参数"+invocation.getArguments().length
					+"方法的返回值"+result);
		} catch (Exception e) {
			System.out.println("环绕实现的异常通知...");
			
			
		}
		return result;
	}

}
