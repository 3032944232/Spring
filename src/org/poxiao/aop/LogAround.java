package org.poxiao.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAround implements MethodInterceptor{

	Object result = null;
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		try {
			
			
			
			System.out.println("����ʵ�ֵ�ǰ��֪ͨ....");
			
			/*����invocation.proceed();֮ǰ��ǰ��֪ͨ��
			֮���Ǻ���֪ͨ��catch�����쳣֪ͨ��
				ͬʱҲ�ǵ���addStudent
			 */
			result = invocation.proceed();
			
			
			System.out.println("����ʵ�ֵĺ���֪ͨ....");
			System.out.println("ͨ������invocationʵ��һЩ����Ŀ��"+"Ŀ�����"+invocation.getThis()+"���õķ�����"+invocation.getMethod().getName()+"�����Ĳ���"+invocation.getArguments().length
					+"�����ķ���ֵ"+result);
		} catch (Exception e) {
			System.out.println("����ʵ�ֵ��쳣֪ͨ...");
			
			
		}
		return result;
	}

}
