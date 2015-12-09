/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.TrailofSpace.view;

import java.util.Scanner;

/**
 *
 * @author Travis Harley
 */
public class MainMenuView extends View {
    
    public MainMenuView(){
        super( "\n"
                +"\n------------------------"
                +"\n| Main Menu"
                +"\n------------------------"
                +"\nS - Start new game"
                +"\nL - Load game"
                +"\nH - Help, how to play the game"
                +"\nE - Exit the game"
                +"\n------------------------");
    }
    @Override
    public boolean doAction(Object obj){
       
        String value = (String) obj;
        value = value.toUpperCase(); // convert to all upder case
        char choice = value.charAt(0);
            
            switch (choice){
                case 'S': // Start new game
                    this.newGame();
                    break;
                case 'L':// Load Game
                    this.loadGame();
                    break;
                case 'H': // Help, how to play the game
                    this.help();
                    break;
                case 'E': // Exit the game
                    return true;
                default:
                    System.out.println("\n*** Invalid Selection *** Try again");
                    break;
            }
            return false;
    }

    private void newGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void loadGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void help() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

           
     private void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
