package org.poxiao.test;

import org.poxiao.entity.Student;
import org.poxiao.service.impl.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void testAop() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentServiceImpl studentService = (StudentServiceImpl)context.getBean("StudentService");
		Student student = new Student();
		student.setStuNO(1);
		student.setStuName("zs");
		studentService.addStudent(student);
	}
	public static void testAop2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentServiceImpl studentService = (StudentServiceImpl)context.getBean("StudentService");
		studentService.deleteStudnetByNo(1);
	}
	public static void main(String[] args) {
		testAop();
//		testAop2();
		
	}

}
