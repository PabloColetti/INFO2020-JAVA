import java.util.Scanner;

// Realizar un programa que solicite por consola 2 números enteros. Para luego
// imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto
// de la división) de ambos números.

public class EjercicioN2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("INGRESA DOS NUMEROS ENTEROS:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(String.format("%s + %s = %s", num1, num2, num1 + num2));
        System.out.println(String.format("%s - %s = %s", num1, num2, num1 - num2));
        System.out.println(String.format("%s * %s = %s", num1, num2, num1 * num2));
        System.out.println(String.format("%s / %s = %s", num1, num2, num1 / num2));
        System.out.println(String.format("%s %% %s = %s", num1, num2, num1 % num2));

        scan.close();
    }
}