import java.sql.*;

public class ShowCoffee
{
   public static void main(String[] args)
   {
      final String DB_URL = "jdbc:derby:CoffeeDB-Fall2015";
      try
      {
         Connection conn = DriverManager.getConnection(DB_URL);
         Statement statement = conn.createStatement();
         String query = "Select * FROM Coffee";
         ResultSet result = statement.executeQuery(query);
         System.out.println("Coffee found");
         System.out.println("-------------------------");
         
         while (result.next())
         {  
            System.out.printf("%25s %10s %5.2f\n",result.getString("Description"),
               result.getString("ProdNum"), result.getDouble("Price"));
         }
         conn.close();
      }
      catch (Exception ex)
      {
         System.out.println("Error " + ex.getMessage());
      }
      
   }
}