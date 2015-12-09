import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class JavaFXHelloWorld extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage stage)
   {
      Label label = new Label("Hey there");
      Scene scene = new Scene(label, 300, 80);
      stage.setTitle("Hey Hey Hey");
      stage.show();
   }
}