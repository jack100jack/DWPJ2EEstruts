import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class HelloServlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("������ʼ���ɹ���");
            response.getWriter().println("������ʼ���ɹ���");

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            response.getWriter().println("<h1>Hello Servlet!</h1>");
            response.getWriter().println(new Date().toLocaleString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
