import java.io.Serializable;

public class SomeClassSerializable implements Serializable
{
   public static void main(String[] args)
   {
     private int num;
     private char letter;
     
     public SomeClassSerializable()
     {
      num = 0;
      letter = "A";
     }
     
     public SomeClassSerializable(int theNum, char theLet)
     {
      num = theNum;
      let = theLet;
     }
     
     public String toString()
     {
      return ("Number " + num + " and Letter " + letter;
     }   
   }
   