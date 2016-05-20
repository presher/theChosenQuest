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
public class Game implements Serializable {
    private String gameIntroduction;

    public String getGameIntroduction() {
        return gameIntroduction;
    }

    public void setGameIntroduction(String gameIntroduction) {
        this.gameIntroduction = gameIntroduction;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
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
