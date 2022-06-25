import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// Se dispone de una colección de Empleados, de cada empleado se conoce:
// ○ Nombre y Apellido
// ○ DNI
// ○ horasTrabajadas
// ○ valorPorHora
// - Todos los empleados están cargados en un Set (HashSet), se desea calcular el
// sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
// almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
// (value) es el sueldo calculado.

public class Ejercicio2N6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Set<Ejercicio2N6Empleado> empleados = new HashSet<Ejercicio2N6Empleado>();
        Map<Integer, Integer> sueldos = new HashMap<Integer, Integer>();

        cargaEmpleado(scan, scan2, empleados);
        calcularSueldo(empleados, sueldos);
        imprimirEmpleados(empleados);
        imprimirSueldos(sueldos);
        scan.close();
        scan2.close();
    }

    private static void imprimirSueldos(Map<Integer, Integer> sueldos) {
        for (Map.Entry<Integer, Integer> sueldo : sueldos.entrySet()) {
            System.out.println(
                    String.format("TODOS LOS SUELDOS:\n- DNI: %s | SUELDO: $%s\n", sueldo.getKey(), sueldo.getValue()));
        }
    }

    private static void calcularSueldo(Set<Ejercicio2N6Empleado> empleados, Map<Integer, Integer> sueldos) {
        for (Ejercicio2N6Empleado empleado : empleados) {
            int sueldo = empleado.getHorasTrabajadas() * empleado.getValorPorHora();
            sueldos.put(empleado.getDni(), sueldo);
        }
    }

    private static void imprimirEmpleados(Set<Ejercicio2N6Empleado> empleados) {
        for (Ejercicio2N6Empleado empleado : empleados) {
            System.out.println(String.format(
                    "\nTODOS LOS EMPLEADOS:\nDNI: %s | NOMBRE: %s | APELLIDO %s | HORAS TRABAJADAS: %s | VALOR POR HORA: $%s\n",
                    empleado.getDni(), empleado.getNombre(), empleado.getApellido(), empleado.getHorasTrabajadas(),
                    empleado.getValorPorHora()));
        }
    }

    private static void cargaEmpleado(Scanner scan, Scanner scan2, Set<Ejercicio2N6Empleado> empleados) {
        while (true) {
            System.out.print(String.format("\nDESEA INGRESAR UN NOMBRE (PRESIONA LA TECLA ENTER O INGRESA SALIR): "));
            String carga = scan.nextLine();
            if (carga == "") {
                System.out.print(String.format("- INGRESE EL NOMBRE: "));
                String nombre = scan.nextLine();

                System.out.print(String.format("- INGRESE EL APELLIDO: "));
                String apellido = scan.nextLine();

                System.out.print(String.format("- INGRESE EL DNI: "));
                int dni = scan2.nextInt();

                System.out.print(String.format("- INGRESE LAS HORAS TRABAJADAS: "));
                int horasTrabajadas = scan2.nextInt();

                System.out.print(String.format("- INGRESE EL VALOR POR HORA: $"));
                int valorPorHora = scan2.nextInt();

                Ejercicio2N6Empleado empleado = new Ejercicio2N6Empleado(nombre, apellido, dni, horasTrabajadas,
                        valorPorHora);

                empleados.add(empleado);
            } else {
                break;
            }
        }
    }

    private static class Ejercicio2N6Empleado {
        private String nombre;
        private String apellido;
        private int dni;
        private int horasTrabajadas;
        private int valorPorHora;

        public Ejercicio2N6Empleado(String nombre, String apellido, int dni, int horasTrabajadas, int valorPorHora) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
            this.horasTrabajadas = horasTrabajadas;
            this.valorPorHora = valorPorHora;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public int getDni() {
            return dni;
        }

        public int getHorasTrabajadas() {
            return horasTrabajadas;
        }

        public int getValorPorHora() {
            return valorPorHora;
        }

        @Override
        public String toString() {
            return "Ejercicio2N6Empleado [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
                    + ", horasTrabajadas=" + horasTrabajadas
                    + ", valorPorHora=" + valorPorHora + "]";
        }
    }
}
