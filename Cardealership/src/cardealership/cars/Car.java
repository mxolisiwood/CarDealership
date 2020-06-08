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
    
    public double price;
    
    public INoOfPassengers noOfpassengers;
    
    public IWeight weight;
    
    public Car(String Model, String Brand, String NumberPlate, double price){
        this.Model = Model;
        this.Brand = Brand;
        this.NumberPlate = NumberPlate;
        this.price = price;
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
    
    public int performSpeed(){
        return maxSpeed.getSpeed();
    }
    
    public int performWeight(){
        return weight.getWeight();
    }
    
    public int performNoofPassengers(){
        return noOfpassengers.NoOfPassengers();
    }
      
}
