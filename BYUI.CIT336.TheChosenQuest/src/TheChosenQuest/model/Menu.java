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
 * @author Jason & Jeremy
 */
public class Menu implements Serializable{
    List<Menu> Menu;
    public Menu(){
        Menu = new ArrayList<>();
    }

    public List<Menu> getMenu() {
        return Menu;
    }

    public void setMenu(List<Menu> Menu) {
        this.Menu = Menu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.Menu);
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
        final Menu other = (Menu) obj;
        if (!Objects.equals(this.Menu, other.Menu)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Menu{" + "Menu=" + Menu + '}';
    }
}
