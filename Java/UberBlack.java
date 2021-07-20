package Java;
import java.util.Map;
import java.util.ArrayList;

import Java.Car;
import Java.Driver;

public class UberBlack extends Car{
    Map<String , Map<String,Integer>> typeCardAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String license, 
                     Driver driver, String brand, 
                     String model, Map<String , 
                     Map<String,Integer>> typeCardAccepted,
                     ArrayList<String> seatsMaterial){
        
        super(license, driver);

        this.typeCardAccepted = typeCardAccepted;
        this.seatsMaterial = seatsMaterial;
        

    }
    
}
