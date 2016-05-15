/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheChosenQuest.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jason
 */
public class Inventory implements Serializable{
    private String Armor;
    private String Boots;
    private String gold;
    private String Weapons;
    
    public Inventory(){
        
    }

    public String getArmor() {
        return Armor;
    }

    public void setArmor(String Armor) {
        this.Armor = Armor;
    }

    public String getBoots() {
        return Boots;
    }

    public void setBoots(String Boots) {
        this.Boots = Boots;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getWeapons() {
        return Weapons;
    }

    public void setWeapons(String Weapons) {
        this.Weapons = Weapons;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.Armor);
        hash = 43 * hash + Objects.hashCode(this.Boots);
        hash = 43 * hash + Objects.hashCode(this.gold);
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
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.Armor, other.Armor)) {
            return false;
        }
        if (!Objects.equals(this.Boots, other.Boots)) {
            return false;
        }
        if (!Objects.equals(this.gold, other.gold)) {
            return false;
        }
        if (!Objects.equals(this.Weapons, other.Weapons)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "Armor=" + Armor + ", Boots=" + Boots + ", gold=" + gold + ", Weapons=" + Weapons + '}';
    }
    
}
