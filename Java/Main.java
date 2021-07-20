package Java;
import Java.Car;
import Java.Account;
import Java.Driver;

class Main{

    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Driver driver = new Driver("Ian", "41840491");
        Car car = new Car("AMQ-123", driver);
        
        System.out.println(car.getLicense()+" "+ car.getDriver().getName() +" "+ 
                          car.getDriver().getDocument());
       

    }



}