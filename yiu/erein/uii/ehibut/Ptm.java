import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/book2")
public class Ptm extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest rqstXy9127, HttpServletResponse respAb7710)
            throws ServletException, IOException {
        String qz9_p = rqstXy9127.getParameter("qz9");
        respAb7710.setContentType("text/html");
        PrintWriter writer = respAb7710.getWriter();
        printContent(writer, qz9_p);
        writer.flush();
    }

    private void printContent(PrintWriter writer, String vval_mk77) {
        writer.println("<!doctype html>");
        writer.println("<html><head><meta charset='utf-8'/>");
        writer.println("<title>Buch Seite 2</title>");
        writer.println("<style>");
        writer.println("body{font-family:Arial;margin:2rem}");
        writer.println(".box{border:1px solid #ccc;padding:.5rem 1rem;border-radius:6px;display:inline-block;margin:.25rem 0}");
        writer.println("table{border-collapse:collapse;margin-top:.5rem}");
        writer.println("td,th{border:1px solid #ddd;padding:.4rem .6rem}");
        writer.println("</style>");
        writer.println("</head><body>");
        writer.println("<h1>Buch Seite 2</h1>");
        writer.println("<p>Kleine Demo-Seite mit ein bisschen Inhalt. Trage unten etwas ein und sende.</p>");

        writer.println("<form method='get' action='book2'>");
        writer.println("Eingabe: <input type='text' name='qz9'/> ");
        writer.println("<button type='submit'>Anzeigen</button>");
        writer.println("</form>");

        writer.println("<hr/>");
        writer.println("<div class='box'><strong>Aktuell:</strong> " + vval_mk77 + "</div>");

        writer.println("<h2>Mini-Tabelle</h2>");
        writer.println("<table>");
        writer.println("<tr><th>Autor</th><th>Beispiel</th></tr>");
        writer.println("<tr><td>Hesse</td><td>Siddhartha</td></tr>");
        writer.println("<tr><td>Goethe</td><td>Faust</td></tr>");
        writer.println("</table>");

        writer.println("<p class='box'>Zitat: „Lesen ist wie Träumen mit offenen Augen.“</p>");

        writer.println("<p style='margin-top:1rem'><a href='book2'>Zurück (GET)</a></p>");
        writer.println("</body></html>");
    }
}
