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
public class GameMenuView extends View {
    
    public GameMenuView(){
        super( "\n"
                +"\n------------------------"
                +"\n| Game Menu"
                +"\n------------------------"
                +"\nV - View map"
                +"\nI - View list of items in inventory"
                +"\nS - View ship status"
                +"\nP - View player stats"
                +"\nM - Move to new location"
                +"\nX - Exit Ship"
                +"\nE - Re-enter ship"
                +"\nU - Upgrade ship"
                +"\nH - Help"
                +"\nQ - Exit the game"
                +"\n------------------------");
    }
    @Override
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        value = value.toUpperCase(); // convert to all upder case
        char choice = value.charAt(0);
    
        switch (choice){
            case 'V': // view map
                this.MapStatus();
                break;
            case 'I':// view list of items in inventory
                this.InventoryItem();
                break;
            case 'S': // view ship status
                this.ShipStatus();
                break;
            case 'P': // view player stats
                this.PlayerStatus();
                break;
            case 'M': // move to new location
                this.LocationStatus();
                break;
            case 'X': // exit ship
                this.ShipControl();
                break;
            case 'R': // reenter ship
                this.ShipControl();
                break;
            case 'U': // upgrade ship
                this.ShipStatus();
                break;
            case 'H': //help
                this.help();
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

    private void MapStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void InventoryItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ShipStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void PlayerStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void LocationStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ShipControl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void help() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}

        
            
            
    
  
