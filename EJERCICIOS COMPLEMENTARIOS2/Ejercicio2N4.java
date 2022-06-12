import java.util.ArrayList;
import java.util.List;

// Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
// en 3 cursos (3 arrayList) e imprimir dichos cursos.


public class Ejercicio2N4 {
    public static void main(String[] args) {
        List<String> estudiantes = new ArrayList<String>();
        cargaListaEimprimir(estudiantes);
        separarACursoUnoEimprimir(estudiantes);
        separarACursoDosEimprimir(estudiantes);
        separarACursoTresEimprimir(estudiantes);
    }

    private static void separarACursoTresEimprimir(List<String> estudiantes) {
        List<String> cursoTres = new ArrayList<String>();
        cursoTres = estudiantes.subList(8, 12);
        System.out.print("CURSO TRES: ");
        for (String estudiante : cursoTres) {
            System.out.print(String.format("%s ", estudiante));
        }
        System.out.println();
    }
    
    private static void separarACursoDosEimprimir(List<String> estudiantes) {
        List<String> cursoDos = new ArrayList<String>();
        cursoDos = estudiantes.subList(4, 8);
        System.out.print("CURSO DOS: ");
        for (String estudiante : cursoDos) {
            System.out.print(String.format("%s ", estudiante));
        }
        System.out.println();
    }

    private static void separarACursoUnoEimprimir(List<String> estudiantes) {
        List<String> cursoUno = new ArrayList<String>();
        cursoUno = estudiantes.subList(0, 4);
        System.out.print("CURSO UNO: ");
        for (String estudiante : cursoUno) {
            System.out.print(String.format("%s ", estudiante));
        }
        System.out.println();
    }

    private static void cargaListaEimprimir(List<String> estudiantes) {
        estudiantes.add("Pablo");
        estudiantes.add("Carlos");
        estudiantes.add("Jose");
        estudiantes.add("Tomas");
        estudiantes.add("Maria");
        estudiantes.add("Mario");
        estudiantes.add("Ayelen");
        estudiantes.add("Florencia");
        estudiantes.add("Enrique");
        estudiantes.add("Juan");
        estudiantes.add("Sofia");
        estudiantes.add("Nicolas");
        
        System.out.print("ESTUDIANTES: ");
        for (String estudiante : estudiantes) {
            System.out.print(String.format("%s ", estudiante));
        }
        System.out.println();
    }
}
