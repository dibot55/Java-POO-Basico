public class Main {
    public static void main(String[] args) {
        // Conductor del uber
        Account conductorUber = new Account(
                "yeyo san",
                "dibot55@gmail.com",
                "fino",
                "oiezi");
        conductorUber.id=1;

        //conductorUber.printDataAccount();

        // Carro de uber
        Car carrito = new Car(conductorUber, "mit", 2);
        carrito.printData();
    }
}