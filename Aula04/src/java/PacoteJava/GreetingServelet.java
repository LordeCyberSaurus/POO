
package PacoteJava;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.time.LocalTime;

/**
 *
 * @author heito
 */
@WebServlet(name = "GreetingServelet", urlPatterns = {"/greeting.html"})
public class GreetingServelet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GreetingServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            int horaAtual = LocalTime.now().getHour();
            
           if (horaAtual >= 6 && horaAtual < 12)
            {
                 out.println("<h1> Agora s�o " +horaAtual+ " horas. Bom dia </h1>");
            }
           else if (horaAtual >= 12 && horaAtual < 18 )
           {
               out.println("<h1> Agora s�o " +horaAtual+ " horas. Boa tarde </h1>");
           }
           else if (horaAtual >= 18 && horaAtual < 23 )
           {
               out.println("<h1> Agora s�o " +horaAtual+ " horas. Boa noite </h1>");
           }
           else
           {
               out.println("<h1> Agora s�o " +horaAtual+ " horas.  V� dormir </h1>");
           }
         
            
            out.println("<h3><a href='index.html'> voltar</a></h3>" );
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
