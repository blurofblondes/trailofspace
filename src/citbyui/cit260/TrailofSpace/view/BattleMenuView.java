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
public class BattleMenuView extends View {
    
    public BattleMenuView(){
        super("\n"
            +"\n------------------------"
            +"\n| Battle Menu"
            +"\n------------------------"
            +"\nA - Attack"
            +"\nD - Defend"
            +"\nP - Predict outcome"
            +"\nQ - Exit the game"
            +"\n------------------------");
    }
    @Override 
    public boolean doAction(Object obj){
    
        String value = (String) obj;
        value = value.toUpperCase(); // convert to all upder case
        char choice = value.charAt(0);
        
        switch (choice){
            case 'A': // Attack
                this.GameGoal();
                break;
            case 'D':// Defend
                this.GameKeys();
                break;
            case 'P': // Predict outcome
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

    
            
            
        
    
           
