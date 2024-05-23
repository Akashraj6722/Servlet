package dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Details;
import util.Crud;

/**
 * Servlet implementation class NewServlet
 */
@WebServlet("/NewServlet")
public class NewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Details details=new Details();
//	ArrayList<Details> array=new ArrayList<>();
       
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	     
	     String choose= request.getParameter("action");
			
			switch(choose){
				
			case("delete"):
				
				int deleteID=Integer.parseInt(request.getParameter("deleteThis"));
			
			     try {
					Crud.delete(deleteID);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			     System.out.println("deleted row"+deleteID);
					
					
				break;
			case "add":
				
					
			}
			
			request.getRequestDispatcher("FormFile.jsp").forward(request, response);

	     
	     
	     
	     
	        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		String choose= request.getParameter("action");
		
		switch(choose){
			
		case("delete"):
			
			int deleteID=Integer.parseInt(request.getParameter("deleteThis"));
		
		     try {
				Crud.delete(deleteID);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     System.out.println("deleted row"+deleteID);
				
				
			break;
				
		}
		
		request.getRequestDispatcher("FormFile.jsp").forward(request, response);

			
			
		

}
	
	protected synchronized void name(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			Crud crud = new Crud();
			 request.setAttribute("rs",Crud.read());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
    
     request.getRequestDispatcher("FormFile.jsp").forward(request, response);

	}
	protected synchronized void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 String name = request.getParameter("userName");
	     String phone = request.getParameter("phone");
	     String mail = request.getParameter("mail");
	     
			System.out.println(name);

	     details.setName(name);
	     details.setPhone(phone);
	     details.setMail(mail);
	     
//	     Details details=new Details(name,phone1,mail);
//	     
//	     array.add(details);
//	     
//	     request.setAttribute("values", array);
//	     request.getRequestDispatcher("NewTable.jsp").forward(request, response);

	     
	     
	     try {
	    	 
			Crud.insert(details);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
