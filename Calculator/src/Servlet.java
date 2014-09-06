//MA: 100%

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Дамир on 18.02.14.
 */
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String operand = request.getParameter("oper");
        String num1 = request.getParameter("arg1");
        String num2 = request.getParameter("arg2");
        PrintWriter out = response.getWriter();
        Double result = null;
        out.println("<html><body><h1>");
        if(num1 == null && num2 == null) {\
			//MA: NOT WROTE! You use didn't so - didn't write
            out.println("You didn't wrote any numbers");
        }
        else if(num1 != null && num2 == null) {
            try {
                if(operand.equals("sin")) {
                    out.println(Math.sin(Double.valueOf(num1)));
                }
                else if(operand.equals("ln")) {
                    out.println(Math.log(Double.valueOf(num1)));
                } else {
                    out.println("Cant apply this operand to one number");
                }
            } catch (NumberFormatException e) {
                out.println("Wrong number");
            }
        }
        else if(num1 != null && num2 != null) {
            try{
                if(operand.equals("add")) {
                    out.println(Double.valueOf(num1) + Double.valueOf(num2));
                }
                else if(operand.equals("sub")){
                    out.println(Double.valueOf(num1) - Double.valueOf(num2));
                }
                else if(operand.equals("mult")){
                    out.println(Double.valueOf(num1) * Double.valueOf(num2));
                }
                else if(operand.equals("div")){
                    out.println(Double.valueOf(num1) / Double.valueOf(num2));
                }
				//MA: I think, you don't need it for 2 args. It's possible to ignore.
                else if(operand.equals("sin")){
                    out.println(Math.sin(Double.valueOf(num1)));
                }
                else if(operand.equals("ln")){
                    out.println(Math.log(Double.valueOf(num1)));
                } else {
                    out.println("Wrong operand");
                }
            } catch(NumberFormatException e){
                out.println("Wrong number");
            }
        }
        out.println("</h1></body></html>");
        out.close();
    }
}
