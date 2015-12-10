// Write a generic class with a type 
// parameter constrained to any type 
// that implements Comparable. 
// The constructor should accept an
//  array of such objects. The class 
//  should have methods that return 
//  the highest and lowest values 
//  in the array. Demonstrate the 
//  class in an application.


public class Stuff<E extends Comparable<E>>
{
   private E[] _genericArray;
   
   public Stuff(E[] genericArray)
   {
      _genericArray = genericArray;
   }
      
   public E[] getStuff()
   {
      return _genericArray;
   }
   
   public <E extends Comparable<E>> E GetHighestThing(E[] genericArray)
   {
      E highestThing = genericArray[0];
      
      for (E thing : genericArray)
      {
         if (thing.compareTo(highestThing) > 0)
         {
            highestThing = thing;
         }
      }
      
      return highestThing;
   }
   
    public <T extends Comparable<T>> T GetLowestThing(T[] genericStuff)
   {
      T lowestThing = genericStuff[0];
      
      for (T thing : genericStuff)
      {
         if (thing.compareTo(lowestThing) < 0)
         {
            lowestThing = thing;
         }
      }
      
      return lowestThing;
   }


}