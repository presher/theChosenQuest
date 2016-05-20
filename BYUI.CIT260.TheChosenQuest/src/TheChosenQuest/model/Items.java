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

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
