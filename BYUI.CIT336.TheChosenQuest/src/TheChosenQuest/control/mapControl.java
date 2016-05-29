/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheChosenQuest.control;

import TheChosenQuest.model.Location;

/**
 *
 * @author Jason
 */
public class mapControl extends Location{
   
    public void mapLocation(int travelTime, int moveDirection){
        if(travelTime < 0 && moveDirection < 0){
            System.out.println("\t\nYour character has not moved anywhere");
        }else{
            System.out.println("\t\nYou have traveled " + travelTime + " in " + moveDirection + " direction. ");
        }
    }
}
