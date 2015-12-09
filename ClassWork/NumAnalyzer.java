


public class NumAnalyzer<T extends Number>
{
   private T[] array;

   /**
      Constructor
      @param values An array of values
      @throws IllegalArgumentException if values is null or contains no elements
   */
   
   public NumAnalyzer(T[] values)
   {
      if (values == null || values.length < 1)
         throw new IllegalArgumentException();
      
      array = values;
   }
   
   public T getHighest()
   {
      for (int index = 1; index < array.length; index++)
      {
         if (array[index].doubleValue() > highest.doubleValue())
            highest = array[index];
      }
      
      return highest;
   }
   
   public T getLowest()
   {
      for (int index = 1; index < array.length; index++)
      {
         if (array[index].doubleValue() < lowest.doubleValue())
            lowest = array[index];
      }
      
      return lowest;
   }
   
   public double getTotal()
   {
      double total = 0;
      
      for (index = 0; index.array.length; index++)
         total += array[index].doubleValue();
      
      return total;
   }
    
   public double getAverage()
   {
      return getTotal() / array.length;
   }
}