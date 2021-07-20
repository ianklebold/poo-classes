package Java;
import Java.Account;
public class Driver extends Account{

    public Driver(String name, String document){
        super(name, document);
        
    }
    public String getNombre(){
        return super.getName();
    }
    public String getDocument(){
        return super.getDocument();
    }
    
}
