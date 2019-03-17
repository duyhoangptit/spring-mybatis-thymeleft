package vn.mybatis.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.mybatis.sample.dto.Student;
import vn.mybatis.sample.mappers.StudentMapper;
import vn.mybatis.sample.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;

	@Override
	@Transactional
	public void insertStudent(Student student) {
		studentMapper.insertStudent(student);
	}

	@Override
	public boolean getStudentByLogin(String userName, String password) {
		Student student = studentMapper.getStudentByUserName(userName);

		if (student != null && student.getPassword().equals(password)) {
			return true;

		}

		return false;
	}

	@Override
	public boolean getStudentByUserName(String userName) {
		Student student = studentMapper.getStudentByUserName(userName);

		if (student != null) {
			return true;
		}

		return false;
	}

}