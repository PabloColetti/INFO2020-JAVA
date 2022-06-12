import java.util.Scanner;

// 6. Se desea una aplicación que solicite 2 números enteros y realice la operación
// de potencia (sin uso de librerías).

public class EjercicioN6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("INGRESA DOS NUMEROS ENTEROS:");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();

        int resultado = (numero2 == 0) ? 1 : potencia(numero1, numero2);
        System.out.println(String.format("EL RESULTADO DE %s ELEVADO A LA POTENCIA %s ES %s", numero1, numero2, resultado));

        scan.close();
    }

    public static int potencia(int numero1, int numero2) {
        int total = 1;
        for (int i = 1; i <= numero2; i++) {
            total = total * numero1;
        }
        return total;
    }
}