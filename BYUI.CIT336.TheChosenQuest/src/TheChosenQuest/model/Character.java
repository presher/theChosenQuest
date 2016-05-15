/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheChosenQuest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Jason
 */
public class Character implements Serializable{
    private String Name;
    Location Location;
    Races Races;
    Menu Menu;
    
    public Character(){
        
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Location getLocation() {
        return Location;
    }

    public void setLocation(Location Location) {
        this.Location = Location;
    }

    public Races getRaces() {
        return Races;
    }

    public void setRaces(Races Races) {
        this.Races = Races;
    }

    public Menu getMenu() {
        return Menu;
    }

    public void setMenu(Menu Menu) {
        this.Menu = Menu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.Name);
        hash = 43 * hash + Objects.hashCode(this.Location);
        hash = 43 * hash + Objects.hashCode(this.Races);
        hash = 43 * hash + Objects.hashCode(this.Menu);
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
        final Character other = (Character) obj;
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.Location, other.Location)) {
            return false;
        }
        if (!Objects.equals(this.Races, other.Races)) {
            return false;
        }
        if (!Objects.equals(this.Menu, other.Menu)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "Name=" + Name + ", Location=" + Location + ", Races=" + Races + ", Menu=" + Menu + '}';
    }
}