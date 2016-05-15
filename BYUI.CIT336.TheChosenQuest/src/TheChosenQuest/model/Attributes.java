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
public class Attributes implements Serializable{
    private String Constitution;
    private String Strength;
    private String Magic;
    private String Dexterity;
    private String Charisma;
     
    public Attributes(){
        
    }

    public String getConstitution() {
        return Constitution;
    }

    public void setConstitution(String Constitution) {
        this.Constitution = Constitution;
    }

    public String getStrength() {
        return Strength;
    }

    public void setStrength(String Strength) {
        this.Strength = Strength;
    }

    public String getMagic() {
        return Magic;
    }

    public void setMagic(String Magic) {
        this.Magic = Magic;
    }

    public String getDexterity() {
        return Dexterity;
    }

    public void setDexterity(String Dexterity) {
        this.Dexterity = Dexterity;
    }

    public String getCharisma() {
        return Charisma;
    }

    public void setCharisma(String Charisma) {
        this.Charisma = Charisma;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.Constitution);
        hash = 67 * hash + Objects.hashCode(this.Strength);
        hash = 67 * hash + Objects.hashCode(this.Magic);
        hash = 67 * hash + Objects.hashCode(this.Dexterity);
        hash = 67 * hash + Objects.hashCode(this.Charisma);
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
        final Attributes other = (Attributes) obj;
        if (!Objects.equals(this.Constitution, other.Constitution)) {
            return false;
        }
        if (!Objects.equals(this.Strength, other.Strength)) {
            return false;
        }
        if (!Objects.equals(this.Magic, other.Magic)) {
            return false;
        }
        if (!Objects.equals(this.Dexterity, other.Dexterity)) {
            return false;
        }
        if (!Objects.equals(this.Charisma, other.Charisma)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Attributes{" + "Constitution=" + Constitution + ", Strength=" + Strength + ", Magic=" + Magic + ", Dexterity=" + Dexterity + ", Charisma=" + Charisma + '}';
    }
}
