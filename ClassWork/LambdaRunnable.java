public class LambdaRunnable
{
   public static void main(String[] args)
   {
      Runnable r = 
         () -> System.out.println("in a lambda expression");
         
      r.run();
   }
}