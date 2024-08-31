package org.example;

public class Car extends Vehicle{

    private String brand;

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    public static void main(String[] args) {
         Car car = new Car(4, "Red", 2.5f, "Gas", "Honda");

         car.honk();
         car.displayInfo();
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    //Create a method named honk that prints "Honk, honk!"

    public void honk(){
        System.out.println("Honk, honk!");
    }

    //Create a method named displayInfo that prints all the attributes (including the inherited ones).
    public void displayInfo(){
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine Size: " + getEngineSize());
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Brand: " + getBrand());
    }


}
