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
import javafx.collections.*;

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
      
      GridPane grid = new GridPane();
      grid.setHgap(10);
      grid.setVgap(10);
      grid.setPadding(new Insets(25, 25, 25, 25));
     
      ObservableList names = FXCollections.observableArrayList();
      ListView listView = new ListView(names);
      Iterator itSet = instructors.iterator();
      while(itSet.hasNext())
         names.add(itSet.next());
      listView.setItems(names);
      listView.setPrefWidth(200);
      listView.setPrefHeight(200);
      grid.add(listView, 0, 0);
      
      TextField txtSearch = new TextField();
      grid.add(txtSearch, 0, 1);
          
      Button btnSearch = new Button("Search");
      grid.add(btnSearch, 1, 1);
      
      Text txtSearchInfo = new Text("Enter name of instructor to begin search");
      grid.add(txtSearchInfo, 0, 2);
           
      btnSearch.setOnAction(new EventHandler<ActionEvent>()
      {
         @Override
         public void handle(ActionEvent e)
         {
            String userEntry = txtSearch.getText();
            Iterator itSet = instructors.iterator();
            boolean isFound = false;
            
            while(itSet.hasNext())
            {
              Instructor current = (Instructor)itSet.next();
              Instructor temp = new Instructor(userEntry, userEntry, userEntry);
             
              if (current.equals(temp))
                 {
                   txtSearchInfo.setText("Found " + userEntry + "!");
                   isFound = true;
                   
                   for (Object name : names)
                     if (current.equals(name))
                     {
                         
                         listView.getSelectionModel().select(names.indexOf(name));
                         listView.getFocusModel().focus(names.indexOf(name));
                         listView.scrollTo(names.indexOf(name));
                     }
                   
                   break;
                 }
             }
            if (isFound == false)
                  txtSearchInfo.setText(userEntry + " was not found.");
         }
      });
      Scene scene = new Scene(grid, 400, 300);
      stage.setScene(scene);
      stage.show();
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