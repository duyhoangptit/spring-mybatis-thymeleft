package vn.mybatis.sample.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.data.domain.PageRequest;

import vn.mybatis.sample.builder.EmployeeSqlBulder;
import vn.mybatis.sample.dto.Employee;

@Mapper
public interface EmployeeMapper {

	@Select("SELECT * FROM employee")
	List<Employee> findAll();

	@SelectProvider(type = EmployeeSqlBulder.class, method = "buildSqlSearchEmployeeByOption")
	// custom properties and column -> @Results({@Result(property = "id", column =
	// "musicId")})
	List<Employee> searchEmployee(@Param("page") PageRequest page, final String option,
			@Param("condition") final String condition, @Param("sortColumn") final String sortColumn,
			@Param("sortType") final String sortType);

}
