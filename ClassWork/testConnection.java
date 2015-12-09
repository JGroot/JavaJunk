import java.sql.*;

public class testConnection
{
   public static void main(String[] args)
   {
      final String DB_URL = "jdbc:derby:CoffeeDB";
      
      try
      {
         Connection conn = DriverManager.getConnection(DB_URL);
         System.out.println("Connected to database");
         conn.close();
         System.out.println("Connection closed");
      }
      catch (Exception ex)
      {
         System.out.println("Error");
      }
   }
}