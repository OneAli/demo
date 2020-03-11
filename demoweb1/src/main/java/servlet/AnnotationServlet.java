package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

/**
 * 注解servlet示例, 使用时需删除web.xml
 */
@WebServlet(urlPatterns = {"/anno/servlet"})
public class AnnotationServlet extends HttpServlet {
    private Logger logger = Logger.getLogger("AnnotationServlet");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("正在处理请求 - " + req.getServletPath());
        PrintWriter out = resp.getWriter();
        out.write("ok");
        out.flush();
        out.close();
    }

}
