package enterprise.app.controller;

import enterprise.app.dao.PersonDAO;
import enterprise.app.model.Person;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginUser", urlPatterns = {"/SignIn"})
public class LoginUser extends HttpServlet
{
   // Attributes
   private final Person objPerson = new Person();
   private final PersonDAO objPersonDAO = new PersonDAO();

   // Methods
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException 
   {
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();

      /**
       * Recibe los datos enviados por el form en los parámetros y los almacena
       * en las var cedula y clave */
      String cedula = request.getParameter("_cedula");
      String clave = request.getParameter("_clave");

      objPerson.setCedula(cedula);
      objPerson.setClave(clave);
      //request.setAttribute("per", objPerson);
      
      try {
         if(objPersonDAO.validatePerson(cedula, clave))
         {
            
            RequestDispatcher rSet = request.getRequestDispatcher("Principal");
            rSet.forward(request, response);
         }
         else
         {
            String msgError = "El usuario o la clave son incorrectos";
            request.setAttribute("msgError", msgError);
            request.getRequestDispatcher("index.jsp").forward(request, response);
         }
      }
      catch (SQLException ex) {
         Logger.getLogger(LoginUser.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
}
