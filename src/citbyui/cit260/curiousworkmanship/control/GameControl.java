/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.curiousworkmanship.control;

import byui.cit260.curiousWorkmanship.model.Game;
import byui.cit260.curiousWorkmanship.model.Ship;
import byui.cit260.curiousWorkmanship.model.Armor;
import byui.cit260.curiousWorkmanship.model.Characters;
import byui.cit260.curiousWorkmanship.model.Map;
import byui.cit260.curiousWorkmanship.model.Player;
/**
 *
 * @author Travis Harley
 */
public class GameControl {
    
    
    public static Game createNewGame(Player player) {
        
        System.out.println("***create new game in GameControl called***");
        
        Game game = new Game();//create new game object
        game.setPlayer(player); //set the player in the game
        Armor armor = new Armor(); //create the armor
        player.setArmor(armor);//set the armor in the player (call the setter function for the player)
        Ship ship = new Ship();//create a ship
        game.setShip(ship);//set the ship in the game (game.setShip)
        Map map = new Map();//create the map
        game.setMap(map);//set the map in the game
        Characters characters;//assign characters to location in the map
        game.setCharacters(characters);
    
        return game;//return game object
    }

    
}
