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
public class CarTest {
    
    public CarTest() {
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
     * Test of getPrice method, of class Car.
     */
    @Test
    public void testGetPrice() {
       
        Car instance = null;
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of setPrice method, of class Car.
     */
    @Test
    public void testSetPrice() {
       
        double price = 0.0;
        Car instance = null;
        instance.setPrice(price);
       
    }

    /**
     * Test of getModel method, of class Car.
     */
    @Test
    public void testGetModel() {
        
        Car instance = null;
        String expResult = "";
        String result = instance.getModel();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of setModel method, of class Car.
     */
    @Test
    public void testSetModel() {
       
        String Model = "";
        Car instance = null;
        instance.setModel(Model);

    }

    /**
     * Test of getBrand method, of class Car.
     */
    @Test
    public void testGetBrand() {
      
        Car instance = null;
        String expResult = "";
        String result = instance.getBrand();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setBrand method, of class Car.
     */
    @Test
    public void testSetBrand() {
       
        String Brand = "";
        Car instance = null;
        instance.setBrand(Brand);
     
    }

    /**
     * Test of getNumberPlate method, of class Car.
     */
    @Test
    public void testGetNumberPlate() {
        
        Car instance = null;
        String expResult = "";
        String result = instance.getNumberPlate();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setNumberPlate method, of class Car.
     */
    @Test
    public void testSetNumberPlate() {
        
        String NumberPlate = "";
        Car instance = null;
        instance.setNumberPlate(NumberPlate);
      
    }

    /**
     * Test of performSpeed method, of class Car.
     */
    @Test
    public void testPerformSpeedIs140() {
       
        Car c1 = new Car();
        int expResult = 140;
        int result = c1.performSpeed();
        assertEquals(expResult, result);
      
    }
      /**
     * Test of performSpeed method, of class Car.
     */
    @Test
    public void testPerformSpeedIs160() {
       
        Car c1 = new Car();
        int expResult = 160;
        int result = c1.performSpeed();
        assertEquals(expResult, result);
      
    }
    
       /**
     * Test of performSpeed method, of class Car.
     */
    @Test
    public void testPerformSpeedIs220() {
       
        Car c1 = new Car();
        int expResult = 220;
        int result = c1.performSpeed();
        assertEquals(expResult, result);
      
    }
    

    /**
     * Test of performWeight method, of class Car.
     */
    @Test
    public void testPerformWeight() {
        System.out.println("performWeight");
        Car instance = null;
        double expResult = 0.0;
        double result = instance.performWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performNoofPassengers method, of class Car.
     */
    @Test
    public void testPerformNoofPassengers() {
        System.out.println("performNoofPassengers");
        Car instance = null;
        int expResult = 0;
        int result = instance.performNoofPassengers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CarImpl extends Car {

        public CarImpl() {
            super("", "", "", 0.0);
        }
    }
    
}
