/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheChosenQuest.model;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Jason
 */
public class Map {
    
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 5;
    
    private Location[][] Locations;
    List<Map> Move;
    
    public Map(){
        Locations = new Location[NUM_ROWS][NUM_COLS];
        Move = new ArrayList<>();
}
    public Location getLocation(int row, int col){
        return Locations[row][col];
    }

    public Location[][] getLocations() {
        return Locations;
    }

    public void setLocations(Location[][] Locations) {
        this.Locations = Locations;
    }

    public List<Map> getMove() {
        return Move;
    }

    public void setMove(List<Map> Move) {
        this.Move = Move;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Arrays.deepHashCode(this.Locations);
        hash = 13 * hash + Objects.hashCode(this.Move);
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
        final Map other = (Map) obj;
        if (!Arrays.deepEquals(this.Locations, other.Locations)) {
            return false;
        }
        if (!Objects.equals(this.Move, other.Move)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "Locations=" + Locations + ", Move=" + Move + '}';
    }
}
