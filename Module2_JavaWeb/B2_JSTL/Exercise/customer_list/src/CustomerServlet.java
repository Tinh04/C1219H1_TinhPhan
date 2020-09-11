import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Customer> list = new ArrayList<>();

//        Customer customer1 = new Customer("Phan Thi My Tinh", "20/08/1995", "Da Nang","photo-5-1466727156094.jpg");
//        Customer customer2 = new Customer("Nguyen Thi Dieu My", "09/09/1997", "Quang Nam", "d56ac90aee7ed6f5bcf48861f7cdb023.jpg");
//        Customer customer3 = new Customer("Nguyen Ha Nguyen", "03/02/1998", "Da Nang", "emma_2_3.jpg" );
//        Customer customer4 = new Customer("Nguyen Huu Tho", "12/06/1999", "Quang Tri", "ze-headshot.jpg");
//        Customer customer5 = new Customer("Tran Van Thuan", "01/04/1999", "Da Nang", "thor.jpg");

        list.add(new Customer("Phan Thi My Tinh", "20/08/1995", "Da Nang","photo-5-1466727156094.jpg"));
        list.add(new Customer("Nguyen Thi Dieu My", "09/09/1997", "Quang Nam", "d56ac90aee7ed6f5bcf48861f7cdb023.jpg"));
        list.add(new Customer("Nguyen Ha Nguyen", "03/02/1998", "Da Nang", "emma_2_3.jpg" ));
        list.add(new Customer("Nguyen Huu Tho", "12/06/1999", "Quang Tri", "ze-headshot.jpg"));
        list.add(new Customer("Tran Van Thuan", "01/04/1999", "Da Nang", "thor.jpg"));

        request.setAttribute("customer", list);

        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}
