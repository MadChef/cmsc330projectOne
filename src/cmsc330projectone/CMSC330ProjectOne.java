/*
Author: David Solan
Date: January 22, 2020
Purpose: This program will take an input file that describes a GUI 
application, parse the input as tokens, and output a properly formatted
application that can be launched
 */
package cmsc330projectone;

public final class CMSC330ProjectOne {
    
    public CMSC330ProjectOne (){
        
    }//end no arg constructor
    
    public static void main(String[] args) {
        
    }

    enum NonTerminals {
        GUI, LAYOUT, LAYOUT_TYPE, WIDGETS, WIDGET, RADIO_BUTTONS,
        RADIO_BUTTON
    };

    enum Tokens {
        WINDOW, STRING, LEFT_PARENTHESIS, NUMBER, COMMA, RIGHT_PARENTHESIS,
        END, PERIOD, FLOW, GRID, BUTTON, SEMICOLON, COLON, GROUP,
        LABEL, RADIO
    }

}
