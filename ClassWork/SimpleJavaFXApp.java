import javafx.application.Application;
import javafx.stage.Stage;

public class SimpleJavaFXApp extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage stage)
   {
      stage.setTitle("Look!");
      stage.show();
   }
}