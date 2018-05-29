package filter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class FirstFilter
 */
@WebFilter("/FirstFilter")
public class FirstFilter implements Filter {
    public FirstFilter() {
    }
    
	public void destroy() {
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		String ip = req.getRemoteAddr();
		String url = req.getRequestURI().toString();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = new Date();
		String date = sdf.format(d);
		System.out.println(date+" "+ ip + "ทรฮสมห" + url);
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		 System.out.println("First Filter init()");
	}

}
