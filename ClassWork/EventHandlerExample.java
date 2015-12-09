import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

import javafx.scene.control.Label;
import javafx.scene.control.Button;




public class EventHandlerExample extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   @Override
   public void start(Stage stage)
   {
      Label label = new Label("Go on, I dare you.");
      Button button = new Button("I am Groot.");
      button.setOnAction(new SimpleEventHandler());
      VBox vbox = new VBox();
      vbox.setAlignment(Pos.CENTER);
      vbox.getChildren().addAll(label, button);
      Scene scene = new Scene(vbox, 300, 80);
      stage.setScene(scene);
      stage.setTitle("Hey Hey Hey");
      stage.show();
      stage.show();
   }
}

 class SimpleEventHandler implements EventHandler<ActionEvent>
{
    public static void handle(ActionEvent event)
   {
      JOptionPane.showMessageDialog(null, "I am Groot.");;
   }


}