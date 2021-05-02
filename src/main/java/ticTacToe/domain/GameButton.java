/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe.domain;

/**
 *
 * @author Otwarte
 */

//button class to create separate object for each button. The class will contain string of the value X, O or empty.
public class GameButton {   
    private String value;
   
    public GameButton() {
       value = " ";
    }
   
    //attach a value to a button if it's empty
    public boolean giveValue(String XorO) {
        if (this.value.equals(" ")) {
            this.value = XorO;
            return true;
        } else {
            return false;
        }
    }
    
    
    public String getValue() {
        return this.value;
    }
    
}
