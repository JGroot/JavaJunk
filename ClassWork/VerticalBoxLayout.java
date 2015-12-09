import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class VerticalBoxLayout extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage stage)
   {
      Label label = new Label("Check out my label");
      Button button = new Button("The hardest button to button");
      VBox pane = new VBox();
      pane.setAlignment(Pos.CENTER);
      pane.getChildren().addAll(label, button);
      Scene scene = new Scene(pane, 300, 80);
      stage.setScene(scene);
      stage.setTitle("Hey Hey Hey");
      stage.show();
   }
}