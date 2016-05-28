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
        if(gold < 0 && Boots < 0 && Armor < 0 && Weapons < 0){ //Empty Inventory
            System.out.println("You have no inventory");
        }
        if(gold > 0 && Boots < 0 && Armor < 0 && Weapons < 0){
            System.out.println("\t\nYou have Gold " + gold);
        }
        if(gold > 0 && Boots > 0 && Armor < 0 && Weapons < 0){
            System.out.println("\t\nYou have gold, " + gold +  " and Boots " + Boots);
        }
        if(gold > 0 && Boots > 0 && Armor > 0 && Weapons < 0){
            System.out.println("\t\nYou have Gold, " + gold + " and Boots, " + Boots + " and Armor " + Armor);
        }
        if(gold > 0 && Boots > 0 && Armor > 0 && Weapons > 0){
            System.out.println("\t\nYou have Gold " + gold + " and Boots " + Boots + " , and Armor " + Armor + " , and Weapons " + Weapons);
        }
        double inventoryTotal = Boots + Armor + gold + Weapons;
         System.out.println(inventoryTotal);
   }
public void addToInventory(int Boots, int Armor, int Weapons, int gold){


}

public void removeFromInventory(double Boots, double Armor, double Weapons, double gold){

}

}