import java.sql.*;
import java.util.Scanner;

public class CoffeeMinPrice
{
   public static void main(String[] args)
   {
      double minPrice;
      int CoffeeCount = 0;
      
      final String DB_URL = "jdbc:derby:CoffeeDB-Fall2015";
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter the minimum price: ");
      minPrice = keyboard.nextDouble();
      
      try
      {
         Connection conn = DriverManager.getConnection(DB_URL);
         Statement statement = conn.createStatement();
         String sqlquery = "SELECT * FROM Coffee WHERE Price <= " + 
                           Double.toString(minPrice);
         ResultSet result = statement.executeQuery(sqlquery);
         
         while (result.next())
         {
            System.out.printf("%25s %10s %5.2f\n", result.getString("Description"),
                           result.getString("ProdNum"), result.getDouble("Price"));
            CoffeeCount++;
         }  
         
         System.out.println(CoffeeCount + " coffees found.");
         conn.close();
      }
      catch (Exception ex)
      {
         System.out.println("Error; " + ex.getMessage());
      }
   }
}