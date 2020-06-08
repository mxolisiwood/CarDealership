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
public class Suv extends Car{

    public Suv(String Model, String Brand, String NumberPlate) {
        super(Model, Brand, NumberPlate);
        weight = new Weight_2Ton();
        maxSpeed = new MaxSpeed_160km();
        noOfpassengers = new Passengers_4();
    }
    
}
