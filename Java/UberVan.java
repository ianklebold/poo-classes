package Java;
import java.util.Map;
import java.util.ArrayList;

import Java.Car;
import Java.Driver;

public class UberVan extends Car{
    Map<String , Map<String,Integer>> typeCardAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;

    public UberVan(String license, 
                   Driver driver, String brand, 
                     String model, Map<String , 
                     Map<String,Integer>> typeCardAccepted,
                     ArrayList<String> seatsMaterial){
        
        super(license, driver);

        this.typeCardAccepted = typeCardAccepted;
        this.seatsMaterial = seatsMaterial;
        

    }
    //Sobreescribimos el metodo
    @Override
    public void setPassegenger(Integer passenger) {
        // TODO Auto-generated method stub
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas como minomo 6 lugares");
        }
    }
    
}
