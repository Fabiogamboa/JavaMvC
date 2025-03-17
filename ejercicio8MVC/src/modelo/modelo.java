package modelo;

import java.util.ArrayList;
import java.util.Random;

public class modelo {
    private static Random random = new Random();
    private ArrayList<Integer> datos;

    public modelo() {
        datos = new ArrayList<>();
        datos.add(random.nextInt(3) + 1);
        datos.add(random.nextInt(24) + 1);
    }

    public String Validarentrada() {
        int membresia = datos.get(0);
        int hora = datos.get(1);
        String resultado = "";
        if (membresia == 1 && hora >= 6 && hora <= 18) {
            resultado = "el cliente tiene membresia y pudo entrar";
        } else if (membresia == 2 && hora >= 6 && hora <= 18) {
            resultado = "el cliente es empleado y pudo entrar";
        } else {
            resultado = "el cliente no pudo entrar";
        }
        return resultado;
    }
}