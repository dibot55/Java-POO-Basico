public class UberX extends Car{
    // Atributos
    String brand;
    String model;
    // Constructor
        public UberX(
            // Atributos heredados
            Account driver,
            String licence,
            int passegenger,
            // Mis atributos
            String brand,
            String model
            ){
        // Deben ser llamados en el orden correcto
        super(driver, licence, passegenger);
        // Las asignaciones van despues del super
        this.brand=brand;
        this.model=model;
    }

    // Otro tipo de Polimorfismo
    @Override
    public void printData() {
        super.printData();
        System.out.println(brand);
        System.out.println(model);
    }
}
