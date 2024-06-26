package PacoteJava;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author heito
 */
@WebServlet(name = "RandomServelet", urlPatterns = {"/random.html"})
public class RandomServelet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             int n = 6;
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RandomServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h2>N�meros Rand�micos</h2>" );
            out.println("<table border='1'>" );
            out.println("<tr>" );
            out.println("<th>Posi��o</th> <th>N�mero</th>" );
            out.println("</tr>" );
           for (int i=1; i<=n; i++)
           {
            out.println("<tr>" );   
            out.println("<th> " + i+ " </th>" );
            int b = ((int)(60*Math.random()));
            
            if (b != 0){
               out.println("<th> " + b+ " </th>" ); 
            }
            
            out.println("</tr>" );
           }
           out.println("</table>" );
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
