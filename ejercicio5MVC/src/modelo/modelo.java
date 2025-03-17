package modelo;

import java.util.ArrayList;
import java.util.Random;

public class modelo {
    private final Random random = new Random();
    private final ArrayList<String> datoTiempogogo;
    private final boolean booleanogogo;
    private String tiempo;

    public modelo() {
        this.booleanogogo = random.nextBoolean();
        this.datoTiempogogo = new ArrayList<>();
        determinarTiempo();
    }

    private void determinarTiempo() {
        tiempo = booleanogogo ? "noche" : "dia";
        datoTiempogogo.add(tiempo);
    }

    public int validarSensor() {
        int avisos = 0;
        for (int i = 0; i < 3; i++) {
            if (random.nextInt(2) + 1 == 1 && datoTiempogogo.get(0).equals("noche")) {
                avisos++;
            }
        }
        return avisos;
    }

    public String getTiempo() {
        return tiempo;
    }
}