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
public abstract class Car {
   
    private String Model;
    
    private String Brand;
    
    private String NumberPlate;
    
    public IMaxSpeed maxSpeed;
    
    public INoOfPassengers noOfpassengers;
    
    public IWeight weight;
    
    public Car(IMaxSpeed maxSp, INoOfPassengers noofpass, IWeight weight, String Model, String Brand, String NumberPlate){
        this.maxSpeed = maxSp;
        this.noOfpassengers = noofpass;
        this.weight = weight;
        this.Model = Model;
        this.Brand = Brand;
        this.NumberPlate = NumberPlate;
    }
    
    

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getNumberPlate() {
        return NumberPlate;
    }

    public void setNumberPlate(String NumberPlate) {
        this.NumberPlate = NumberPlate;
    }
      
}
