/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardealership.cars;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author silab
 */
public class Passengers_4Test {
    
    public Passengers_4Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of NoOfPassengers method, of class Passengers_4.
     */
    @Test
    public void testNoOfPassengers() {
       
        Passengers_4 instance = new Passengers_4();
        int expResult = 4;
        int result = instance.NoOfPassengers();
        assertEquals(expResult, result);
       
    }
    
}
