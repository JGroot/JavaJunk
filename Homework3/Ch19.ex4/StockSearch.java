/*
      Jessica Groot
      12/07/2015
      Chapter 19, Challenge 4
      Java II

      Chapter 9 presented a Stock class that holds 
      information about a stock. (See Section 9.4— 
      The toString Method) Write a class that keeps 
      Stock objects in a Map. The class should be 
      able to retrieve a particular Stock object 
      from the Map by searching on its stock symbol.
      Demonstrate the class in an application.
 
*/

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.event.*;
import java.util.*;

public class StockSearch extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      primaryStage.setTitle("CH 19, EX 4");         
      Stock apple = new Stock("AAPL", 113.18);
      Stock banana = new Stock("BNAA", 50.23);
      Stock watermelon = new Stock("WTMN", 34.22);
      Stock orange = new Stock("ORNG", 23.76);
      Stock kiwi = new Stock("KIWI", 34.53);
      Stock mango = new Stock("MNGO", 15.89);
      Stock date = new Stock("DATE", 43.01);
      Stock melon = new Stock("MLON", 5.36);
      
      HashMap<String, Stock> stockMap = new HashMap<String, Stock>();

      stockMap.put(apple.getSymbol(), apple);
      stockMap.put(banana.getSymbol(), banana);
      stockMap.put(watermelon.getSymbol(), watermelon);
      stockMap.put(orange.getSymbol(), orange);
      stockMap.put(kiwi.getSymbol(), kiwi);
      stockMap.put(mango.getSymbol(), mango);
      stockMap.put(date.getSymbol(), date);
      stockMap.put(melon.getSymbol(), melon);
      
      GridPane grid = new GridPane();
      grid.setHgap(10);
      grid.setVgap(10);
      grid.setPadding(new Insets(25, 25, 25, 25));

      TextField txtSearch = new TextField();
      grid.add(txtSearch, 0, 1);
          
      Button btnSearch = new Button("Search");
      grid.add(btnSearch, 1, 1);
      
      Label lblSearch = new Label("Enter stock symbol");
      grid.add(lblSearch, 0, 0);
      
      Text txtResult = new Text("");
      txtResult.setFill(Color.RED);
      grid.add(txtResult, 0, 3);

       btnSearch.setOnAction(new EventHandler<ActionEvent>()
      {
         @Override
         public void handle(ActionEvent e)
         {
            String userEntry = txtSearch.getText();
            if (stockMap.containsKey(userEntry))
            {
               Stock userStock = stockMap.get(userEntry);
               System.out.println(userStock.getSymbol());
               txtResult.setText(userStock.toString());
            }
            else
               txtResult.setText(userEntry + " was not found");
               
         }
      });
      
      Scene scene = new Scene(grid, 275, 150);
      primaryStage.setScene(scene);
      primaryStage.show();


   }

}