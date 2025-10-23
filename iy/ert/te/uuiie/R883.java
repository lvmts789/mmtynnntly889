import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/book")
public class R883 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest asfgeutey38394, HttpServletResponse kjdfyue9943)
            throws ServletException, IOException {
        String abcxzv99821 = asfgeutey38394.getParameter("book");
        kjdfyue9943.setContentType("text/html");
        PrintWriter writer = kjdfyue9943.getWriter();
        printContent(writer, abcxzv99821);
        writer.flush();
    }

    private void printContent(PrintWriter writer, String plokm22290) {
        writer.println("<!doctype html>");
        writer.println("<html><head><meta charset='utf-8'/>");
        writer.println("<title>Buch Seite</title>");
        writer.println("<style>body{font-family:Arial;margin:2rem} .box{border:1px solid #ccc;padding:.5rem 1rem;border-radius:6px;display:inline-block}</style>");
        writer.println("</head><body>");
        writer.println("<h1>Buch Seite</h1>");
        writer.println("<p>Gib den Namen eines Buches ein und sende das Formular.</p>");
        writer.println("<form method='get' action='book'>");
        writer.println("Buch: <input type='text' name='book'/> ");
        writer.println("<button type='submit'>Anzeigen</button>");
        writer.println("</form>");
        writer.println("<hr/>");
        writer.println("<div class='box'><strong>Aktuelles Buch:</strong> " + plokm22290 + "</div>");
        writer.println("<p style='margin-top:1rem'><a href='book'>Zurück (GET)</a></p>");
        writer.println("</body></html>");
    }
}
