package org.poxiao.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component("LogAnnotation") //ͨ��ע���������
@Aspect //ͨ��ע����֪ͨ��
public class LogAnnotation {
	//JoinPoint jp �̶�д�����Ի�ȡĿ������һ�ж���
	@Before("execution(public void org.poxiao.service.impl.StudentServiceImpl.addStudent(org.poxiao.entity.Student))")
	public void myBefore(JoinPoint jp) {
		System.out.println("��ע����ʽ��ǰ��֪ͨ Ŀ�����"+jp.getTarget()+",��������"+jp.getSignature().getName()+",����������"+Arrays.toString(jp.getArgs()));
	}
	@AfterReturning( pointcut =  "execution(public void org.poxiao.service.impl.StudentServiceImpl.addStudent(org.poxiao.entity.Student))" ,returning = "returningValue")
	//����з���ֵ����ͨ��jp�ã��̶�д��returningValue,ͬʱ��Ҫ��ע��������returning  =
	public void myAfter(JoinPoint jp,Object returningValue) {
		System.out.println("��ע����ʽ������֪ͨ Ŀ�����"+jp.getTarget()+",��������"+jp.getSignature().getName()+",����������"+Arrays.toString(jp.getArgs())+",����ֵ"+returningValue);
	}
}
