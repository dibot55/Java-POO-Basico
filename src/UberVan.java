import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car{
    // Atributos
    Map<String, Map<String, Integer>> typeCarAcepted; // Arreglo que contiene otro arreglo
    ArrayList<String> seatsMAterial;

    // Constructor
    public UberVan(
            // Atributos heredados
            Account driver,
            String licence,
            int passegenger,
            Map<String, Map<String, Integer>> typeCarAcepted,
            ArrayList<String> seatsMAterial
    ){
        super(driver, licence, passegenger);
        this.typeCarAcepted = typeCarAcepted;
        this.seatsMAterial=seatsMAterial;
    }
}
