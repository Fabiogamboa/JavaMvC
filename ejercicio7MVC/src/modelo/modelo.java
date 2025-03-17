package modelo;

import java.util.ArrayList;
import java.util.Random;

public class modelo {
    private static Random random = new Random();
    private ArrayList<Boolean> datos;
    private static String mensaje1 = "aire prendido";
    private static String mensaje2 = "aire apagado";

    public modelo() {
        datos = new ArrayList<>();
        datitos();
    }

    private void datitos() {
        datos.add(random.nextBoolean());
        datos.add(random.nextBoolean());
        datos.add(random.nextBoolean());
    }

    public String Informaciongogo() {
        boolean tempMayor28 = datos.get(0);
        boolean humedadm60 = datos.get(1);
        boolean tempMayor30 = datos.get(2);

        if (tempMayor28 && humedadm60) {
            return mensaje1;
        } else if (tempMayor30) {
            return mensaje1;
        } else {
            return mensaje2;
        }
    }
}