import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hghee")
public class QwErTy_5599 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest rq_aa77, HttpServletResponse rs_bb88)
            throws ServletException, IOException {
        String t7k_val = rq_aa77.getParameter("t7k");
        rs_bb88.setContentType("text/html");
        PrintWriter writer = rs_bb88.getWriter();
        printContent(writer, t7k_val);
        writer.flush();
    }

    private void printContent(PrintWriter writer, String t7k_val) {
        writer.println("<!doctype html>");
        writer.println("<html><head><meta charset='utf-8'/>");
        writer.println("<title>Seite Fünf</title>");
        writer.println("<style>body{font-family:Arial;margin:2rem}.box{border:1px solid #ccc;padding:.5rem 1rem;border-radius:6px;display:inline-block;margin:.25rem 0}table{border-collapse:collapse;margin-top:.5rem}td,th{border:1px solid #ddd;padding:.4rem .6rem}</style>");
        writer.println("</head><body>");
        writer.println("<h1>Seite Fünf</h1>");
        writer.println("<p>Kleine Demo. Unten etwas eingeben und absenden.</p>");
        writer.println("<form method='get' action='page5'>");
        writer.println("Eingabe: <input type='text' name='t7k'/> ");
        writer.println("<button type='submit'>Anzeigen</button>");
        writer.println("</form>");
        writer.println("<hr/>");
        writer.println("<div class='box'><strong>Aktuell:</strong> " + t7k_val + "</div>");
        writer.println("<h2>Kleine Liste</h2>");
        writer.println("<ul><li>A</li><li>B</li><li>C</li></ul>");
        writer.println("<h2>Kleine Tabelle</h2>");
        writer.println("<table><tr><th>Key</th><th>Val</th></tr><tr><td>X</td><td>10</td></tr><tr><td>Y</td><td>20</td></tr></table>");
        writer.println("<p class='box'>„Mehr lesen, mehr lernen.“</p>");
        writer.println("<p style='margin-top:1rem'><a href='page5'>Zurück (GET)</a></p>");
        writer.println("</body></html>");
    }
}
