import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("product");
        Float price = Float.parseFloat(request.getParameter("price"));
        Integer percent = Integer.parseInt(request.getParameter("percent"));
        Float amount = (price * percent) / 100;
        Float discount = price - amount;

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<h1>Product Description: " + product + "</h1>");
        writer.println("<h1>Price: " + price + "</h1>");
        writer.println("<h1>Discount Percent: " + percent + "</h1>");
        writer.println("<h1>Discount Almount: " + amount + "</h1>");
        writer.println("<h1>Discount Price: " + discount + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
