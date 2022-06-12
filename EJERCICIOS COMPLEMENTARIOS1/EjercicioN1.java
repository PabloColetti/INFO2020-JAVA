import java.util.Scanner;

//  Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente
//  mensaje “HOLA {USUARIO}!!!”

public class EjercicioN1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("INGRESA NOMBRE DE USUARIO: ");
        String usuario = scan.nextLine();
        
        System.out.println(String.format("Hola %s!!!", usuario));
        scan.close();
    }
}
