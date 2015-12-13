/*
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
import java.util.*;


public class InstructorHashSetSearch 
{
     public static void main(String[] args)
   {
     HashSet<Instructor> instructors = new HashSet<Instructor>();
     
      instructors.add(new Instructor("Captain", "America", "324D"));
      instructors.add(new Instructor("Amazing", "Spiderman", "4342"));
      instructors.add(new Instructor("Green", "Goblin", "1342"));
      instructors.add(new Instructor("Black", "Widow", "2522"));
      instructors.add(new Instructor("Incredible", "Hulk", "3455"));
      instructors.add(new Instructor("Wonder", "Woman", "1421"));
      instructors.add(new Instructor("Scarlett", "Witch", "231C"));
      instructors.add(new Instructor("Silver", "Surfer", "4223"));

     Iterator iterator = instructors.iterator();
    
    while (iterator.hasNext())
    {
      Instructor current = new Instructor((Instructor)(iterator.next()));
      System.out.println(current.toString() + "\n");
    }
    
      Instructor newGuy = new Instructor("Hulk", "She", "341E");

      System.out.println("Searching for Instructor She Hulk in instructor HashSet....");
     
     Iterator iterator2 = instructors.iterator();
     boolean found = false;
     while (iterator2.hasNext())
     {
        System.out.println("......................................");
        Instructor current = new Instructor((Instructor)(iterator2.next()));
        if (current.equals(newGuy))
        {
           found = true;
           System.out.println("She Hulk was found in the HashSet");
        }
        if (found)
           break;
     }
       if (found == false)
            System.out.println("She Hulk was not found in the HashSet");
   }
 }