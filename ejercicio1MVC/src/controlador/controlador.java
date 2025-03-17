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
        while (true) {
            if (modelo.hayDisponibilidad()) {
                String nombre = vista.obtenerNombreUsuario();
                int numeroAsiento;
                while (true) {
                    numeroAsiento = vista.obtenerNumeroAsiento();
                    vista.limpiarBuffer();

                    if (numeroAsiento < 1 || numeroAsiento > modelo.getCapacidadTotal()) {
                        vista.mostrarMensaje("Asienton´t.");
                    } else if (modelo.asientoOcupado(numeroAsiento)) {
                        vista.mostrarMensaje("El asiento" + numeroAsiento + " ya está ocupado.");
                    } else {
                        break;
                    }
                }
                modelo.reservarAsiento(nombre, numeroAsiento);
                vista.mostrarMensaje("Reserva confirmadagogoogo. Asientos ocupados: " + modelo.contarAsientosOcupados() + "/" + modelo.getCapacidadTotal());
            } else {
                vista.mostrarMensaje("No hay mas asientosss");
                break;
            }
        }
        vista.cerrarScanner();
    }
}