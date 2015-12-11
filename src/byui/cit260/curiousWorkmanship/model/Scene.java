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
public class Scene implements Serializable{
    
    private Trap trapOne;
    private Trap trapTwo;
    private Trap trapThree;
    private String name;
    private String description;
    

    public Scene() {
    }

    public Trap getTrapOne() {
        return trapOne;
    }

    public void setTrapOne(Trap trapOne) {
        this.trapOne = trapOne;
    }

    public Trap getTrapTwo() {
        return trapTwo;
    }

    public void setTrapTwo(Trap trapTwo) {
        this.trapTwo = trapTwo;
    }

    public Trap getTrapThree() {
        return trapThree;
    }

    public void setTrapThree(Trap trapThree) {
        this.trapThree = trapThree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.trapOne);
        hash = 97 * hash + Objects.hashCode(this.trapTwo);
        hash = 97 * hash + Objects.hashCode(this.trapThree);
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.description);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.trapOne, other.trapOne)) {
            return false;
        }
        if (!Objects.equals(this.trapTwo, other.trapTwo)) {
            return false;
        }
        if (!Objects.equals(this.trapThree, other.trapThree)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "trapOne=" + trapOne + ", trapTwo=" + trapTwo + ", trapThree=" + trapThree + ", name=" + name + ", description=" + description + '}';
    }
    
    

   
    
    
}
