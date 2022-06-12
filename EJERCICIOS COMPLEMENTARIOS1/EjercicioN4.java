import java.util.Scanner;

// Realizar un programa que calcule el factorial de un número:
// n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
// Sin hacer uso de librerías.

public class EjercicioN4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("INGRESA UN NUMERO ENTERO:");
        int numero = scan.nextInt();
        int resultado = factorial(numero);
        System.out.println(String.format("EL FACTORIAL DE %s ES: %s", numero, resultado));

        scan.close();
    }

    public static int factorial(int numero) {
        int total = 1;
        for (int i = 1; i <= numero; i++) {
            total = total * i;
        }
        return total;
    }
}
