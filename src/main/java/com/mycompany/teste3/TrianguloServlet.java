
 package com.mycompany.teste3;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/triangulo")
public class TrianguloServlet extends HttpServlet {
   
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
            resp.setContentType("text/html"); // essa parte não tinha - foi add
            PrintWriter out = resp.getWriter();

            String linhas = req.getParameter("linhas");
  
            out.printf("%s linhas de estrelas%n%n", linhas);
            int n = Integer.parseInt(linhas);
            for(int i = 1; i <= n; i++) {
             for(int j = 1; j <= i; j++) {                  
               out.println("*");         
       }
              out.println("<br/>");         
              //pode ser de outras formas também
    }
            
  }
}