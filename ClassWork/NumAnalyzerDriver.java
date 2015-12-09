

public class NumAnalyzerDriver
{
   public static void main(String[] args)
   {
      Integer[] numbers = (new Integer(44), new Integer(77), new Integer(11),
                        new Integer(99), new Integer(55), new Integer(22));
      
      NumAnalyzer<Integer> analyzer = new NumbAnalyzer<>(numbers);
      
      System.out.println("The highest value is: " + analyzer.getHighest());
      System.out.println("The lowest value is: " + analyzer.getLowest());
      System.out.println("The average value is: " + analyzer.getAverage());
      System.out.println("The total value is: " + analyzer.getTotal());
   }

}