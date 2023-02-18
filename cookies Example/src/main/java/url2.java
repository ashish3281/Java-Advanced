

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class url2
 */
public class url2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public url2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		try {
			response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		    String address=request.getParameter("address");
		    String name=request.getParameter("name");  
		      
		    out.print("<form action='url3?name="+name+"&address="+address+"' method='post'>");
		    out.print("Enter education detail:<br/>");
		    out.print("Education:<input type='text' name='education'/><br/>");
		    out.print("<input type='submit' value='go'/>");
		    out.print("</form");
		    out.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
	}

}
