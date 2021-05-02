/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe.logic;
import ticTacToe.domain.GameButton;

/**
 *
 * @author Otwarte
 */
//game consists of 9 buttons
public class Game {
    
    private String player;
    
    private GameButton button1;
    private GameButton button2;
    private GameButton button3;
    
    private GameButton button4;
    private GameButton button5;
    private GameButton button6;
    
    private GameButton button7;
    private GameButton button8;
    private GameButton button9;
    
    public Game() {
        
        this.player = "X";
        
        this.button1 = new GameButton();
        this.button2 = new GameButton();
        this.button3 = new GameButton();
        
        this.button4 = new GameButton();
        this.button5 = new GameButton();
        this.button6 = new GameButton();
        
        this.button7 = new GameButton();
        this.button8 = new GameButton();
        this.button9 = new GameButton();
    }
    
    //prints value on a button and change Turns
    public void attachValue(int number) {
        
        //only if game is still going on.
        if(!(this.checkIfWon("X") || this.checkIfWon("O"))) {
            
            //choose proper button to give value to
            GameButton chosenButton = this.getButton(number);

            //attaching value to a button and switching player
            if (chosenButton.giveValue(player)) {
                if (this.player.equals("X")) {
                    this.player = "O";
                } else if (this.player.equals("O")) {
                    this.player = "X";
                }    
            }
        }
    }
    
    
    
    //method checks if the game is won by comparing values of the buttons in right combinations
    public boolean checkIfWon(String value) {
        
        //horizontal winning combinations
        if (button1.getValue().equals(value) && button2.getValue().equals(value) && button3.getValue().equals(value)) {
            return true;
        } else if (button4.getValue().equals(value) && button5.getValue().equals(value) && button6.getValue().equals(value)) {
            return true;
        } else if (button7.getValue().equals(value) && button8.getValue().equals(value) && button9.getValue().equals(value)) {
            return true;
        }
        //vertical winning combinations
        else if (button1.getValue().equals(value) && button4.getValue().equals(value) && button7.getValue().equals(value)) {
            return true;
        } else if (button2.getValue().equals(value) && button5.getValue().equals(value) && button8.getValue().equals(value)) {
            return true;
        } else if (button3.getValue().equals(value) && button6.getValue().equals(value) && button9.getValue().equals(value)) {
            return true;
        }
        //diagonal winning combinations;

         else if (button1.getValue().equals(value) && button5.getValue().equals(value) && button9.getValue().equals(value)) {
            return true;
        } else if (button3.getValue().equals(value) && button5.getValue().equals(value) && button7.getValue().equals(value)) {
            return true;
        } 
        //game not won yet
        else {
            return false;
        }
    }
    
    //return the player(X or O)
    public String getPlayer() {
        return this.player;
    }
    
    //choose button to operate on
    public GameButton getButton(int number) {
        if (number == 1) {
            return this.button1;
        } else if (number == 2) {
            return this.button2;     
        } else if (number == 3) {
            return this.button3;
        } else if (number == 4) {
            return this.button4;
        } else if (number == 5) {
            return this.button5;
        } else if (number == 6) {
            return this.button6;
        } else if (number == 7) {
            return this.button7;
        } else if (number == 8) {
            return this.button8;
        } else if (number == 9) {
            return this.button9;
        } else {
            return null;
        }
    }
    
    
}
