import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Pattern;

@WebServlet(urlPatterns = "/")
public class CalcServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/CalcPage.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Pattern pattern = Pattern.compile("(\\-?)(\\d+)");
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        String sign = req.getParameter("sign");
        if (pattern.matcher(num1).matches() && pattern.matcher(num2).matches()) {
            Calculator calculator = new Calculator();
            int numOne = Integer.parseInt(num1);
            int numTwo = Integer.parseInt(num2);
            req.setAttribute("result", calculator.calculate(numOne, numTwo, sign));

        } else {
            req.setAttribute("result", "Numbers should have digit format and field can't be empty!");
        }
        getServletContext().getRequestDispatcher("/pages/CalcPage.jsp").forward(req, resp);
    }
}
