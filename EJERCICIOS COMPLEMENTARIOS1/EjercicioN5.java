import java.util.Scanner;

// Se desea una aplicación que solicite 2 números enteros y realice la operación
// de multiplicación por sumas sucesivas (sin uso de librerías).

public class EjercicioN5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("INGRESA DOS NUMEROS ENTEROS:");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();

        int resultado = sumaSuscesiva(numero1, numero2);
        System.out.println(String.format("%s x %s = %s", numero1, numero2, resultado));

        scan.close();
    }

    public static int sumaSuscesiva(int numero1, int numero2) {
        int total = 0;
        for (int i = 1; i <= numero2; i++) {
            total = total + numero1;
        }
        return total;
    }
}
