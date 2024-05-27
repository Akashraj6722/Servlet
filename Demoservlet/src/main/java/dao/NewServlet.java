package dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Details;
import util.Crud;

@WebServlet("/NewServlet")
public class NewServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        switch (action) {
            case ("delete"):
                int deleteID = Integer.parseInt(request.getParameter("clear"));
                System.out.println(deleteID);
                try {
                    Crud.delete(deleteID);
                } catch (ClassNotFoundException | SQLException e) {
                    e.printStackTrace();
                    // Handle error gracefully
                }
                
                try {
    				ArrayList<Details> dl=Crud.read();
    				request.setAttribute("rs", dl);
    			} catch (ClassNotFoundException | SQLException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
                break;
            case("add"):
                add(request, response);
			try {
				ArrayList<Details> dl=Crud.read();
				request.setAttribute("rs", dl);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                break;
                
            case ("update"):
            
//          request.getRequestDispatcher("UpdateForms.jsp").forward(request, response);

            String name = request.getParameter("userName");
            String phone = request.getParameter("phone");
             String mail = request.getParameter("mail");
             int id=Integer.parseInt(request.getParameter("id"));

       
           Details details = new Details(name,phone,mail,id);	
           
           try {
               Crud.update(name, phone, mail, id);
           } catch (ClassNotFoundException | SQLException e) {
               e.printStackTrace();
               
           }
            	
//            request.getRequestDispatcher("forms.jsp").forward(request, response);

            	
            try {
				ArrayList<Details> dl=Crud.read();
				request.setAttribute("rs", dl);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            	
            	
            	
            
            
            	
            default:
               
                break;
        }
        request.getRequestDispatcher("FormFile.jsp").forward(request, response);
    }

//    private void update(HttpServletRequest request, HttpServletResponse response) {
//    	 String name = request.getParameter("userName");
//         String phone = request.getParameter("phone");
//          String mail = request.getParameter("mail");
//    
//        Details details = new Details(name,phone,mail,id);	
//        
//        try {
//            Crud.update(name, phone, mail, id);
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//            
//        }
//	}

	private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("userName");
        String phone = request.getParameter("phone");
        String mail = request.getParameter("mail");

        Details details = new Details();
        details.setId(0);
        details.setName(name);
        details.setPhone(phone);
        details.setMail(mail);

        try {
            Crud.insert(details);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	
    	
    	
    }
}
