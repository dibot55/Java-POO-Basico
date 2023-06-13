import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car{
    // Atributos
    Map<String, Map<String, Integer>> typeCarAcepted; // Arreglo que contiene otro arreglo
    ArrayList<String> seatsMAterial;

    // Constructor
    public UberBlack(
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
