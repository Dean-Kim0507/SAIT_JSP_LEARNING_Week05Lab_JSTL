

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ShoppingListServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         HttpSession session = request.getSession();
         String action ="";
         action = request.getParameter("logout");
         if(action != null){
         session.invalidate();
         session = request.getSession();
         }
         
         getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        ArrayList<String> list = new ArrayList<>();
        String listTable="";
        String action ="";
         action = request.getParameter("register");
         
        if(action.equals("Regist name") &&request.getParameter("userName")!=null){
        session.setAttribute("userName", request.getParameter("userName"));
        getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
        }
        
        else if (action.equals("add")) {
        list.add(request.getParameter("add"));
        list = (ArrayList<String>) session.getAttribute("list");
        session.setAttribute("list", list);
        
        
        
        }
    }

    

}
