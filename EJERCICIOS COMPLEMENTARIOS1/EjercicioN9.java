import java.io.IOException;
import java.util.Scanner;

// Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que
// aparece una letra dada.

public class EjercicioN9 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.print("INGRESA UN STRING (FRASE, TEXTO, ETC): ");
        String palabrasIngresadas = scan.nextLine();
        
        System.out.print("INGRESA UNA LETRA A CALCULAR CANTIDAD DE VECES QUE APARECE: ");
        char letraIngresada;
        letraIngresada = (char)System.in.read();
        System.out.println(String.format("LETRA INGRESADA: %s", letraIngresada));
        

        int resultado = letraAparece(palabrasIngresadas, letraIngresada);
        System.out.println(String.format("%s", resultado));

        scan.close();
    }

    private static int letraAparece(String palabrasIngresadas, char letraIngresada) {
        int aparece = 0;
        char letraIteracion;

        for (int iteracion = 0; iteracion < palabrasIngresadas.length(); iteracion++) {
            letraIteracion = palabrasIngresadas.charAt(iteracion);

            if (letraIteracion == letraIngresada) {
                aparece += 1;
            }
        }
        return aparece;
    }
}
