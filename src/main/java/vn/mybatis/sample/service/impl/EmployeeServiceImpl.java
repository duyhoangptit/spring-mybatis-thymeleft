package vn.mybatis.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.mybatis.sample.dto.Employee;
import vn.mybatis.sample.mappers.EmployeeMapper;
import vn.mybatis.sample.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public List<Employee> findAll() {
		return employeeMapper.findAll();
	}

}
