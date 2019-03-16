package vn.mybatis.sample.service;

import vn.mybatis.sample.dto.Student;

public interface StudentService {
	void insertStudent(Student student);

	boolean getStudentByLogin(String userName, String password);

	boolean getStudentByUserName(String userName);
}
