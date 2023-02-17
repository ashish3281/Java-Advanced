

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class http2
 */
public class http2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public http2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		
//	    pw.println("eg of servlet config and context");
//	    System.out.println("servlet cotext object"+ getServletContext());
//	    System.out.println("servlet config object"+ getServletConfig());
	    
/*	    
		ServletContext sc=getServletContext();
		pw.println("response from http2:-"+sc.getInitParameter("Univ Name"));
	
*/

		/*
	    ServletContext sc=getServletContext();
	    ServletConfig sc1=getServletConfig();
	    System.out.println("servlet context object"+ sc);
	    System.out.println("servlet config object"+ sc1);
	    pw.println("response from http2:-"+sc.getInitParameter("Univ Name"));
	    pw.println("response from http2:-"+sc1.getInitParameter("college name"));
 
 */
	    		
	    
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
