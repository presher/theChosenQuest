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
        if(travelTime <= 0 || moveDirection <= 0 || moveDirection > 4){
            System.out.println("\t\nYour character has not moved anywhere");
        }else if(moveDirection == 1){
            String direction = "North";
            System.out.println("\t\nYou have traveled " + travelTime + " minute. In a " + direction + " direction. ");
            }
        else if(moveDirection == 2){
            String direction = "South";
            System.out.println("\t\nYou have traveled " + travelTime + " minute. In a " + direction + " direction. ");
        }else if(moveDirection == 3){
            String direction = "East";
            System.out.println("\t\nYou have traveled " + travelTime + " minute. In a " + direction + " direction. ");
        }else if(moveDirection == 4){
            String direction = "West";
            System.out.println("\t\nYou have traveled " + travelTime + " minute. In a " + direction + " direction. ");
        }   
            
        }
    }

