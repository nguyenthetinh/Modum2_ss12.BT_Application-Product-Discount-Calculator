import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CulculatorServlet", urlPatterns = "/culculator")

public class CulculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double price =Double.parseDouble(req.getParameter("price"));
        double discount =Double.parseDouble(req.getParameter("discount"));

        double discountAmount = price * (discount *0.1);
        double discountPrice = price - discountAmount;

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");

        writer.println("<h2>Discount Amount: "+ Double.toString(discountAmount) + "</h2>");
        writer.println("<h2>Discount Price:" + Double.toString(discountPrice) + "</h2>");

        writer.println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
