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
public class van extends cars{
        public van(int Age,
                long Milage,
                String Brand,
                String Model, 
                double FuelTankSize,
                boolean Electric,
                String NumberPlate,
                int PassangerNum){
        super(Age, Milage, Brand, Model, FuelTankSize, Electric, NumberPlate);
        
        this.PassengerNum = PassengerNum;
    }
    int PassengerNum;
    public void setPassengerNum(int value){
        PassengerNum = value;
    }
    public int getPassengerNum(){
        return PassengerNum;
    }
}
