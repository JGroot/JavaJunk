/*
      Jessica Groot
      12/07/2015
      Chapter 19, Challange 2
      Java II
      
      Chapter 9 presented an Instructor class that 
      holds information about an instructor.
      (See Section 9.7—Aggregation) Modify the 
      Instructor class by overriding the hashCode
      and equals methods. Then write a class that
      stores several Instructor objects in a
      HashSet. The class should be able to
      display all the instructors in the set, 
      and allow the user to search for an 
      instructor. Demonstrate the class in an
      application.
*/

public class Instructor
{
   private String firstName;
   private String lastName;
   private String officeNumber;
   
   public Instructor(String fn, String ln, String ofnum)
   {
      firstName = fn;
      lastName = ln;
      officeNumber = ofnum;
   }
   
   public Instructor(Instructor object2)
   {
      firstName = object2.firstName;
      lastName = object2.lastName;
      officeNumber = object2.officeNumber;
   }
   
   public void set(String fn, String ln, String ofnum)
   {
      firstName = fn;
      lastName = ln;
      officeNumber = ofnum;
   }
   
   public String toString()
   {
      String str =  "First Name: " + firstName + 
                    "\nLast Name: " + lastName + 
                    "\nOffice Number: " + officeNumber;
      return str;           
       
   }
   
    public int hashCodeFirstName()
   {
      return firstName.hashCode();
   }
   
   public int hashCodeLastName()
   {
      return lastName.hashCode();
   }
   
   public int hashCodeOfficeNumber()
   {
      return officeNumber.hashCode();
   }
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public String getOfficeNumber()
   {
      return officeNumber;
   }
   
   public boolean equals(Object obj)
   {
      if (obj != null && obj instanceof Instructor)
      {
         Instructor temp = (Instructor)obj;
         
         if (officeNumber.equalsIgnoreCase(temp.officeNumber) || 
             firstName.equalsIgnoreCase(temp.firstName) ||
             lastName.equalsIgnoreCase(temp.lastName))
                return true;
         else
                return false;
      }  
      return false;
   }
}