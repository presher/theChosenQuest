/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheChosenQuest.control;

/**
 *
 * @author Jason
 */
public class winsControl {
    public double total(int wins, int losses, int ties){
        if(wins == 0 && losses == 0 && ties == 0)   {
            System.out.println("you have no wins, ties or losses");
        }else if(wins > 0){
            System.out.println("You have won " + wins + " times.");
        }else if(losses > 0){
            System.out.println("You have lost " + losses + " times.");
        }else if(ties > 0){
            System.out.println("You have tied " + ties + " times.");
        }
        return 0;
}
}