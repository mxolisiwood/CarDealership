/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardealership.cars;

/**
 *
 * @author wadef
 */
public class Sportscar extends Car {

    public Sportscar(String Model, String Brand, String NumberPlate, double price) {
        super(Model, Brand, NumberPlate, price);
        maxSpeed = new MaxSpeed_220km();
        weight = new Weight_1ton();
        noOfpassengers = new Passengers_2();
        condition = new Condition_New();
        fuelType = new ElectricType();
    }
    
}
