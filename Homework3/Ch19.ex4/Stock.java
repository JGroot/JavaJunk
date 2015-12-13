/*
      Jessica Groot
      12/07/2015
      Chapter 19, Challenge 4
      Java II

      Chapter 9 presented a Stock class that holds 
      information about a stock. (See Section 9.4— 
      The toString Method) Write a class that keeps 
      Stock objects in a Map. The class should be 
      able to retrieve a particular Stock object 
      from the Map by searching on its stock symbol.
      Demonstrate the class in an application. 
*/

public class Stock
{
   private String symbol;
   private double shareprice;
   
   public Stock(String sym, double sp)
   {
      symbol = sym;
      shareprice = sp;
   }
   
   public String getSymbol()
   {
      return symbol;
   }
   
   public double getShareprice()
   {
      return shareprice;
   }
   
   public String toString()
   {
      String str = "Trading symbol: " + symbol +
                  "\nShareprice: $" + shareprice;
      return str;
   }
}