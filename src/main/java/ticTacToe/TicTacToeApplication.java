package ticTacToe;

import ticTacToe.domain.GameButton;
import ticTacToe.logic.Game;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class TicTacToeApplication extends Application {
    
    @Override
    public void start(Stage window) {
        
        //creating new game object
        Game game = new Game();

        //creating a main layout
        BorderPane layout = new BorderPane();

        //creating layout for buttons
        GridPane buttons = new GridPane();
        
        //Creating laber showing a turn
        Label turn = new Label("Turn: " + game.getPlayer());
        turn.setFont(Font.font("Monospaced", 40));

        //creating buttons
        Button but1 = new Button(" ");
        but1.setFont(Font.font("Monospaced", 40));
        Button but2 = new Button(" ");
        but2.setFont(Font.font("Monospaced", 40));
        Button but3 = new Button(" ");
        but3.setFont(Font.font("Monospaced", 40));


        Button but4 = new Button(" ");
        but4.setFont(Font.font("Monospaced", 40));
        Button but5 = new Button(" ");
        but5.setFont(Font.font("Monospaced", 40));
        Button but6 = new Button(" ");
        but6.setFont(Font.font("Monospaced", 40));

        Button but7 = new Button(" ");
        but7.setFont(Font.font("Monospaced", 40));
        Button but8 = new Button(" ");
        but8.setFont(Font.font("Monospaced", 40));
        Button but9 = new Button(" ");
        but9.setFont(Font.font("Monospaced", 40));
        
        //organizing layout
        buttons.add(but1, 0, 0);
        buttons.add(but2, 1, 0);
        buttons.add(but3, 2, 0);
        
        buttons.add(but4, 0, 1);
        buttons.add(but5, 1, 1);
        buttons.add(but6, 2, 1);
        
        buttons.add(but7, 0, 2);
        buttons.add(but8, 1, 2);
        buttons.add(but9, 2, 2);
        
        buttons.setPadding(new Insets(10, 10, 10, 10));
        buttons.setVgap(10);
        buttons.setHgap(10);
       
        //adding gridpane and label to a main layout
        layout.setTop(turn);
        layout.setCenter(buttons);
       
        
        //ADDING EVENTS TO BUTTONS
        
        //adding game event to button 1
        but1.setOnAction((event) ->{
            game.attachValue(1);
            but1.setText(game.getButton(1).getValue());
        if(game.checkIfWon("X") || game.checkIfWon("O")) {
            turn.setText("The end!");
        } else {
            turn.setText("Turn: " + game.getPlayer());
        }
        });
        
        //adding game event to button 2
        but2.setOnAction((event) ->{
            game.attachValue(2);
            but2.setText(game.getButton(2).getValue());
        if(game.checkIfWon("X") || game.checkIfWon("O")) {
            turn.setText("The end!");
        } else {
            turn.setText("Turn: " + game.getPlayer());
        }
        });
        
        //adding game event to button 3
        but3.setOnAction((event) ->{
            game.attachValue(3);
            but3.setText(game.getButton(3).getValue());
        if(game.checkIfWon("X") || game.checkIfWon("O")) {
            turn.setText("The end!");
        } else {
            turn.setText("Turn: " + game.getPlayer());
        }
        });
        
        //adding game event to button 4
        but4.setOnAction((event) ->{
            game.attachValue(4);
            but4.setText(game.getButton(4).getValue());
        if(game.checkIfWon("X") || game.checkIfWon("O")) {
            turn.setText("The end!");
        } else {
            turn.setText("Turn: " + game.getPlayer());
        }
        });
        
        //adding game event to button 5
        but5.setOnAction((event) ->{
            game.attachValue(5);
            but5.setText(game.getButton(5).getValue());
        if(game.checkIfWon("X") || game.checkIfWon("O")) {
            turn.setText("The end!");
        } else {
            turn.setText("Turn: " + game.getPlayer());
        }
        });
        
        //adding game event to button 6
        but6.setOnAction((event) ->{
            game.attachValue(6);
            but6.setText(game.getButton(6).getValue());
        if(game.checkIfWon("X") || game.checkIfWon("O")) {
            turn.setText("The end!");
        } else {
            turn.setText("Turn: " + game.getPlayer());
        }
        });

        //adding game event to button 7
        but7.setOnAction((event) ->{
            game.attachValue(7);
            but7.setText(game.getButton(7).getValue());
        if(game.checkIfWon("X") || game.checkIfWon("O")) {
            turn.setText("The end!");
        } else {
            turn.setText("Turn: " + game.getPlayer());
        }
        });

        //adding game event to button 8
        but8.setOnAction((event) ->{
            game.attachValue(8);
            but8.setText(game.getButton(8).getValue());
        if(game.checkIfWon("X") || game.checkIfWon("O")) {
            turn.setText("The end!");
        } else {
            turn.setText("Turn: " + game.getPlayer());
        }
        });

        //adding game event to button 9
        but9.setOnAction((event) ->{
            game.attachValue(9);
            but9.setText(game.getButton(9).getValue());
        if(game.checkIfWon("X") || game.checkIfWon("O")) {
            turn.setText("The end!");
        } else {
            turn.setText("Turn: " + game.getPlayer());
        }
        });
        
        //establishing scene
        Scene view = new Scene(layout);
        
        //putting scene on a stage
        window.setScene(view);
        window.show();

     
    }

    //launching application
    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
