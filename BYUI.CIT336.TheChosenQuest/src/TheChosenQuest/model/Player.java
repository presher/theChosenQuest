/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheChosenQuest.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Jason
 */
public class Player implements Serializable{
    private String name;
    List<Items> Item;
    List<Inventory> Inventory;
    Location location;
    List<Races> Character;
    List<Attributes> Attributes;
    public Player(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
    }
    
}
