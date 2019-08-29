import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println(HubLauncher.hub.getConsoleURL());	
		resp.getWriter().println(HubLauncher.hub.getWebDriverHubRequestURL());	
		resp.getWriter().println(req.getParameter("connect"));	
		resp.getWriter().println(req.getRemoteAddr());			
	}

}
