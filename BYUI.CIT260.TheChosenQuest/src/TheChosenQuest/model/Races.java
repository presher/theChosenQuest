/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheChosenQuest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Jason
 */
public class Races implements Serializable{
    List<Races> characterType;
    
    public Races(){
        characterType = new ArrayList<>();
    }

    public List<Races> getCharacterType() {
        return characterType;
    }

    public void setCharacterType(List<Races> characterType) {
        this.characterType = characterType;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.characterType);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Races other = (Races) obj;
        if (!Objects.equals(this.characterType, other.characterType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Races{" + "characterType=" + characterType + '}';
    }
}
