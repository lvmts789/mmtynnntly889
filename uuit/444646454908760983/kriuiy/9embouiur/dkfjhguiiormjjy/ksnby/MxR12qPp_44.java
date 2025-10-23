import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lly")
public class MxR12qPp_44 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest rq_bx100, HttpServletResponse rs_ty200)
            throws ServletException, IOException {
        String r4v_input = rq_bx100.getParameter("r4v");
        rs_ty200.setContentType("text/html");
        PrintWriter writer = rs_ty200.getWriter();
        printContent(writer, r4v_input);
        writer.flush();
    }

    private void printContent(PrintWriter writer, String v_r4v) {
        writer.println("<!doctype html>");
        writer.println("<html><head><meta charset='utf-8'/>");
        writer.println("<title>Seite Vier</title>");
        writer.println("<style>");
        writer.println("body{font-family:Arial;margin:2rem}");
        writer.println(".box{border:1px solid #ccc;padding:.5rem 1rem;border-radius:6px;display:inline-block;margin:.25rem 0}");
        writer.println("table{border-collapse:collapse;margin-top:.5rem}");
        writer.println("td,th{border:1px solid #ddd;padding:.4rem .6rem}");
        writer.println("</style>");
        writer.println("</head><body>");
        writer.println("<h1>Seite Vier</h1>");
        writer.println("<p>Kleine Demo. Unten etwas eingeben und absenden.</p>");

        writer.println("<form method='get' action='page4'>");
        writer.println("Eingabe: <input type='text' name='r4v'/> ");
        writer.println("<button type='submit'>Anzeigen</button>");
        writer.println("</form>");

        writer.println("<hr/>");
        writer.println("<div class='box'><strong>Aktuell:</strong> " + v_r4v + "</div>");

        writer.println("<h2>Liste</h2>");
        writer.println("<ul><li>Eins</li><li>Zwei</li><li>Drei</li></ul>");

        writer.println("<h2>Tabelle</h2>");
        writer.println("<table><tr><th>X</th><th>Y</th></tr><tr><td>1</td><td>2</td></tr><tr><td>3</td><td>4</td></tr></table>");

        writer.println("<p class='box'>„Lesen erweitert den Horizont.“</p>");

        writer.println("<p style='margin-top:1rem'><a href='page4'>Zurück (GET)</a></p>");
        writer.println("</body></html>");
    }
}
