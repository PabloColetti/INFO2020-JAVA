import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Dados 2 ArrayList que contienen horas-trabajadas (array1) y
// valor-por-hora(array2) del resumen de carga de horas semanal de un
// empleado. Se debe generar otra lista que contenga los totales y luego
// imprimir el total final a cobrar.

public class Ejercicio2N5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> horasTrabajadas = new ArrayList<Integer>();
        List<Integer> valorPorHora = new ArrayList<Integer>();
        List<Integer> totales = new ArrayList<Integer>();
        cargaDeHorasTrabajadasPorDia(horasTrabajadas, scan);
        cargaValorPorHora(valorPorHora, scan);
        calcularTotales(horasTrabajadas, valorPorHora, totales);
        totalACobrar(totales);
        scan.close();
    }

    private static void cargaDeHorasTrabajadasPorDia(List<Integer> horasTrabajadas, Scanner scan) {
        for (int dia = 1; dia <= 5; dia++) {
            String diaSemana = "";
            if (dia == 1) {
                diaSemana = "LUNES";
            } else if (dia == 2) {
                diaSemana = "MARTES";
            } else if (dia == 3) {
                diaSemana = "MIERCOLES";
            } else if (dia == 4) {
                diaSemana = "JUEVES";
            } else if (dia == 5) {
                diaSemana = "VIERNES";
            }

            System.out.print(String.format("INGRESA LAS HORAS DEL %s: ", diaSemana));
            int hora = scan.nextInt();
            horasTrabajadas.add(hora);
        }
    }

    private static void cargaValorPorHora(List<Integer> valorPorHora, Scanner scan) {
        for (int dia = 1; dia <= 5; dia++) {
            String diaSemana = "";
            if (dia == 1) {
                diaSemana = "LUNES";
            } else if (dia == 2) {
                diaSemana = "MARTES";
            } else if (dia == 3) {
                diaSemana = "MIERCOLES";
            } else if (dia == 4) {
                diaSemana = "JUEVES";
            } else if (dia == 5) {
                diaSemana = "VIERNES";
            }

            System.out.print(String.format("INGRESA VALOR POR HORA DEL DIA %s: $", diaSemana));
            int valor = scan.nextInt();
            valorPorHora.add(valor);
        }
    }

    private static void calcularTotales(List<Integer> horasTrabajadas, List<Integer> valorPorHora,
            List<Integer> totales) {
        for (int totalNum = 0; totalNum <= 4; totalNum++) {
            int total = horasTrabajadas.get(totalNum) * valorPorHora.get(totalNum);
            totales.add(total);
        }
    }

    private static void totalACobrar(List<Integer> totales) {
        int total = 0;
        for (int totalNum = 0; totalNum <= 4; totalNum++) {
            total = total + totales.get(totalNum);
        }
        System.out.println(totales);
        System.out.println(String.format("TOTAL FINAL A COBRAR: $%s", total));
    }
}
