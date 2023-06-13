public class Car {
    // Atributos
    int id;
    Account driver; // Herencia???+
    String license;
    int passegenger;

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
}
