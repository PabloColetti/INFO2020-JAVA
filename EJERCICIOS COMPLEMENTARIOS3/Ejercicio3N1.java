import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Dada una lista que contiene valores de tipo String, se deberá filtrar todos
 * los valores que NO sean null o vacío ("").
 */

public class Ejercicio3N1 {

    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        inputDeDatos(palabras);
        filtrado(palabras);
    }

    private static void filtrado(List<String> palabras) {
        List<String> palabrasFiltradas = palabras.stream()
                .filter(palabra -> palabra != null && !palabra.isBlank())
                .collect(Collectors.toList());

        System.out.println(palabrasFiltradas);
    }

    private static void inputDeDatos(List<String> palabras) {
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
    }
}