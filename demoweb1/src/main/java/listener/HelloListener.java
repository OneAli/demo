package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.logging.Logger;

/**
 * 示例listener，监听容器创建和销毁
 */
public class HelloListener implements ServletContextListener {
    private Logger logger = Logger.getLogger("HelloListener");

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        logger.info("正在执行HelloListener的容器创建方法");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger.info("正在执行HelloListener的容器销毁contextDestroyed方法");
    }
}
