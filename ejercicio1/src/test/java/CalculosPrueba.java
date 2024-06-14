import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import logica_20242.Calculos;

/*public static void main(String[] args) {
    new CalculosPrueba().probar_ValAbs();
}*/

public class CalculosPrueba {

    @Test
    public void probar_ValAbs(){
        Calculos calculo = new Calculos();
        int res_val_ab = calculo.ValAbs(-5);

        //se evalua el valor esperado con assertEquals
        assertEquals(5, res_val_ab, "El valor absoluto de -5 es 5");

    }

}
