package vista;
import java.util.Scanner;
import java.util.ArrayList;

public class vista {

    private Scanner scannergo;
    private final ArrayList<Integer> numeritos;

    public vista(){
        this.scannergo = new Scanner(System.in);
        this.numeritos = new ArrayList<>();
    }

    public ArrayList<Integer> opciongogo(){
        System.out.println("bienvenido al sistema de invernaderos pescado");
        System.out.println("ingrese lo que desea hacergogo:");
        System.out.println("1. iniciar sistema");
        System.out.println("2. Salir");
        int opcion = scannergo.nextInt();
        numeritos.add(opcion);
        return numeritos;
    }
    
    public void mostrarResultado(String resultado){
        System.out.println(resultado);
    }
    
    public void mostrarInfo(Double mensaje){
        System.out.println("la temperaturaa actual es de " + mensaje);
    }
    
    public void mostrarError(String mensaje){
        System.out.println(mensaje);
    }

    public void finalgogo() {
        System.out.println("byeeeeee");
    }
    
    
}