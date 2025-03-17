package controlador;

import modelo.modelo;
import vista.vista;
import java.util.ArrayList;

public class controlador {
    private modelo modelo;
    private vista vista;

    public controlador(modelo modelo, vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
       String mensaje = modelo.Informaciongogo();
       vista.mostrarInformaciongogo(mensaje);
    }
}