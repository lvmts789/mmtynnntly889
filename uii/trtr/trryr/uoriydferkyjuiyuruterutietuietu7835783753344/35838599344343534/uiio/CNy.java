import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/vvhn3")
public class VnqLkz72R_3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req_zz901, HttpServletResponse resp_pp402)
            throws ServletException, IOException {
        String p9x_value = req_zz901.getParameter("p9x");
        resp_pp402.setContentType("text/html");
        PrintWriter writer = resp_pp402.getWriter();
        printContent(writer, p9x_value);
        writer.flush();
    }

    private void printContent(PrintWriter writer, String val_u77) {
        writer.println("<!doctype html>");
        writer.println("<html><head><meta charset='utf-8'/>");
        writer.println("<title>Seite Drei</title>");
        writer.println("<style>body{font-family:Arial;margin:2rem} .box{border:1px solid #ccc;padding:.5rem 1rem;border-radius:6px;display:inline-block;margin:.25rem 0} td,th{border:1px solid #ddd;padding:.4rem .6rem} table{border-collapse:collapse;margin-top:.5rem}</style>");
        writer.println("</head><body>");
        writer.println("<h1>Seite Drei</h1>");
        writer.println("<p>Kurze Demo mit etwas Inhalt. Unten etwas eingeben und absenden.</p>");
        writer.println("<form method='get' action='page3'>");
        writer.println("Eingabe: <input type='text' name='p9x'/> ");
        writer.println("<button type='submit'>Anzeigen</button>");
        writer.println("</form>");
        writer.println("<hr/>");
        writer.println("<div class='box'><strong>Aktuell:</strong> " + val_u77 + "</div>");
        writer.println("<h2>Kleine Liste</h2>");
        writer.println("<ul><li>Eins</li><li>Zwei</li><li>Drei</li></ul>");
        writer.println("<h2>Kleine Tabelle</h2>");
        writer.println("<table><tr><th>A</th><th>B</th></tr><tr><td>Alpha</td><td>Beta</td></tr><tr><td>Gamma</td><td>Delta</td></tr></table>");
        writer.println("<p class='box'>Zitat: „Mehr lesen, mehr wissen.“</p>");
        writer.println("<p style='margin-top:1rem'><a href='page3'>Zurück (GET)</a></p>");
        writer.println("</body></html>");
    }
}
