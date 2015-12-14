/*
      Jessica Groot
      11/27/2015
      Chapter 15, Challenge 6
      Java II
      
      Write a program that displays 2 buttons in
      a horizontal box. The first button should 
      be labeled 'White', the second is labeled
      'Yellow'. Clicking the 'White' button 
      changes the background color of the 
      horizontal box to white, while clicking on
      the 'Yellow' button changes the color of 
      the horizontal box to yellow. 
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

public class ColorChangingButtons extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      primaryStage.setTitle("Color Changing Buttons");
      HBox hbox = new HBox();
      hbox.setPadding(new Insets(20, 20, 20, 20));   
      hbox.setSpacing(20);
      hbox.setAlignment(Pos.CENTER); 
      
      Button btnwhite = new Button("White");
      btnwhite.setPrefWidth(80);
      btnwhite.setPrefHeight(60);
      btnwhite.setStyle("-fx-font-size: 12pt;");
      btnwhite.setOnAction(new EventHandler<ActionEvent>()
      {
         @Override
         public void handle(ActionEvent e)
         {
            hbox.setStyle("-fx-background-color: WHITE;");
         }
      });
      
      Button btnyellow = new Button("Yellow");
      btnyellow.setPrefWidth(80);
      btnyellow.setPrefHeight(60);
      btnyellow.setStyle("-fx-font-size: 12pt;");
      btnyellow.setOnAction(new EventHandler<ActionEvent>()
      {
         @Override
         public void handle(ActionEvent e)
         {
            hbox.setStyle("-fx-background-color: YELLOW;");
         }
      });
      
      hbox.getChildren().addAll(btnwhite, btnyellow);
      
      Scene scene = new Scene(hbox, 250, 200);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}  