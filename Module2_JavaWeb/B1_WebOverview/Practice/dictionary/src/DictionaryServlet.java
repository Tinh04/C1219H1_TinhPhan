import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DictionaryServlet", urlPatterns = "/translate")
public class DictionaryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("book", "sach");
        dictionary.put("pen", "but muc");
        dictionary.put("pencil", "but chi");
        dictionary.put("ruler", "thuoc ke");
        dictionary.put("bag", "cap xach");

        String keyword = request.getParameter("keyword");

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        String result = dictionary.get(keyword);
        if (result != null) {
            writer.println("<h1>Word: " + keyword + "</h1>");
            writer.println("<br/>");
            writer.println("<h1>Result: " + result + "</h1>");
        } else {
            writer.println("<h1>Not found</h1>");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
