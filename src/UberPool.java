public class UberPool extends Car{
    // Atributos
    String brand;
    String model;
    // Constructor
    public UberPool(
            // Atributos heredados
            Account driver,
            String licence,
            int passegenger,
            // Mis atributos
            String brand,
            String model
    ){
        super(driver, licence, passegenger);
        this.brand=brand;
        this.model=model;
    }
}
