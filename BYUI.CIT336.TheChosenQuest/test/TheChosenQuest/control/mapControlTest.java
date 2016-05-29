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
public class mapControlTest {
    
    public mapControlTest() {
    }

    /**
     * Test of mapLocation method, of class mapControl.
     */
    @Test
    public void testMapLocation() {
        System.out.println("mapLocation");
        int travelTime = 1;
        int moveDirection = 2;
        mapControl instance = new mapControl();
        instance.mapLocation(travelTime, moveDirection);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
