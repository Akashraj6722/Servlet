package com.chainsys.dao;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.model.Info;
import com.chainsys.util.Crud;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
       Info info =new Info();
		
	    String name=request.getParameter("Lname");
	    String Pass=request.getParameter("Lpass");
	    
//	    info.setName(name);
//	    info.setPass(Pass);
	    System.out.println("do get");
	    try {
			Crud.search(name, Pass);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	   try {
		if(Crud.search(name, Pass)) {
			   
			   HttpSession session = request.getSession();	
			   Cookie cookie=new Cookie("Uname", name);
			   
			   
//			   session.setAttribute("lg", session);
			   
			    request.getRequestDispatcher("Succes.jsp").forward(request, response);
		   }
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Info info =new Info();
		
	    String name=request.getParameter("uname");
	    String phone=request.getParameter("phone");
	    String Pass=request.getParameter("pass");
	    
	    info.setName(name);
	    info.setPhone(phone);
	    info.setPass(Pass);
	    
	    try {
			Crud.insert(info);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    request.getRequestDispatcher("LogIn.jsp").forward(request, response);
	    
	    
	    
	    
	    
		
	}

}
