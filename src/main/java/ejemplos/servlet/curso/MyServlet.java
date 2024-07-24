package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Ejemplo HTML desde Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Ejemplo Servlet</h1>");
		out.println("<p>Este es un ejemplo en el curso de Java para generar HTML desde un Servlet.</p>");
		// FORM
		out.println("<form action=\"myServlet2\" method=\"GET\">");
		// NAME
		out.println("<label for=\"fname\">Nombre:</label><br>");
		out.println("<input type=\"text\" id=\"fname\" name=\"fname\" value=\"\"><br>");
		// LAST NAME
		out.println("<label for=\"lname\">Apellidos:</label><br>");
		out.println("<input type=\"text\" id=\"lname\" name=\"lname\" value=\"\"><br><br>");
		// SEND BUTTON
		out.println("<input type=\"submit\" value=\"Enviar\">");
		out.println("</form>");
		out.println("</body></html>");
	}
}