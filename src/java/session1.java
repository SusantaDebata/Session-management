/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author susanta debata
 */
public class session1 extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try
        {
          PrintWriter out=response.getWriter();
          
          String name=request.getParameter("t1");
          out.println("Welcome!!"+name);
          HttpSession session=request.getSession();
          session.setAttribute("n",name);
          out.println("<a href='session2'> click it Again</a>");
        }
        catch(Exception e)
        {
            
        }
        
    }

   
   
}
