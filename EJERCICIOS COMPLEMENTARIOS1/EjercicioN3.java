import java.util.Scanner;

// Confeccionar un programa que dado un número entero como dato de entrada
// imprima la secuencia de números (incrementos de 1) de la siguiente forma:

public class EjercicioN3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("INGRESA UN NUMERO ENTERO:");
        int num1 = scan.nextInt();

        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(String.format("%s ", j));
            }
            System.out.print("\n");
        }

        scan.close();
    }
}
