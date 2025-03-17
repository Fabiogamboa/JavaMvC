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
        ArrayList<Integer> datitos = vista.opciongogo();
        int opc = datitos.get(0);
        int bucle = 0;
        while (true) {
            if (opc == 2){
                vista.mostrarResultado("byeeeee");
                break;
            }else{
                double temp = modelo.leerTemperatura();
                vista.mostrarInfo(temp);
                String resp = modelo.monitorear(temp);
                vista.mostrarResultado(resp);
                if (resp == "normal"){
                    break;
                }
                bucle++;
                if (bucle==20){
                    ArrayList<Integer> buclegogo = vista.opciongogo();
                    if (buclegogo.get(0)==2){
                        bucle = 0;
                        break;
                    }
                }
            }
        }
        vista.mostrarResultado("Byeeeeeeeeeeeee");
    }
}