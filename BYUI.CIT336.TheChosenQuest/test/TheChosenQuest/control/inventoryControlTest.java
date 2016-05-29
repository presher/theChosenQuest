/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheChosenQuest.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jason
 */
public class inventoryControlTest {
    
    public inventoryControlTest() {
    }

    /**
     * Test of amountOfInventory method, of class inventoryControl.
     */
    @Test
    public void testAmountOfInventory() {
        System.out.println("amountOfInventory");
        int Boots = 1;
        int Armor = 1;
        int gold = 1;
        int Weapons = 1;
        inventoryControl instance = new inventoryControl();
        instance.amountOfInventory(Boots, Armor, gold, Weapons);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addToInventory method, of class inventoryControl.
     */
    @Test
    public void testAddToInventory() {
        System.out.println("addToInventory");
        int Boots = 0;
        int Armor = 0;
        int Weapons = 0;
        int gold = 0;
        inventoryControl instance = new inventoryControl();
        instance.addToInventory(Boots, Armor, Weapons, gold);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromInventory method, of class inventoryControl.
     */
    @Test
    public void testRemoveFromInventory() {
        System.out.println("removeFromInventory");
        double Boots = 0.0;
        double Armor = 0.0;
        double Weapons = 0.0;
        double gold = 0.0;
        inventoryControl instance = new inventoryControl();
        instance.removeFromInventory(Boots, Armor, Weapons, gold);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
