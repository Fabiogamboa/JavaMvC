package ejercicio8mvc;

import controlador.controlador;
import modelo.modelo;
import vista.vista;

public class Ejercicio8MVC {
    public static void main(String[] args) {
        modelo modelo = new modelo();
        vista vista = new vista();
        controlador controlador = new controlador(modelo, vista);
        controlador.iniciar();
    }
}