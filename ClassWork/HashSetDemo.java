import java.util.*;

public class HashSetDemo
{
   public static void main(String[] args)
   {
      Set<String> nameSet = new HashSet<String>();
      
      nameSet.add("Johnny");
      nameSet.add("Kristal");
      nameSet.add("Joel");
      nameSet.add("Birdman");
      nameSet.add("Sharkwoman");
      
      Iterator itSet = nameSet.iterator();
      
      System.out.println("Look at these here names...");
      while(itSet.hasNext())
      {
         System.out.println(itSet.next());
      }
         System.out.println();
         if (nameSet.contains("Sharkwoman"))
            System.out.println("How did Sharkwoman get in here?");
         else 
            System.out.println("It was a dream.");
           
         if (nameSet.contains("Ronald McDonald"))
            System.out.println("Get that weirdo out of here");
         else 
            System.out.println("Thank Jeebus that Ronald guy isn't here.");
      }
}