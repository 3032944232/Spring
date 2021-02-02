package org.poxiao.service.impl;

import org.poxiao.dao.impl.StudentDaoImpl;
import org.poxiao.entity.Student;
import org.poxiao.service.IStudentService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class StudentServiceImpl implements IStudentService {
	StudentDaoImpl studentdao ; 
	
	public void setStudentdao(StudentDaoImpl studentdao) {
		this.studentdao = studentdao;
	}
	
	@Transactional(readOnly=false,propagation = Propagation.REQUIRED)
	public void addStudent(Student student ) {
		//if(�Ƿ���)
		//��������
		
		
		//(�����쳣֪ͨ)
//		studentdao = null;
		
		
		studentdao.addStudent(student);
	}
	@Override
	public void deleteStudnetByNo(int stuNO) {
		System.out.println("ģ��ɾ��");
		
	}
	

}
