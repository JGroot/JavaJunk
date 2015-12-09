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

public class Login extends Application 
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      primaryStage.setTitle("Welcome");
      
      GridPane grid = new GridPane();
      grid.setHgap(10);
      grid.setVgap(10);
      grid.setPadding(new Insets(25, 25, 25, 25));
      Scene scene = new Scene(grid, 300, 200);
      
      Text scenetitle = new Text("Welcome Title");
      scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
      grid.add(scenetitle, 0, 0, 2, 1);
      
      Label userName = new Label("User name:");
      grid.add(userName, 0, 1);
      
      TextField userTextField = new TextField();
      grid.add(userTextField, 1, 1);
      
      Label password = new Label("Password:");
      grid.add(password, 0, 2);
      
      TextField passwordField = new TextField();
      grid.add(passwordField, 1, 2);
      
      Button button = new Button("Sign In");
      HBox hbBtn = new HBox(10);
      hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
      hbBtn.getChildren().add(button);
      grid.add(hbBtn, 1, 4);

      final Text actiontarget = new Text();
      grid.add(actiontarget, 1, 6);
      button.setOnAction(new EventHandler<ActionEvent>()
      {
         @Override
         public void handle(ActionEvent e)
         {
            actiontarget.setFill(Color.FIREBRICK);
            actiontarget.setText("Sign in button pressed");
         }
      });
      
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}