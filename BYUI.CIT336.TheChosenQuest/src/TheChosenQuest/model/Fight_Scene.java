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
public class Fight_Scene implements Serializable {
    List<Fight_Scene> Battle;
    Scene Scene;
    Location Location;
    
    public Fight_Scene(){
        Battle = new ArrayList<>();
    }
    public void addFight_Scene(Fight_Scene b){
        Battle.add(b);
    }
    public List<Fight_Scene> getBattle() {
        return Battle;
    }

    public void setBattle(List<Fight_Scene> Battle) {
        this.Battle = Battle;
    }

    public Scene getScene() {
        return Scene;
    }

    public void setScene(Scene Scene) {
        this.Scene = Scene;
    }

    public Location getLocation() {
        return Location;
    }

    public void setLocation(Location Location) {
        this.Location = Location;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.Battle);
        hash = 97 * hash + Objects.hashCode(this.Scene);
        hash = 97 * hash + Objects.hashCode(this.Location);
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
        final Fight_Scene other = (Fight_Scene) obj;
        if (!Objects.equals(this.Battle, other.Battle)) {
            return false;
        }
        if (!Objects.equals(this.Scene, other.Scene)) {
            return false;
        }
        if (!Objects.equals(this.Location, other.Location)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fight_Scene{" + "Battle=" + Battle + ", Scene=" + Scene + ", Location=" + Location + '}';
    }
}
