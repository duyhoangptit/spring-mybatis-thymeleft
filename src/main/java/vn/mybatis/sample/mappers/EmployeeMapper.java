package vn.mybatis.sample.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import vn.mybatis.sample.dto.Employee;

@Mapper
public interface EmployeeMapper {

	@Select("SELECT * FROM employee")
	List<Employee> findAll();
}
