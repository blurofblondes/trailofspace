/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Travis
 */
public class Inventory implements Serializable{
    
    private String item;
    private String description;
    private String itemType;
    private double itemStrength;
    
    

    public Inventory() {
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public double getItemStrength() {
        return itemStrength;
    }

    public void setItemStrength(double itemStrength) {
        this.itemStrength = itemStrength;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.item);
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + Objects.hashCode(this.itemType);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.itemStrength) ^ (Double.doubleToLongBits(this.itemStrength) >>> 32));
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
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.itemStrength) != Double.doubleToLongBits(other.itemStrength)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "item=" + item + ", description=" + description + ", itemType=" + itemType + ", itemStrength=" + itemStrength + '}';
    }

    
    
    
    
}
