package Java;
import Java.Driver;
public class Car {
    private Integer id;
    private String license;
    private Driver driver;
    private Integer passegenger; 

    public Car(String license, Driver driver){
        this.license = license;
        this.driver = driver;
    }
    


    /**
     * @return Integer return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return String return the license
     */
    public String getLicense() {
        return license;
    }

    /**
     * @param license the license to set
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * @return Account return the driver
     */
    public Driver getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    /**
     * @return Integer return the passegenger
     */
    public Integer getPassegenger() {
        return passegenger;
    }

    /**
     * @param passegenger the passegenger to set
     */
    public void setPassegenger(Integer passegenger) {
        if(passegenger == 4){
            this.passegenger = passegenger;
        }else{
            System.out.println("Necesitas como minomo 4 lugares");
        }
        
    }

}
