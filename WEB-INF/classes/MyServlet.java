import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/hello")
public class MyServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Imposta il tipo di contenuto della risposta
        response.setContentType("text/html");
        
        // Ottiene un oggetto PrintWriter per scrivere la risposta
        PrintWriter out = response.getWriter();
        
        // Scrive il corpo della risposta
        out.println("<html>");
        out.println("<head><title>Hello Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Hello, world!</h1>");
        out.println("<p>This is a simple servlet example.</p>");
        out.println("</body></html>");
    }
}
