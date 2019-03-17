/**
 * 
 */
package vn.mybatis.sample.paging;

import java.util.List;

import org.springframework.data.domain.Page;

/**
 * @author Hoang
 *
 *         Mar 17, 2019
 */
public interface ListPage<T> extends Page<T>, List<T> {

}
