package life_cycle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/hi",loadOnStartup=0)
public class OurServlet extends HttpServlet {
	
	public OurServlet() {
		System.out.println("OurServlet Conctructor ");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("OurServlet init()...");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Our servlet doPost()..");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Our Servlet service()");
	}
	@Override
	public void destroy() {
		System.out.println("Our Servlet() destroy...");
	}	
}
