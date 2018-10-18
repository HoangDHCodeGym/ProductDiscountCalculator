import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountServlet", urlPatterns = "/returnDiscount")
public class ProductDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        String listPriceStr = request.getParameter("listPrice");
        String discountPercentStr = request.getParameter("discountPercent");
        double listPrice = Double.parseDouble(listPriceStr);
        double discountPercent = Double.parseDouble(discountPercentStr);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if (discountPercent>0 && discountPercent<100) {
            double discountedPrice = listPrice * (100 - discountPercent) / 100;
            writer.println("<h1> New discounted price is:" + discountedPrice + "</h1");
        } else {
            writer.println("<h1> Unable to calculate the discounted price </h1>");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
