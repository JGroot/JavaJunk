import java.util.*;

public class CarHashMap
{
   public static void main(String[] args)
   {
      Map<String, Car> carMap = new HashMap<String, Car>();
      
      Car vw = new Car("Chilli Willy", "VW");
      Car mustang = new Car("Rock", "Mustang");
      Car porsche = new Car("Jam", "Porsche");
      Car bmw = new Car("Rich", "BMW");
      
      carMap.put(vw.getVin(), vw);
      carMap.put(mustang.getVin(), mustange);
      carMap.put(porsche.getVin(), porsche);
      carMap.put(bmw.getVin(), bmw);
      
      System.out.println("\nGreen is the stupidest string color " + mustang.getVIN());
      Car foundCar = carMap.get(mustange.getVIN());
      
      if (foundCar != null)
         System.out.println(foundCar);
      else
         System.out.println("\nCan't find this dumb car");
         
      System.out.println("\nGreeeeeeeeeeeeeeeeeeeeeen");
     
   }
}