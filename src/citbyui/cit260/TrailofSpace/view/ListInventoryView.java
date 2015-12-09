/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.TrailofSpace.view;

/**
 *
 * @author Paige
 */
public class ListInventoryView extends View{
        public ListInventoryView(){
        super("\n"
            +"\n------------------------"
            +"\n| Inventory"
            +"\n------------------------"
            +"\nG - Upgrade Ship"
            +"\nM - Item"
            +"\nI - Upgrade Weapon"
            +"\nA - Upgrade Armor"
            +"\nB - Upgrade Health"
            +"\nQ - Exit"
            +"\n------------------------");
    }
        @Override
    public boolean doAction(Object obj){
       
        String value = (String) obj;
        value = value.toUpperCase(); // convert to all upder case
        char choice = value.charAt(0);
        
        switch (choice){
            case 'G': // Upgrade Ship
                this.GameGoal();
                break;
            case 'M'://  Item
                this.GameKeys();
                break;
            case 'I': // Upgrade Weapon
                this.ItemPurpose();
                break;
            case 'A': // Upgrade Armor
                this.ItemPurpose();
                break;
            case 'B': // Upgrade Health
                this.ItemPurpose();
                break;
            case 'Q': // Exit
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
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
