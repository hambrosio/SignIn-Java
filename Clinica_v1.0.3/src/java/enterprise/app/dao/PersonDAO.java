package enterprise.app.dao;

import enterprise.app.controller.LoginUser;
import enterprise.app.model.Person;
import enterprise.app.utils.ConnectToDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

   private Connection openConnectToDb;
   private PreparedStatement pStmt;
   private ResultSet rSet;
   private boolean status = false;

   // --- agregar una persona  ---
   // Person objPerson
   public boolean validatePerson(String cedula, String clave) throws SQLException
   {
      try
      {
         this.openConnectToDb = ConnectToDb.getConnectionToDb();
         String sqlQuery = "call signin(?,?);";
         //String sqlQuery = "select cedula, clave from usuarioSesion where cedula=? and clave=?;";
         this.pStmt = openConnectToDb.prepareStatement(sqlQuery);

         //this.pStmt.setString(1, objPerson.getCedula());
         //this.pStmt.setString(2, objPerson.getClave());
         
         this.pStmt.setString(1, cedula);
         this.pStmt.setString(2, clave);
         this.rSet = pStmt.executeQuery();
         status = rSet.next();
      } 
      catch(SQLException e){}
   
   return status;      
   }
     
}
