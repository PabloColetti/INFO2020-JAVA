import java.util.List;
import java.util.stream.Collectors;

/**
 * Se dispone de una lista de Integer, de la cual queremos obtener otra lista
 * aplicando la operación de factorial pero no se desean valores repetidos.
 */

public class Ejercicio3N4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);
        factorialLista(numeros);
    }

    private static void factorialLista(List<Integer> numeros) {
        List<Integer> numerosFactorial = (List<Integer>) numeros.stream()
        .distinct()
        .map(numero -> factorial(numero.intValue()))
        .collect(Collectors.toList());

        System.out.println(numerosFactorial);
    }
    
    private static int factorial(int numero) {
        int total = 1;
        for (int i = 1; i <= numero; i++) {
            total = total * i;
        }
        return total;
    }    
}
