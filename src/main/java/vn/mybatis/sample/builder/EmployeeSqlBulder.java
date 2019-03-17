/**
 * 
 */
package vn.mybatis.sample.builder;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.data.domain.PageRequest;

/**
 * @author Hoang
 *
 *         Mar 17, 2019
 */
public class EmployeeSqlBulder {

	public static String buildSqlSearchEmployeeByOption(PageRequest page, final String option, final String condition,
			final String sortColumn, final String sortType) {
		SQL sql = new SQL();

		sql.SELECT("*").FROM("employee");
		if (option != null) {
			if ("ID".equalsIgnoreCase(option)) {
				sql.WHERE("id = #{condition}");
			} else if ("NAME".equalsIgnoreCase(option)) {
				sql.WHERE("name like #{condition} || '%'");
			} else if ("SALARY".equalsIgnoreCase(option)) {
				sql.WHERE("salary like #{condition} || '%'");
			}
		}
		sql.ORDER_BY("#{sortColumn} #{sortType}");

		String preSql = sql.toString();
		StringBuilder sb = new StringBuilder(preSql);

		sb.append(" limit #{page.start},#{page.size}");
		return sb.toString();
	}
}
