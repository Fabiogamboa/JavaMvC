package ejercicio3mvc;

import controlador.controlador;
import modelo.modelo;
import vista.vista;

public class Ejercicio3MVC {
    public static void main(String[] args) {
        modelo modelo = new modelo();
        vista vista = new vista();
        controlador controlador = new controlador(modelo, vista);
        controlador.iniciar();
    }
}