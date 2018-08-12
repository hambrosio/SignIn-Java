
import enterprise.app.controller.LoginUser;
import enterprise.app.dao.PersonDAO;
import enterprise.app.model.Person;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Main
{

   private final PersonDAO objP = new PersonDAO();
   
   
   public static void main(String[] args) throws SQLException
   {
      PersonDAO oP = new PersonDAO();
      // oP.validatePerson("'32311999", "456");
   }
}
