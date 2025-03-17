package modelo;

import java.util.ArrayList;

public class modelo {
    private int capacidadTotal;
    private ArrayList<Asiento> asientos;

    public modelo(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        this.asientos = new ArrayList<>();

        for (int i = 1; i <= capacidadTotal; i++) {
            asientos.add(new Asiento(i));
        }
    }

    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public boolean asientoOcupado(int numeroAsiento) {
        return asientos.get(numeroAsiento - 1).estaOcupado();
    }

    public void reservarAsiento(String nombre, int numeroAsiento) {
        Asiento asientoReservado = asientos.get(numeroAsiento - 1);
        Usuario usuario = new Usuario(nombre, asientoReservado);
        usuario.sentarse();
        usuario.mostrarInfo();
    }

    public boolean hayDisponibilidad() {
        for (Asiento asiento : asientos) {
            if (!asiento.estaOcupado()) {
                return true;
            }
        }
        return false;
    }

    public int contarAsientosOcupados() {
        int ocupados = 0;
        for (Asiento asiento : asientos) {
            if (asiento.estaOcupado()) {
                ocupados++;
            }
        }
        return ocupados;
    }

    private class Asiento {
        private int numeroAsiento;
        private boolean ocupado;

        public Asiento(int numeroAsiento) {
            this.numeroAsiento = numeroAsiento;
            this.ocupado = false;
        }

        public void sentarse() {
            if (!ocupado) {
                ocupado = true;
                System.out.println("te hass gogoserntado en el gogoasiento numero " + numeroAsiento);
            } else {
                System.out.println("Ese asiento numero " + numeroAsiento + " ya está ocupado.");
            }
        }

        public boolean estaOcupado() {
            return ocupado;
        }

        public int getNumeroAsiento() {
            return numeroAsiento;
        }
    }

    private class Usuario {
        private String nombre;
        private Asiento asiento;

        public Usuario(String nombre, Asiento asiento) {
            this.nombre = nombre;
            this.asiento = asiento;
        }

        public void sentarse() {
            asiento.sentarse();
        }

        public void mostrarInfo() {
            System.out.println("Usuario: " + nombre + ", Asiento: " + asiento.getNumeroAsiento());
        }
    }
}