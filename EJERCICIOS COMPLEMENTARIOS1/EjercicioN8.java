import java.util.Scanner;

// Crear una aplicación que solicite de entrada los datos de una persona en este
// orden:
// 
// Nombre y Apellido
// Edad
// Dirección
// Ciudad
// 
// Luego imprimirá el siguiente mensaje:
// {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}

public class EjercicioN8 {
    public static void main(String[] args) {

        String nombre;
        int edad;
        String direccion;
        String ciudad;

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        
        System.out.print("NOMBRE: ");
        nombre = scan1.nextLine();
        System.out.print("EDAD: ");
        edad = scan1.nextInt();

        System.out.print("DIRECCION: ");
        direccion = scan2.nextLine();
        System.out.print("CIUDAD: ");
        ciudad = scan2.nextLine();
        
        System.out.println(String.format("%s - %s - %d - %s ", ciudad, direccion, edad, nombre));

        scan1.close();
        scan2.close();
    }
}
