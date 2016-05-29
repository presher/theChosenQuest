/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheChosenQuest.model;

/**
 *
 * @author Jason
 */
public class Statistics {
   int wins;
   int losses;
   int ties;

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.wins;
        hash = 59 * hash + this.losses;
        hash = 59 * hash + this.ties;
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
        final Statistics other = (Statistics) obj;
        if (this.wins != other.wins) {
            return false;
        }
        if (this.losses != other.losses) {
            return false;
        }
        if (this.ties != other.ties) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Statistics{" + "wins=" + wins + ", losses=" + losses + ", ties=" + ties + '}';
    }
    
}
