import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el 
// ranking

public class Ejercicio2N1 {
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<>();
        cargarCiudades(ciudades);
        imprimirRanking(ciudades);
    }

    private static void imprimirRanking(List<String> ciudades) {
        int posicion = 1;
        for (String ciudad : ciudades) {
            System.out.println(String.format("#%s - %s", posicion, ciudad));
            posicion += 1;
        }
    }

    private static void cargarCiudades(List<String> ciudades) {
        Scanner scan = new Scanner(System.in);
        
        for (int numCiudad = 1; numCiudad <= 3; numCiudad++) {
            System.out.print(String.format("INGRESA TU CIUDAD FAVORITA NRO %s: ", numCiudad));
            String ciudad = scan.nextLine();
            ciudades.add(ciudad);
        }

        scan.close();
    }
}
