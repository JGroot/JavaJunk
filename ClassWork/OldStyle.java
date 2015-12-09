class OldStyle implements Runnable
{
   public void run()
   {
      System.out.println("I'm running...");
   }
}
   class notLambda1
   {
      public static void main(String[] args)
      {
         OldStyle r0 = new OldStyle();
         r0.run();
      }
   }
