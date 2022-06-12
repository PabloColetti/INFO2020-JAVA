import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Crear una función que dado 2 argumentos (int, siendo el primero menor al
// segundo), nos devuelva un array de Strings. Con la secuencia de números
// enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
// “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara
// “FizzBuzz”.
// Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
// segundo con qué valor debe frenar (no se incluye en el cálculo)
// Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4

public class Ejercicio2N7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("INGRESA DOS NUMEROS ENTEROS:");
        int numeroInicio = scan.nextInt();
        int numeroFinal = scan.nextInt();
        List<String> resultado = fizzBuzzFuncion(numeroInicio, numeroFinal);
        System.out.println(resultado);
        scan.close();
    }

    private static List<String> fizzBuzzFuncion(int numeroInicio, int numeroFinal) {
        List<String> secuencia = new ArrayList<String>();
        for (Integer numero = numeroInicio; numero < numeroFinal; numero++) {
            if (numero % 2 != 0 && numero % 3 != 0) {
                secuencia.add(String.valueOf(numero));
            } else if (numero % 2 == 0) {
                if (numero % 3 == 0) {
                    secuencia.add("FizzBuzz");
                } else {
                    secuencia.add("Fizz");
                }
            } else if (numero % 3 == 0) {
                secuencia.add("Buzz");
            }
        }
        return secuencia;
    }
}
