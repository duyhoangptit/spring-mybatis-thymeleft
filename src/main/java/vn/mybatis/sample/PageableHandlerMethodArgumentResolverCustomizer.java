/**
 * 
 */
package vn.mybatis.sample;

import org.springframework.data.web.PageableHandlerMethodArgumentResolver;

/**
 * @author Hoang
 *
 *         Mar 17, 2019
 */
@FunctionalInterface
public interface PageableHandlerMethodArgumentResolverCustomizer {

	/**
	 * Customize the given {@link PageableHandlerMethodArgumentResolver}.
	 *
	 * @param pageableResolver
	 *            the {@link PageableHandlerMethodArgumentResolver} to customize,
	 *            will never be {@literal null}.
	 */
	void customize(PageableHandlerMethodArgumentResolver pageableResolver);
}