public class Car {
    // Atributos
    private int id;
    private Account driver; // Herencia???+
    private String license;
    private int passegenger;

    // Constructor
    public Car(Account driver, String license, int passegenger){
        this.driver=driver;
        this.license=license;
        this.passegenger=passegenger;
    }

    /**
     * Imprime la informacion de los atributos de la clase
     * */
    public void printData(){
        driver.printDataAccount();
        System.out.println(license);
        System.out.println(passegenger);
    }
// Encapsulamiento
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getPassegenger(){
        return passegenger;
    }

    public void setPassegenger(int value){
        this.passegenger = value;
    }
}
