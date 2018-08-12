package enterprise.app.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDb
{

   private static Connection connectDb = null;
   private static final String DATABASE = "clinica";
   private static final String URLDB = "jdbc:mysql://127.0.0.1:3306/";
   //private static final String URLDB = "jdbc:mysql://127.0.0.1:3306/";
   private static final String DSN = URLDB + DATABASE;
   private static final String LOGINDB = "root";
   private static final String PASSWORDDB = "";
   
   public static Connection getConnectionToDb()
   {
      try {
         if (connectDb == null) {
            Runtime.getRuntime().addShutdownHook(new ShutdownHook()); // ¿?
            Class.forName("com.mysql.jdbc.Driver"); // Habilita el driver 
            connectDb = DriverManager.getConnection(DSN, LOGINDB, PASSWORDDB); // Crea la conexión

         }
         return connectDb; 
      } catch (ClassNotFoundException | SQLException e) {
         throw new RuntimeException("Error al crear la conexion!", e);
      }
   }

   static class ShutdownHook extends Thread {

      @Override
      public void run() {
         try {
            Connection playConnectDb = ConnectToDb.getConnectionToDb();
            playConnectDb.close();
            System.out.println("Conexión cerrada!");
         }
         catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
   }
}
