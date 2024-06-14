package logica_20242;

public class Calculos {

    public static int ValAbs(int nro){

        int val_ret = nro;
        if (nro < 0) 
            val_ret = nro * -1;

        return val_ret;

    }

}
