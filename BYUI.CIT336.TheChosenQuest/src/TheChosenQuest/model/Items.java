/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheChosenQuest.model;

import java.io.Serializable;

/**
 *
 * @author Jeremy
 */
public class Items implements Serializable{
    private String manaPotion;
    private String healthPotion;

    public String getManaPotion() {
        return manaPotion;
    }

    public String getHealthPotion() {
        return healthPotion;
    }

    public void setManaPotion(String manaPotion) {
        this.manaPotion = manaPotion;
    }

    public void setHealthPotion(String healthPotion) {
        this.healthPotion = healthPotion;
    }
    
    
}
