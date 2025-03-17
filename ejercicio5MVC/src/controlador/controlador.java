package controlador;

import modelo.modelo;
import vista.vista;

public class controlador {
    private modelo modelo;
    private vista vista;

    public controlador(modelo modelo, vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        vista.mostrarTiempo(modelo.getTiempo());
        int avisos = modelo.validarSensor();
        if (avisos >= 2) {
            vista.mostrarAlarma(true);
        } else {
            vista.mostrarAlarma(false);
        }
        vista.mostrarDeteccion(avisos > 0, "movimiento");
    }
}