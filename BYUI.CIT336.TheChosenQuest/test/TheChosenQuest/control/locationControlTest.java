/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheChosenQuest.control;

import TheChosenQuest.model.Location;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jason
 */
public class locationControlTest {
    
    public locationControlTest() {
    }

    /**
     * Test of mapLocation method, of class locationControl.
     */
    @Test
    public void testMapLocation() {
        System.out.println("mapLocation");
        int Map = 1;
        int Scene = 5;
        List<Location> Visited = null;
        List<Location> amountRemaining = null;
        locationControl instance = new locationControl();
        instance.mapLocation(Map, Scene, Visited, amountRemaining);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
