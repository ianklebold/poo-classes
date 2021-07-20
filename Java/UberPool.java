package Java;
import Java.Car;
import Java.Driver;

public class UberPool extends Car{
    String brand;
    String model;

    public UberPool(String license, Driver driver, String brand, String model){
        super(license, driver);

        this.brand = brand;
        this.model = model;
        

    }
    
}
