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
public class cars {
    
    
    String Color;
     public void setColor(String value){
        Color = value;
    }
    public String getColor(){
        return Color;
    }
    
    int Age;
    public void setAge(int value){
        Age = value;
    }
    public int getAge(){
        return Age;
    }
    
    long Milage;
    public void setMilage(long value){
        Milage = value;
    }
    public long getMilage(){
        return Milage;
    }
    
    String Brand;
    public void setBrand(String value){
        Brand = value;
    }
    public String getBrand(){
        return Brand;
    }
    String Model;
    public void setModel(String value){
        Model = value;
    }
    public String getModel(){
        return Model;
    }
    double FuelTankSize;
     public void setTankSize(int value){
        FuelTankSize = value;
    }
    public double getTankSize(){
        return FuelTankSize;
    }
    boolean Electric;
    public void setElectric(Boolean value){
        Electric = value;
    }
    public Boolean getElectric(){
        return Electric;
    }
    
    String NumberPlate;
    public void setNumberPlate(String value){
        NumberPlate = value;
    }
    public String getNumberPlate(){
        return NumberPlate;
    }
}
