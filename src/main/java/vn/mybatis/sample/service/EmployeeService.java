package vn.mybatis.sample.service;

import java.util.List;

import vn.mybatis.sample.dto.Employee;

public interface EmployeeService {
	List<Employee> findAll();
}
