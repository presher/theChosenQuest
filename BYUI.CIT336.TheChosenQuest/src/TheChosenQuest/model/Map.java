/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheChosenQuest.model;

/**
 *
 * @author Jason
 */
public class Map {
    
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 5;
    
    private Location[][] Locations;
    
    public Map(){
        Locations = new Location[NUM_ROWS][NUM_COLS];
}
    public Location getLocation(int row, int col){
        return Locations[row][col];
    }
}
