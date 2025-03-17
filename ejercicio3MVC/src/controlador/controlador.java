package controlador;

import modelo.modelo;
import vista.vista;
import java.util.ArrayList;

public class controlador {
    private modelo modelo;
    private vista vista;
    private ArrayList<Double> datitos;

    public controlador(modelo modelo, vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.datitos = new ArrayList<>();
    }

    public void iniciar() {
        while (true) {
            int opc = vista.opciongogo();
            if (opc == 5){
                vista.finalgogo();
                break;
            }else{
                this.datitos = vista.solicitarInfo();
                double numA = datitos.get(0);
                double numB = datitos.get(1);
                if (opc == 1) {
                double resultado = modelo.sumar(numA, numB);
                vista.mostrarResultado(resultado);
                vista.limpiarListagogo();
            } else if (opc == 2) {
                double resultado = modelo.restar(numA, numB);
                vista.mostrarResultado(resultado);
                 vista.limpiarListagogo();
            } else if (opc == 3) {
                double resultado = modelo.multiplicar(numA, numB);
                vista.mostrarResultado(resultado);
                 vista.limpiarListagogo();
            } else if (opc == 4) {
                if (numB != 0 || numA != 0) {
                    double resultado = modelo.dividir(numA, numB);
                    vista.mostrarResultado(resultado);
                    vista.limpiarListagogo();
                } else {
                    vista.mostrarError("ese 0 que pndjo");
                    vista.limpiarListagogo();
                }
            } else {
                vista.mostrarError("eso que gorda");
                 vista.limpiarListagogo();
            }
            }
        }
    }
}