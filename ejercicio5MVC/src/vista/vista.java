package vista;

public class vista {

    public void mostrarTiempo(String tiempo) {
        System.out.println("Es de " + tiempo);
    }

    public void mostrarDeteccion(boolean detectado, String tipoSensor) {
        if (detectado) {
            System.out.println("pilas que hay " + tipoSensor + "gogo");
        } else {
            System.out.println("No hay " + tipoSensor + "gogo");
        }
    }

    public void mostrarAlarma(boolean alarmaEncendida) {
        if (alarmaEncendida) {
            System.out.println("pipipipgogogogpipipipgogogopipipipigogogopipipipgogogogogogogogog");
        } else {
            System.out.println("Alarman´t");
        }
    }
}