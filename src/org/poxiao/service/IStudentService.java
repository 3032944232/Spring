package org.poxiao.service;

import org.poxiao.entity.Student;

public interface IStudentService {
	void addStudent(Student student );
	
	void deleteStudnetByNo(int stuNO);
}
