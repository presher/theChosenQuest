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
public class racesControlTest {
    
    public racesControlTest() {
    }

    /**
     * Test of selectedRace method, of class racesControl.
     */
    @Test
    public void testSelectedRace() {
        System.out.println("selectedRace");
        int Elf = 1;
        int Human = 0;
        int Dwarf = 3;
        int Halfling = 0;
        racesControl instance = new racesControl();
        instance.selectedRace(Elf, Human, Dwarf, Halfling);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
