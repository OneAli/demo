package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

/**
 * 示例servlet
 */
public class HelloServlet extends HttpServlet {

    private Logger logger = Logger.getLogger("HelloServlet");

    @Override
    public void init() throws ServletException {
        logger.info("正在执行HelloServlet的init方法");
    }

    @Override
    public void destroy() {
        logger.info("正在执行HelloServlet的destroy方法");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       logger.info("正在处理请求 - " + req.getServletPath());
       PrintWriter out = resp.getWriter();
       out.write("success");
       out.flush();
       out.close();
    }

}
