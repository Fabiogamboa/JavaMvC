package vista;
import java.util.Scanner;
import java.util.ArrayList;

public class vista {

    private Scanner scannergo;
    private final ArrayList<Double> numeritos;

    public vista(){
        this.scannergo = new Scanner(System.in);
        this.numeritos = new ArrayList<>();
    }

    public int opciongogo(){
        System.out.println("bienvenido a la calculadora -500 mas insana de la region, a continuacion");
        System.out.println("ingrese lo que desea hacergogo:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        int opcion = scannergo.nextInt();
        return opcion;
    }
    
    public ArrayList<Double> solicitarInfo(){
        System.out.println("ingrese el primer numero");
        double num1 = scannergo.nextDouble();
        System.out.println("ingrese el segundo numero");
        double num2 = scannergo.nextDouble();
        numeritos.add(num1);
        numeritos.add(num2);
        return numeritos;
    }
    
    public void mostrarResultado(double resultado){
        System.out.println("El resultado de eso fue de "+ resultado);
    }
    
    public void limpiarListagogo(){
        numeritos.clear();
    }
    
    public void mostrarError(String mensaje){
        System.out.println(mensaje);
    }

    public void finalgogo() {
        System.out.println("byeeeeee");
    }
    
    
}