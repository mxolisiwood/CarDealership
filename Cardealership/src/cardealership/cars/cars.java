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
    public cars(int Age,
                long Milage,
                String Brand,
                String Model, 
                double FuelTankSize,
                boolean Electric,
                String NumberPlate){
        this.Age = Age;
        this.Brand = Brand;
        this.Milage = Milage;
        this.FuelTankSize = FuelTankSize;
        this.NumberPlate = NumberPlate;
        this.Model = Model;
        this.Electric = false;
    }
    public cars(){
        
    }
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
    
      public Object clone() throws CloneNotSupportedException{
        //HW: Implement cloning -- DONE!!
        
         cars clone = new cars();
         clone.Color = this.Color;
         clone.Age = this.Age;
         clone.Brand = this.Brand;
         clone.Electric = this.Electric;
         clone.FuelTankSize = this.FuelTankSize;
         clone.Milage = this.Milage;
         clone.NumberPlate = this.NumberPlate;
         clone.Model = this.Model;
         
        return super.clone();
    }
}
