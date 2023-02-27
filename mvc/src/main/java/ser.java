

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ser
 */
public class ser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String t1=request.getParameter("t1");
		String t2=request.getParameter("t2");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		m1class bean=new m1class();
		bean.setUsername(t1);
		bean.setPassword(t2);
		request.setAttribute("bean", bean);
        boolean status=bean.validate();
        if(status) {
           RequestDispatcher rd=request.getRequestDispatcher("final.jsp");
           rd.forward(request, response);
        }
        else {
        	RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
        }
	}

}
