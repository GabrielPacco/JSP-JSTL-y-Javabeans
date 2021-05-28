package pe.unsa.epcc;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MiServlet
 */
@WebServlet("/helloServlet")
public class MiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String message = request.getParameter("message");
		String numero = request.getParameter("numero");
		String sistema = request.getHeader("USER-AGENT");
		
		datos bienvenida = new datos();
	    Date fecha = new Date();
	    
	    bienvenida.setMessage(message);
		bienvenida.setNumero(numero);
	    
		request.setAttribute("Pag", bienvenida);
		request.setAttribute("fecha", fecha);
		request.setAttribute("sistema", sistema);
		

		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("home.jsp");
				dispatcher.forward(request, response);
				
		/*PrintWriter writer = response.getWriter();
		writer.println("<h1>Hello " + yourName + "</h1>");
		writer.close();*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
