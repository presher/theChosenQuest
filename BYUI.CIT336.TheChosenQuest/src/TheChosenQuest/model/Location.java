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
public class Location implements Serializable{
    Visited Visited;
    amountRemaining amountRemaining;
    Attributes Attributes;
    Map Map;
    
    public Location(){
        
    }

    public Visited getVisited() {
        return Visited;
    }

    public void setVisited(Visited Visited) {
        this.Visited = Visited;
    }

    public amountRemaining getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(amountRemaining amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public Attributes getAttributes() {
        return Attributes;
    }

    public void setAttributes(Attributes Attributes) {
        this.Attributes = Attributes;
    }

    public Location getLocation() {
        return Location;
    }

    public void setLocation(Location Location) {
        this.Location = Location;
    }

    public Map getMap() {
        return Map;
    }

    public void setMap(Map Map) {
        this.Map = Map;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.Visited);
        hash = 89 * hash + Objects.hashCode(this.amountRemaining);
        hash = 89 * hash + Objects.hashCode(this.Attributes);
        hash = 89 * hash + Objects.hashCode(this.Location);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.Visited, other.Visited)) {
            return false;
        }
        if (!Objects.equals(this.amountRemaining, other.amountRemaining)) {
            return false;
        }
        if (!Objects.equals(this.Attributes, other.Attributes)) {
            return false;
        }
        if (!Objects.equals(this.Location, other.Location)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "Visited=" + Visited + ", amountRemaining=" + amountRemaining + ", Attributes=" + Attributes + ", Location=" + Location + '}';
    }
}
