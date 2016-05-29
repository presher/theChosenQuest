/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheChosenQuest.control;

import TheChosenQuest.model.Inventory;

/**
 *
 * @author Jason
 */



public class inventoryControl extends Inventory {
   public void amountOfInventory(int Boots, int Armor, int gold, int Weapons){
        if(gold <= 0 ){ //Empty Inventory
            System.out.println("\t\nYou have no gold");
        }else{
            System.out.println("\t\nYou have " + gold + " gold");
        }
        if(Boots <= 0 ){
            System.out.println("\t\nYou no have Gold");
        }else{
            System.out.println("\t\nYou have " + Boots + " boots");
        }
        if(Armor <= 0){
            System.out.println("\t\nYou have no armor");
        }else{
            System.out.println("\t\nYou have " + Armor + " armor");
        }
        if(Weapons <= 0){
            System.out.println("\t\nYou have no Weapons, ");
        }else{
            System.out.println("\t\nYou have " + Weapons + " weapons");
        }
        
        double inventoryTotal = Boots + Armor + gold + Weapons;
         System.out.println(inventoryTotal);
   }
public void addToInventory(int Boots, int Armor, int Weapons, int gold){


}

public void removeFromInventory(double Boots, double Armor, double Weapons, double gold){

}

}