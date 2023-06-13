public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        Account persona = new Account();

        // Asignar datos a los atributos
        persona.id= 12321;
        persona.name="dibot55";
        persona.email="dibot55@gmail.com";
        persona.document="fino";
        persona.password="oiezi";

        System.out.println(persona.name);
    }
}