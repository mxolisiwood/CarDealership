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
public class Weight_3tonTest {
    
    public Weight_3tonTest() {
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
     * Test of getWeight method, of class Weight_3ton.
     */
    @Test
    public void testGetWeight() {
        
        Weight_3ton instance = new Weight_3ton();
        double expResult = 3.7;
        double result = instance.getWeight();
        assertEquals(expResult, result, 3.7);
       
    }
    
}
