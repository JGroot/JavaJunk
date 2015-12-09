import java.util.ArrayList;

public class ForEachDemo
{
   public static void main(String[] args)
   {
      String[] names = {"Groot", "Gillig", "Grooty", "Gilligy"};
      
      ArrayList<String> nameList = new ArrayList<>();
      for (String name : names)
        {
            nameList.add(name);
        }
      
      nameList.forEach(
         x -> { //consumer function
               System.out.printf("%s\n", x, x.length());
               });
   }
}