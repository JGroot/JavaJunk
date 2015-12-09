import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class IteratorDemo
{
   public static void main(String[] args)
   {
      String[] names = {"Butternut", "Buttersquash", "Butterscotch", "Butter"};
      ArrayList<String> nameList = new ArrayList<>();
      for (String name : names)
      {
         nameList.add(name);
      }
      
      Consumer<String> action = 
         x ->
         {
            System.out.printf("%s\n", x);
         };
      
      Iterator<String> list = nameList.iterator();
      
      while(list.hasNext())
      {
         String name = list.next();
         System.out.printf("%s %d\n", name, name.length());
         if (name.equals("Butterscotch"))
         {
            list.forEachRemaining(action);
         }
      }  
   }
}