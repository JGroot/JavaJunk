import java.io.*;

public class BinaryFileEOFDetection
{
   public static void main(String[] args)
   {
      try
      {
         ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("numbers.dat"));
         
         int num;
         System.out.println("REading");
         try
         {
            while(true)
            {
               num = inputStream.readInt();
               System.out.println(num);
            }
         }
         catch (EOFException e)
         {
            System.out.println("Oooops1");
         }
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