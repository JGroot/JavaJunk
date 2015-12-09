import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;


public class NestedLayout1 extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage stage)
   {
       GridPane grid = new GridPane();
       grid.setAlignment(Pos.CENTER);
       grid.setHgap(10);
       grid.setPadding(new Insets(25, 25, 25, 25));
       grid.setVgap(10);
       
       Label label = new Label("This is a label");
       Button button = new Button("Button 1");
       Button button2 = new Button("Button 2");
       grid.add(label, 0, 0, 2, 1);
       grid.add(button, 0, 1);
       grid.add(button2, 1, 1);
     
             
       Scene scene = new Scene(grid, 300, 80);
       stage.setScene(scene);
       stage.setTitle("Nested Layout");
       stage.show();
   }
}