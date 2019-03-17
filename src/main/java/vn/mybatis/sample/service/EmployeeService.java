package vn.mybatis.sample.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;

import vn.mybatis.sample.dto.Employee;

public interface EmployeeService {
	List<Employee> findAll();

	List<Employee> searchEmployee(PageRequest request, final String option, final String condition,
			final String sortColumn, final String sortType);
}
