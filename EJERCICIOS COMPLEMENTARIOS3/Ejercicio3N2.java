import java.util.List;
import java.util.stream.Collectors;

/**
 * Dada una lista que contiene números enteros, se deberá generar otra lista que
 * contendrá
 * el resultado de aplicar la operación de potencia a 2.
 */

public class Ejercicio3N2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        potenciarNumeros(numeros);
    }

    private static void potenciarNumeros(List<Integer> numeros) {
        List<Integer> numerosPotenciados = numeros.stream()
                .map(numero -> numero.intValue() * numero.intValue())
                .collect(Collectors.toList());

        System.out.println(numerosPotenciados);
    }
}
