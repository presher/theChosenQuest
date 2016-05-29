/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheChosenQuest.control;

import TheChosenQuest.model.Location;
import java.util.List;

/**
 *
 * @author Jason
 */
public class locationControl extends Location {
    public void mapLocation(int Map, int Scene, List<Location>Visited, List<Location>amountRemaining){
        if(Map <= 0 || Scene <= 0){
            System.out.println("This is an invalid location");
        }else {
            System.out.println(" You have arrived at " + " Map location " + Map + " Scene " + Scene + " Visited " + Visited);
        }
    }
}
