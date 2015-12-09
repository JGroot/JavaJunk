import java.util.ArrayList;

public class ArrayListHungerGames
{
   public static void main(String[] args)
   {
      ArrayList<String> tributes = new ArrayList<String>();
      
      tributes.add("Becky");
      tributes.add("Mr. Ed");
      tributes.add("Princess Leia");
      tributes.add("Scooby Doo");
      tributes.add("Space Ghost - Coast to Coast");
      
      for (int index = 0; index < tributes.size(); index++)
         System.out.println("Index:  " + index + " Name: " + tributes.get(index));
         
      tributes.add(tributes.size() - 1, "Maxwell");
      
      System.out.println("\nMaxwell got added to the end");
      
      System.out.println("\nThe size of the arrayList = " + tributes.size());
      String deceased;
      int deceasedIndex;
      deceasedIndex = (int)(Math.random() * tributes.size());
      deceased = tributes.remove(deceasedIndex);
      for (int index = 0; index < tributes.size(); index++)
         System.out.println("Index:  " + index + " Name: " + tributes.get(index));
      System.out.println(deceased + " bit the bullet!");

      
   }
}