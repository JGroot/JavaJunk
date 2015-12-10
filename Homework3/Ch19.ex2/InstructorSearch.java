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
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.event.*;

public class InstructorSearch extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage stage)
   {
      HashSet<Instructor> instructors = new HashSet<Instructor>();
      addInstructors(instructors);

   }
   
   private void addInstructors(HashSet instructors)
   {
      instructors.add(new Instructor("Captain", "America", "324D"));
      instructors.add(new Instructor("Amazing", "Spiderman", "4342"));
      instructors.add(new Instructor("Green", "Goblin", "1342"));
      instructors.add(new Instructor("Black", "Widow", "2522"));
      instructors.add(new Instructor("Incredible", "Hulk", "3455"));
      instructors.add(new Instructor("Wonder", "Woman", "1421"));
      instructors.add(new Instructor("Scarlett", "Witch", "231C"));
      instructors.add(new Instructor("Silver", "Surfer", "4223"));

   }
}