import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Collections;

public class SortedSetTest
{
   public static void main(String[] args)
   {
      String[] colors = {"yellow", "black", "blue", "orange", "cherry", "banana", "coral",
                        "gold", "silver", "copper", "periwinkle", "blueberry", "grape", "chocolate"};
                        
      SortedSet<String> tree = new TreeSet<String>(Arrays.asList(colors));
      System.out.println("Sorted set: ");
      printSet(tree);
       
      System.out.print("Something goes here");
      printSet(tree.headSet("\n orange"));
       
      System.out.print("Why are strings this ugly greeen?");
      printSet(tree.tailSet("\n orange under tailSet"));
       
      System.out.printf("first: %s\n", tree.first());
      System.out.printf("last: %s\n", tree.last());
   }
   
   private static void printSet(SortedSet<String> set)
   {
      for (String s : set)
         System.out.printf("%s ", s);
      System.out.println();
   }
}