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
    public void testPerformWeightIs1Ton() {
       
        Car c2 = new Car();
        double expResult = 1.3;
        double result = c2.performWeight();
        assertEquals(expResult, result, 1.3);
       
    }
    
      /**
     * Test of performWeight method, of class Car.
     */
    @Test
    public void testPerformWeightIs2Ton() {
       
        Car c2 = new Car();
        double expResult = 2.6;
        double result = c2.performWeight();
        assertEquals(expResult, result, 2.6);
       
    }
    
      /**
     * Test of performWeight method, of class Car.
     */
    @Test
    public void testPerformWeightIs3Ton() {
       
        Car c2 = new Car();
        double expResult = 3.7;
        double result = c2.performWeight();
        assertEquals(expResult, result, 3.7);
       
    }

    /**
     * Test of performNoofPassengers method, of class Car.
     */
    @Test
    public void testPerformNoofPassengersIs2() {
       
        Car c3 = new Car();
        int expResult = 2;
        int result = c3.performNoofPassengers();
        assertEquals(expResult, result);
       
    }
      /**
     * Test of performNoofPassengers method, of class Car.
     */
    @Test
    public void testPerformNoofPassengersIs4() {
       
        Car c3 = new Car();
        int expResult = 4;
        int result = c3.performNoofPassengers();
        assertEquals(expResult, result);
       
    }
      /**
     * Test of performNoofPassengers method, of class Car.
     */
    @Test
    public void testPerformNoofPassengersIs8() {
       
        Car c3 = new Car();
        int expResult = 8;
        int result = c3.performNoofPassengers();
        assertEquals(expResult, result);
       
    }

    public class CarImpl extends Car {

        public CarImpl() {
            super("", "", "", 0.0);
        }
    }
    
}
