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
 * @author Jason & Jeremy
 */
public class Location implements Serializable{
    List<Location> Visited;
    List<Location> amountRemaining;
    Attributes Attributes;
    Map Map;
    Scene Scene;
    
    public Location(){
        Visited = new ArrayList<>();
        amountRemaining = new ArrayList<>();
    }

    public List<Location> getVisited() {
        return Visited;
    }

    public void setVisited(List<Location> Visited) {
        this.Visited = Visited;
    }

    public List<Location> getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(List<Location> amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public Attributes getAttributes() {
        return Attributes;
    }

    public void setAttributes(Attributes Attributes) {
        this.Attributes = Attributes;
    }

    public Map getMap() {
        return Map;
    }

    public void setMap(Map Map) {
        this.Map = Map;
    }

    public Scene getScene() {
        return Scene;
    }

    public void setScene(Scene Scene) {
        this.Scene = Scene;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.Visited);
        hash = 41 * hash + Objects.hashCode(this.amountRemaining);
        hash = 41 * hash + Objects.hashCode(this.Attributes);
        hash = 41 * hash + Objects.hashCode(this.Map);
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
        if (!Objects.equals(this.Map, other.Map)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "Visited=" + Visited + ", amountRemaining=" + amountRemaining + ", Attributes=" + Attributes + ", Map=" + Map + '}';
    }

}