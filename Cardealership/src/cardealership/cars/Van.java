/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardealership.cars;

/**
 *
 * @author silab
 */
public class Van extends Car {

    public Van(String Model, String Brand, String NumberPlate, double price) {
        super(Model, Brand, NumberPlate, price);
        weight = new Weight_3ton();
        noOfpassengers = new Passengers_8();
        maxSpeed = new MaxSpeed_140km();
    }
    
}
