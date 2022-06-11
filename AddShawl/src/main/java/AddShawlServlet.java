import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class AddShawlServlet
 */
@WebServlet("/AddShawlServlet")
public class AddShawlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddShawlServlet() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charsey=UTF-8");
		PrintWriter out = response.getWriter();
		
		//retrieve
		String name = request.getParameter("user");
		String brand = request.getParameter("brand");
		String color = request.getParameter("color");
		String material = request.getParameter("material");
		double price = Double.parseDouble(request.getParameter("price"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		
		//print as a response
		out.println("<!DOCTYPE html><html><body>");
		out.println("Name: " + name + "<br>");
		out.println("Brand: " + brand + "<br>");
		out.println("Color: " + color + "<br>");
		out.println("Material: " + material + "<br>");
		out.println("Price: " + price + "<br>");
		out.println("Quantity: " + quantity + "<br>");
		out.println("</body></html>");
	}

}
