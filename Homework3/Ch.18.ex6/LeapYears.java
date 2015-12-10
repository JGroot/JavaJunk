// Write a generic class with a type parameter constrained to any type 
// that implements Comparable. The constructor should accept an
// array of such objects. The class should have methods that return 
// the highest and lowest values in the array. Demonstrate the 
// class in an application.


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.io.*;

public class LeapYears extends Application
{
   public static void main(String args[])
   {
     launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      String[] years = {"1999", "2022", "1973", "1733"};
      Stuff<String> leapYears = new Stuff<String>(years);
      String highestYear = leapYears.GetHighestThing(years);
      String lowestYear = leapYears.GetLowestThing(years);
      String strYears = "";
      
      for (int i = 0; i < years.length; i++)
         strYears += years[i] + ", ";
      
      primaryStage.setTitle("Programming Challange 6, Chapter 18");
      
      GridPane grid = new GridPane();
      grid.setHgap(10);
      grid.setVgap(10);
      grid.setPadding(new Insets(25, 25, 25, 25));
      Scene scene = new Scene(grid, 350, 200);
      
      Text scenetitle = new Text("The years are " + strYears.substring(0, strYears.length() - 2));
      scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 14));
      grid.add(scenetitle, 0, 0, 2, 1);
      
      Label lblhighest = new Label("Highest year:");
      grid.add(lblhighest, 0, 1);
      
      final Text txtHighest = new Text();
      grid.add(txtHighest, 1, 1);
      
      Label lblLowest = new Label("Lowest year:");
      grid.add(lblLowest, 0, 2);
     
      final Text txtLowest = new Text();
      grid.add(txtLowest, 1, 2);
      
      Button button = new Button("Press for years");
      HBox hbBtn = new HBox(12);
      hbBtn.getChildren().add(button);
      grid.add(hbBtn, 1, 4);

      button.setOnAction(new EventHandler<ActionEvent>()
      {
         @Override
         public void handle(ActionEvent e)
         {
            //txtHighest.setFill(Color.FIREBRICK);
            txtHighest.setText(highestYear.toString());
            txtLowest.setText(lowestYear.toString());
         }
      });
      
      primaryStage.setScene(scene);
      primaryStage.show();



   }
}
