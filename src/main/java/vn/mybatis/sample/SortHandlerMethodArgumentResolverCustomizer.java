/**
 * 
 */
package vn.mybatis.sample;

import org.springframework.data.web.SortHandlerMethodArgumentResolver;

/**
 * @author Hoang
 *
 *         Mar 17, 2019
 */
public interface SortHandlerMethodArgumentResolverCustomizer {

	/**
	 * Customize the given {@link SortHandlerMethodArgumentResolver}.
	 *
	 * @param sortResolver
	 *            the {@link SortHandlerMethodArgumentResolver} to customize, will
	 *            never be {@literal null}.
	 */
	void customize(SortHandlerMethodArgumentResolver sortResolver);
}