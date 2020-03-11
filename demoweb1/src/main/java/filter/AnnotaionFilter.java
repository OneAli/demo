package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * 注解Filter示例,使用时需删除web.xml
 */
@WebFilter(urlPatterns = {"/anno/filter"})
public class AnnotaionFilter implements Filter {
    private Logger logger = Logger.getLogger("AnnotaionFilter");

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("正在执行AnnotaionFilter的doFilter方法");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
