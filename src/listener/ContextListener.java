package listener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {
    public ContextListener() {
    }

    public void contextDestroyed(ServletContextEvent arg0)  { 
    	 System.out.println("web Ӧ������  ");
    }

    public void contextInitialized(ServletContextEvent arg0)  { 
    	System.out.println("web Ӧ�ó�ʼ�� ");
    }
	
}
