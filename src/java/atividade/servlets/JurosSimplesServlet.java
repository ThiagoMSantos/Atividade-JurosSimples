package atividade.servlets;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Thiago
 */
@WebServlet(urlPatterns = {"/Calculos"})
public class JurosSimplesServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
	response.setContentType("text/html");
	response.setCharacterEncoding("GBK");
	PrintWriter out = response.getWriter();
        
	double valPresente = Double.valueOf(request.getParameter("valPresente"));
	double taxJuros = Double.valueOf(request.getParameter("taxJuros"));
        int tmpMeses = Integer.valueOf(request.getParameter("tmpMeses"));
        
        double vf = valPresente * (1 + (taxJuros * tmpMeses));
        
	// output calculation results
        out.print("<br><a>Valor Presente: </a>"+ valPresente +"<br>");
        out.print("<br><a>Meses: </a>"+ tmpMeses +"<br>");
        out.print("<br><a>Taxa de juros: </a>"+ taxJuros +"<br>");
	out.print("<br><a>VF: </a>"+ vf +"<br>");
        out.print("<br><a href='index.jsp'>Index</a>");
	out.flush();
	out.close();
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Servlet para cálculo de juros simples.";
    }// </editor-fold>

}
