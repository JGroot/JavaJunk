import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.geometry.Insets;


public class NestedLabell1 extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      BorderPane border = new BorderPane();
    
      
      Button button1 = new Button("Button 1");
      Button button2 = new Button("Button 2");
      HBox hbox = new HBox();
      hbox.setAlignment(Pos.CENTER);
      hbox.setSpacing(15);
      hbox.getChildren().addAll(button1, button2);
      
      Label label = new Label("This is a label");
      VBox vbox = new VBox();
      vbox.setAlignment(Pos.CENTER);
      vbox.getChildren().addAll(label);
  
      
      border.setTop(vbox);
      border.setMargin(vbox, new Insets (15, 15, 15, 15));
      border.setCenter(hbox);
      border.setMargin(hbox, new Insets (0, 0, 40, 0));
    
      
      Scene scene = new Scene(border, 200, 100);
 
      primaryStage.setScene(scene);
      primaryStage.setTitle("Title");
      primaryStage.show();
   }
}