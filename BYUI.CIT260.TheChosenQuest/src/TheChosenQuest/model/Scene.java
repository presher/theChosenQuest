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
public class Scene implements Serializable{
    Description Description;
    travelTime travelTime;
    blockedLocation blockedLocation;
    displaySymbol displaySymbol;
    
    public Scene(){
        
    }

    public Description getDescription() {
        return Description;
    }

    public void setDescription(Description Description) {
        this.Description = Description;
    }

    public travelTime getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(travelTime travelTime) {
        this.travelTime = travelTime;
    }

    public blockedLocation getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(blockedLocation blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public displaySymbol getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(displaySymbol displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.Description);
        hash = 71 * hash + Objects.hashCode(this.travelTime);
        hash = 71 * hash + Objects.hashCode(this.displaySymbol);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        if (!Objects.equals(this.travelTime, other.travelTime)) {
            return false;
        }
        if (!Objects.equals(this.blockedLocation, other.blockedLocation)) {
            return false;
        }
        if (!Objects.equals(this.displaySymbol, other.displaySymbol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "Description=" + Description + ", travelTime=" + travelTime + ", blockedLocation=" + blockedLocation + ", displaySymbol=" + displaySymbol + '}';
    }
}
