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
public class winsControlTest {
    
    public winsControlTest() {
    }

    /**
     * Test of total method, of class winsControl.
     */
    @Test
    public void testTotal() {
        System.out.println("total");
        int wins = 0;
        int losses = 0;
        int ties = 0;
        winsControl instance = new winsControl();
        double expResult = 0.0;
        double result = instance.total(wins, losses, ties);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
