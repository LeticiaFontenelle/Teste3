
package com.mycompany.teste3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mundo")
public class OlaServlet extends HttpServlet {

   
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
           PrintWriter out = resp.getWriter(); 
           out.println("Olá, mundo!");
            
        }
    }

   