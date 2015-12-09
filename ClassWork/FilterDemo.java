import java.util.ArrayList;
import java.util.function.*;

public class FilterDemo
{
   public static void main(String[] args)
   {
      String[] names = {"Butternut", "Buttersquash", "Butterscotch", "Butter"};
      ArrayList<String> nameList = new ArrayList<>();
      for (String name : names)
      {
         nameList.add(name);
      }
      
       Predicate<String> filter = x -> x.length() <= 7;
       
       nameList.removeIf(filter);
       System.out.println(nameList);
   }
}