package vista;

import java.util.Scanner;

public class vista {
    private Scanner scanner;

    public vista() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String obtenerNombreUsuario() {
        System.out.print("Ingrese su nombre: ");
        return scanner.nextLine();
    }

    public int obtenerNumeroAsiento() {
        System.out.print("Ingrese el número de asiento: ");
        return scanner.nextInt();
    }

    public void limpiarBuffer() {
        scanner.nextLine(); 
    }

    public void cerrarScanner() {
        scanner.close();
    }
}