package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 注解Listener示例, 使用时需删除web.xml
 */
@WebListener
public class AnnotationListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("init..............");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
