/*
      Jessica Groot
      11/29/2015
      Chapter 15, Challenge 2
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


public class Squares extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      primaryStage.setTitle("Squares");
      
      BorderPane border = new BorderPane();
      
      HBox hbox1 = new HBox();
      hbox1.setPadding(new Insets(20, 20, 0, 20));
      hbox1.setSpacing(5);
      Label label1 = new Label("Number: ");
      TextField txtbox1 = new TextField();
      txtbox1.setPrefWidth(60);
      hbox1.getChildren().addAll(label1, txtbox1);
      
      HBox hbox2 = new HBox();
      hbox2.setPadding(new Insets(10, 20, 20, 20));
      hbox2.setSpacing(5);
      Label label2 = new Label("Square of Number: ");
      TextField txtbox2 = new TextField();
      txtbox2.setPrefWidth(60);
      hbox2.getChildren().addAll(label2, txtbox2);
      
      border.setTop(hbox1);
      border.setCenter(hbox2);
      
      Scene scene = new Scene(border, 220, 100);
      primaryStage.setScene(scene);
      primaryStage.show();    
   }  
}