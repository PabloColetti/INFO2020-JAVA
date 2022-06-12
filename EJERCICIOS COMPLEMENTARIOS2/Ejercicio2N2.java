import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio de la
// lista y otro al final. Por último, iterar e imprimir los elementos de la lista y el tamaño de la 
// misma (antes y después de agregar a en la primera y última posición).

public class Ejercicio2N2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<Integer>();
        cargaInicial(numeros, scan);
        imprimirLista(numeros);
        cargaFinal(numeros, scan);
        imprimirLista(numeros);
        scan.close();
    }

    private static void imprimirLista(List<Integer> numeros) {
        for (Integer numero : numeros) {
            System.out.print(String.format("%s ", numero));
        }
        System.out.println(String.format("Y EL TAMAÑO DE LA LISTA ES: %d", numeros.size()));
    }

    private static void cargaInicial(List<Integer> numeros, Scanner scan) {
        for (int numEntero = 1; numEntero <= 5; numEntero++) {
            System.out.println("INGRESA UN NUMERO ENTERO:");
            Integer entero = scan.nextInt();
            numeros.add(entero);
        }
    }
    
    private static void cargaFinal(List<Integer> numeros, Scanner scan) {
        int enteroInicio;
        int enteroFinal;

        System.out.println("INGRESA UN NUMERO ENTERO PARA EL INICIO:");
        enteroInicio = scan.nextInt();
        numeros.add(0, enteroInicio);
        System.out.println("INGRESA UN NUMERO ENTERO PARA EL FINAL:");
        enteroFinal = scan.nextInt();
        numeros.add(enteroFinal);
    }

}