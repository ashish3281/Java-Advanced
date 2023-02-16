

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class att1
 */
public class att1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public att1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		/*Application scope
		ServletContext sc=getServletContext();
		sc.setAttribute("name","SAITM");
		pw.println("welcome user, Click on below link to  get  your <br>");
         pw.println("<a href='att2'>Click</a>");
		*/
		
		
		//Request scope
		request.setAttribute("name", "SAITMING");
		pw.println("welcome user,Click on below link to get your name<br>");
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/att2");
		rd.include(request, response);
		
		
		/*HttpSession
		String name=request.getParameter("UserName");
		String password=request.getParameter("password");
		pw.print("hello "+name);
		pw.print("  Your password is: "+password);
		HttpSession session=request.getSession();
		session.setAttribute("uname", name);
		session.setAttribute("upass",password );
		pw.print("<a <br> href='att2'>view details</a>");
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
