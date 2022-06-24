import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Se dispone de una lista de Strings, de la cual saber la cantidad de valores que
 * comiencen con la letra B (tanto mayúscula como minúscula, en ese caso decimos que será
 * ignoreCase).
 */

public class Ejercicio3N3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        ignoreCase(palabras);

    }

    private static void ignoreCase(List<String> palabras) {
    //    List<String> palabrasStream = palabras.stream()
    //    .count(palabra -> palabra.startsWith("B") || palabra.startsWith("b")).sum();

    //    System.out.println(palabrasStream);

    }
}
