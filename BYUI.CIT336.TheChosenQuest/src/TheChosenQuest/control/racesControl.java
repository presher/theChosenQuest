/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheChosenQuest.control;

import TheChosenQuest.model.Races;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class racesControl{
    
    String Elf;
    String Human;
    String Dwarf;
    String Halfling;
    public void selectedRace(int Elf, int Human, int Dwarf, int Halfling ){
        Scanner selectedRace = new Scanner(System.in);
     if(Elf < 0 && Human < 0 && Dwarf < 0 && Halfling < 0)  {
         System.out.println("Please choose a valid Race for your Character");
     } else{
         
         System.out.println("You have chossen to be a" + selectedRace);
     }
    }
}
