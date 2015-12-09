import java.io.*;

public class BinaryFileOutput
{
   public static void main(String[] args)
   {
      try
      {
         ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("numbers.dat"));
         
         int i;
         for (i=0; i<5; i++)
            outputStream.writeInt(i);
            
            System.out.println("You did it!");
            outputStream.close();
      }
      catch (IOException e)
      {
         System.out.println("OOps");
      }
   
   }
   
}
