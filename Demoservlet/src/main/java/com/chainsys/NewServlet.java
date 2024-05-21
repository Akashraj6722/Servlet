package com.chainsys;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewServlet
 */
@WebServlet("/NewServlet")
public class NewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Details details=new Details();
	ArrayList<Details> array=new ArrayList<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 String name = request.getParameter("userName");
	     String phone = request.getParameter("phone");
	     int phone1=Integer.parseInt(phone);
	     String mail = request.getParameter("mail");
	     
	     details.setName(name);
	     details.setPhone(phone1);
	     details.setMail(mail);
	     
	     Details details=new Details(name,phone1,mail);
	     
	     array.add(details);
	     
	     request.setAttribute("values", array);
	     
	     request.getRequestDispatcher("NewTable.jsp").forward(request, response);
	     
	     
	     
	     
	     try {
			CRUD.insert(details);
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
		doGet(request, response);
	}

}
