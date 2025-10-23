import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page6")
public class RndSrvX6_2025 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest rq_u900, HttpServletResponse rs_v611)
            throws ServletException, IOException {
        String u9m_val = rq_u900.getParameter("u9m");
        rs_v611.setContentType("text/html");
        PrintWriter writer = rs_v611.getWriter();
        printContent(writer, u9m_val);
        writer.flush();
    }

    private void printContent(PrintWriter writer, String u9m_val) {
        writer.println("<!doctype html>");
        writer.println("<html><head><meta charset='utf-8'/>");
        writer.println("<title>Seite Sechs</title>");
        writer.println("<style>body{font-family:Arial;margin:2rem}.box{border:1px solid #ccc;padding:.5rem 1rem;border-radius:6px;display:inline-block;margin:.25rem 0}table{border-collapse:collapse;margin-top:.5rem}td,th{border:1px solid #ddd;padding:.4rem .6rem}</style>");
        writer.println("</head><body>");
        writer.println("<h1>Seite Sechs</h1>");
        writer.println("<p>Kleine Demo. Unten etwas eingeben und absenden.</p>");
        writer.println("<form method='get' action='page6'>");
        writer.println("Eingabe: <input type='text' name='u9m'/> ");
        writer.println("<button type='submit'>Anzeigen</button>");
        writer.println("</form>");
        writer.println("<hr/>");
        writer.println("<div class='box'><strong>Aktuell:</strong> " + u9m_val + "</div>");
        writer.println("<h2>Kleine Liste</h2>");
        writer.println("<ul><li>K</li><li>L</li><li>M</li></ul>");
        writer.println("<h2>Kleine Tabelle</h2>");
        writer.println("<table><tr><th>ID</th><th>Wert</th></tr><tr><td>01</td><td>Alpha</td></tr><tr><td>02</td><td>Beta</td></tr></table>");
        writer.println("<p class='box'>„Lesen macht Spaß.“</p>");
        writer.println("<p style='margin-top:1rem'><a href='page6'>Zurück (GET)</a></p>");
        writer.println("</body></html>");
    }
}
