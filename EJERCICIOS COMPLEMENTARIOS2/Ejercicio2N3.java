import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa (solo los 
// valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso 
// (reverse), desordenar (mezclar) el arrayList y volver a imprimir.

public class Ejercicio2N3 {
    public static void main(String[] args) {
        List<Integer> barajaFranchute = new ArrayList<Integer>();
        cargaInicial(barajaFranchute);
        repartir(barajaFranchute);
        repartirInverso(barajaFranchute);
        repartirMezclado(barajaFranchute);
    }

    private static void repartirMezclado(List<Integer> barajaFranchute) {
        Collections.shuffle(barajaFranchute);
        repartir(barajaFranchute);
    }

    private static void repartirInverso(List<Integer> barajaFranchute) {
        Collections.reverse(barajaFranchute);
        repartir(barajaFranchute);
    }

    private static void repartir(List<Integer> numeros) {
        for (Integer numero : numeros) {
            System.out.print(String.format("%s ", numero));
        }
        System.out.println();
    }

    private static void cargaInicial(List<Integer> barajaFranchute) {
        for (int numEntero = 1; numEntero <= 13; numEntero++) {
            barajaFranchute.add(numEntero);
        }
    }
}
