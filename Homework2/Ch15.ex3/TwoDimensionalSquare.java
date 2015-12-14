/*
      Jessica Groot
      11/27/2015
      Chapter 15, Challenge 3
      Java II
      
      Write a program that takes a positive integer
      n and displays the first n^2 integers in row
      order in an n x n square. Write the program
      in such a way that it works for different 
      values of n by changing only one line in your
      code. 
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

public class TwoDimensionalSquare extends Application 
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
     // number to change ///
      int baseNumber = 10;
     ///////////////////////
      primaryStage.setTitle("SquareX2");
      GridPane grid = new GridPane();
      
      int topNumber = baseNumber * baseNumber;
      int txtboxCounter = 1;
      int rowlimit = baseNumber;
      int rowCount = 0;
      int columnCount = 0;
      
      while (baseNumber <= topNumber)
      {
         for (int i = 0; i < rowlimit; i++)
         {
            TextField txtbox = new TextField(Integer.toString(txtboxCounter));
            txtbox.setPrefWidth(40);
            grid.add(txtbox, columnCount, rowCount);
            columnCount++;
            txtboxCounter++;
            baseNumber++;
         }
         columnCount = 0;
         rowCount++;
      }
      Scene scene = new Scene(grid, 40 * rowCount, 25 * rowCount);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}