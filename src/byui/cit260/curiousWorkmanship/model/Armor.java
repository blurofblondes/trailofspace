/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Travis
 */
public class Armor implements Serializable{
    
    
    private double attackStrength;
    private double defenseStrength;
    private ArrayList<Inventory> armorItems = new ArrayList<>();

    public Armor() {
    }

    public double getAttackStrength() {
        return attackStrength;
    }

    public void setAttackStrength(double attackStrength) {
        this.attackStrength = attackStrength;
    }

    public double getDefenseStrength() {
        return defenseStrength;
    }

    public void setDefenseStrength(double defenseStrength) {
        this.defenseStrength = defenseStrength;
    }

    public ArrayList<Inventory> getArmorItems() {
        return armorItems;
    }

    public void setArmorItems(ArrayList<Inventory> armorItems) {
        this.armorItems = armorItems;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.attackStrength) ^ (Double.doubleToLongBits(this.attackStrength) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.defenseStrength) ^ (Double.doubleToLongBits(this.defenseStrength) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Armor other = (Armor) obj;
        if (Double.doubleToLongBits(this.attackStrength) != Double.doubleToLongBits(other.attackStrength)) {
            return false;
        }
        if (Double.doubleToLongBits(this.defenseStrength) != Double.doubleToLongBits(other.defenseStrength)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "armor{" + "attackStrength=" + attackStrength + ", defenseStrength=" + defenseStrength + '}';
    }
    
    
 
    
    
    
    
    
    
}
