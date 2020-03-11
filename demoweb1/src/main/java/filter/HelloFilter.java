package filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * 示例filter，拦截/hello/filter/yes的请求，响应filter
 */
public class HelloFilter implements Filter {
    private Logger logger = Logger.getLogger("HelloFilter");

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("正在执行HelloFilter的init方法");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        logger.info("getServletPath: "+ req.getServletPath());// /hello
        logger.info("getRequestURI:" + req.getRequestURI());// /hello/filter/yes
        logger.info("getRequestURL:" + req.getRequestURL()); // http://localhost:8080/hello/filter/yes
        if(req.getRequestURI().startsWith("/hello/filter/yes")){
            //拦截请求
            HttpServletResponse resp = (HttpServletResponse) servletResponse;
            resp.getWriter().write("filter");
            return;
        }
        filterChain.doFilter(servletRequest, servletResponse);

    }

    @Override
    public void destroy() {
        logger.info("正在执行HelloFilter的destroy方法");
    }
}
