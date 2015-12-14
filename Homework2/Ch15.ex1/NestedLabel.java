
/*
      Jessica Groot
      11/29/2015
      Chapter 15, Challenge 1
      Java II
      Write a program that creates the layout of Figure 15-12
*/
import java.util.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.collections.*;

public class NestedLabel extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   } 
   
   @Override
   public void start(Stage primaryStage)
   {
       primaryStage.setTitle("Nested Layout");
       
       BorderPane border = new BorderPane();
       FlowPane flowpane = new FlowPane();
       flowpane.setAlignment(Pos.CENTER);
       flowpane.setHgap(10);
       flowpane.setVgap(10);
       
       Label label = new Label("This is a label");
       HBox hbox = new HBox();
       hbox.setAlignment(Pos.CENTER);
       hbox.setPadding(new Insets(20, 0, 0, 0));
       hbox.getChildren().add(label);
          
       Button btn1 = new Button("Button 1");
       Button btn2 = new Button("Button 2");
       flowpane.getChildren().addAll(btn1, btn2);
       border.setTop(hbox);
       border.setCenter(flowpane);
       Scene scene = new Scene(border, 250, 100);
       primaryStage.setScene(scene);
       primaryStage.show();
   } 
}

