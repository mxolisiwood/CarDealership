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
public class Weight_1tonTest {
    
    public Weight_1tonTest() {
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
     * Test of getWeight method, of class Weight_1ton.
     */
    @Test
    public void testGetWeight() {
       
        Weight_1ton instance = new Weight_1ton();
        double expResult = 1.3;
        double result = instance.getWeight();
        assertEquals(expResult, result, 1.3);
      
    }
    
}
