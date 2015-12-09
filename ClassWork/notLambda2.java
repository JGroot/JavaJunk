public class notLambda2
{
   public static void main(String[] args)
   {
      Runnable r = new Runnable()
      {
         public void run()
         {
            System.out.println("weeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
         }
      };
      
      r.run();
   }
}