/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailofspace;


import byui.cit260.curiousWorkmanship.model.Player;
import citbyui.cit260.TrailofSpace.view.startProgramView;
import citbyui.cit260.curiousworkmanship.control.Game;
import java.io.Serializable;


/**
 *
 * @author Travis
 * 
 * private double armor;
    private double upgradeArmor;
 */
public class TrailofSpace {
    private static Player player;
    private static Game currentGame;

    /**
     * @param args
     */
    
    public static void main(String[] args) {
            // create StartProgramView and start the program
            startProgramView startProgramView = new startProgramView();
            startProgramView.startProgram();

    }

    public static void setPlayer(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



 
}
