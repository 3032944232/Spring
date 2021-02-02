package org.poxiao.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component("LogAnnotation") //通过注解放入容器
@Aspect //通过注解变成通知类
public class LogAnnotation {
	//JoinPoint jp 固定写法可以获取目标对象的一切东西
	@Before("execution(public void org.poxiao.service.impl.StudentServiceImpl.addStudent(org.poxiao.entity.Student))")
	public void myBefore(JoinPoint jp) {
		System.out.println("《注解形式》前置通知 目标对象："+jp.getTarget()+",方法名："+jp.getSignature().getName()+",方法参数："+Arrays.toString(jp.getArgs()));
	}
	@AfterReturning( pointcut =  "execution(public void org.poxiao.service.impl.StudentServiceImpl.addStudent(org.poxiao.entity.Student))" ,returning = "returningValue")
	//如果有返回值不能通过jp拿，固定写法returningValue,同时需要在注解中声明returning  =
	public void myAfter(JoinPoint jp,Object returningValue) {
		System.out.println("《注解形式》后置通知 目标对象："+jp.getTarget()+",方法名："+jp.getSignature().getName()+",方法参数："+Arrays.toString(jp.getArgs())+",返回值"+returningValue);
	}
}
