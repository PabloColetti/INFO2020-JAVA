import java.util.Scanner;
// Realizar un programa que dado un String de entrada en minúsculas lo
// convierta por completo a mayúsculas. Sin uso de métodos o librerías que
// realicen toUppercase().

public class EjercicioN7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("INGRESA PALABRAS EN MINUSCULA:");
        String palabrasIngresadas = scan.nextLine();

        String resultado = convierteAMayusculas(palabrasIngresadas);
        System.out.println(String.format("%s", resultado));

        scan.close();
    }

    public static String convierteAMayusculas(String palabraMinusculas) {
        String palabraMayuscula = "";
        char letraMinuscula;

        for (int iteracion = 0; iteracion < palabraMinusculas.length(); iteracion++) {
            letraMinuscula = palabraMinusculas.charAt(iteracion);

            if ((int)letraMinuscula >= 97 && letraMinuscula <= 122) {
                letraMinuscula = (char)(letraMinuscula-32);
            }

            palabraMayuscula += String.format("%s", letraMinuscula);
        }
        return palabraMayuscula;
    }
}
