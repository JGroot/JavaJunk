import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXHelloWorld extends Application 
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      Button button = new Button();
      button.setText("Say 'Hello World'");
      button.setOnAction(new EventHandler<ActionEvent>()
      {
         @Override
         public void handle(ActionEvent event)
         {
            System.out.println("Hello World!");
         }
      });
      StackPane root = new StackPane();
      root.getChildren().add(button);
      Scene scene = new Scene(root, 300, 250);
      primaryStage.setTitle("Hello Wolrd!");
      primaryStage.setScene(scene);
      primaryStage.show();
   }

}