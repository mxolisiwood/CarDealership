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
public class hatchback extends cars{
    public hatchback(int Age,
                long Milage,
                String Brand,
                String Model, 
                double FuelTankSize,
                boolean Electric,
                String NumberPlate,
                double FuelEfficiency){
        super(Age, Milage, Brand, Model, FuelTankSize, Electric, NumberPlate);
        
        this.FuelEfficiency = FuelEfficiency;
    }
    double FuelEfficiency;
    public void setFuelEfficency(double value){
        FuelEfficiency = value;
    }
    public double getFuelEfficiency(){
        return FuelEfficiency;
    }
}
