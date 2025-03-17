package modelo;
import java.util.ArrayList;

public class modelo {
        private final ArrayList<String> fizzbuzz;
    public modelo(){
        this.fizzbuzz = new ArrayList<>();
    }

    public ArrayList<String> procesar(){
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzbuzz.add("fizzbuzz");
            } else if (i % 3 == 0) {
                fizzbuzz.add("fizz");
            } else if (i % 5 == 0) {
                fizzbuzz.add("buzz");
            } else {
                fizzbuzz.add(String.valueOf(i));
            }
        }
        return fizzbuzz;
    }
}