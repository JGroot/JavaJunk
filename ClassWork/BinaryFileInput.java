import java.io.*;

public class BinaryFileInput
{
   public static void main(String[] args)
   {
      try
      {
         ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("numbers.dat"));
         
         System.out.println("Loading....");
         int n1 = inputStream.readInt();
         int n2 = inputStream.readInt();
         
         System.out.println("Reading...");
         System.out.println(n1);
         System.out.println(n2);
         inputStream.close();
      
      }
      catch (FileNotFoundException ex)
      {
         System.out.println("404");
      }
      catch (IOException e)
      {
         System.out.println("no output");
      }
   }


}