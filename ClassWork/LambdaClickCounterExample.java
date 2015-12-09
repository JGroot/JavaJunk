import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import java.util.*;

public class LambdaClickCounterExample extends Application 
{
 
   
   @Override
   public void start(Stage stage)
   {
      Label label = new Label("0");
      Button button = new Button("Just Buttoning here");
      
     button.setOnAction(
         event ->
         {
            int count = Integer.parseInt(label.getText());
            count++;
            label.setText(String.valueOf(count));
         });
           
   
      VBox pane = new VBox();
      pane.setAlignment(Pos.CENTER);
      pane.getChildren().addAll(label, button);
      
      stage.setScene(new Scene(pane, 200, 80));
      stage.setTitle("Count?");
      stage.show();
   }
   
     public static void main(String[] args)
   {
      launch(args);
   }
}