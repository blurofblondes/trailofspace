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
public class HelpMenuView extends View {
    
    public HelpMenuView(){
        super("\n"
            +"\n------------------------"
            +"\n| Help Menu"
            +"\n------------------------"
            +"\nG - View map"
            +"\nM - View list of items in inventory"
            +"\nI - View ship status"
            +"\nQ - Exit the game"
            +"\n------------------------");
    }
    @Override
    public boolean doAction(Object obj){
       
        String value = (String) obj;
        value = value.toUpperCase(); // convert to all upder case
        char choice = value.charAt(0);
        
        switch (choice){
            case 'G': // The goal of the game
                this.GameGoal();
                break;
            case 'M':// How to move
                this.GameKeys();
                break;
            case 'I': // The purpose of game items
                this.ItemPurpose();
                break;
            case 'E': // Exit
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }

    private void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       

        private void GameGoal() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void GameKeys() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void ItemPurpose() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
}
    
        
        
            
        
