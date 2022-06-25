import java.time.LocalDate;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Se posee una Lista con objetos de clase Alumno con los atributos: apellido,
 * nombre y fechaDeNacimiento (con tipos: String, String y LocalDate). Se desea
 * generar un Map<String, Integer> donde la clave de Map será el apellido
 * concatenado con el nombre (con separador de espacio en blanco) y el value la
 * edad del alumno.
 * ● La lista de entrada debe estar cargada con varios alumnos (al menos 5)
 * para subir el ejemplo y demostrar su funcionamiento.
 * ● En ejemplo se muestra solo con 1 Alumno a modo de abreviar
 * ● En el ejemplo también se usa LocalDate.now().minusYears(30), en el
 * ejercicio a presentar se deberá usar otra tecnica de construcción para la
 * fecha (no usar .now(). Pueden ver métodos .parse(), etc)
 */

public class Ejercicio3N5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
                new Alumno("Simpson", "Homero", "1982-01-01"),
                new Alumno("Simpson", "Marge", "1984-02-02"),
                new Alumno("Simpson", "Bart", "2012-03-03"),
                new Alumno("Simpson", "Lisa", "2014-04-04"),
                new Alumno("Simpson", "Maggie", "2019-05-05"));
        Map<String, Integer> edadAlumno = new HashMap<>();
        solicitarEdad(alumnos, edadAlumno);
        System.out.println(edadAlumno);
        System.out.println("Edad de Homero");
        System.out.println(edadAlumno.get("Simpson Homero"));
        System.out.println("Edad de Marge");
        System.out.println(edadAlumno.get("Simpson Marge"));
        System.out.println("Edad de Bart");
        System.out.println(edadAlumno.get("Simpson Bart"));
        System.out.println("Edad de Lisa");
        System.out.println(edadAlumno.get("Simpson Lisa"));
        System.out.println("Edad de Maggie");
        System.out.println(edadAlumno.get("Simpson Maggie"));
    }

    private static void solicitarEdad(List<Ejercicio3N5.Alumno> alumnos, Map<String, Integer> edadAlumno) {
        for (Alumno alumno : alumnos) {
            edadAlumno.put(String.format("%s %s", alumno.getApellido(), alumno.getNombre()), alumno.getEdad());
        }
    }

    private static class Alumno {
        private String apellido;
        private String nombre;
        private LocalDate fechaDeNacimiento;

        public Alumno(String apellido, String nombre, String fechaDeNacimiento) {
            this.apellido = apellido;
            this.nombre = nombre;
            this.fechaDeNacimiento = LocalDate.parse(fechaDeNacimiento);
        }

        public String getApellido() {
            return apellido;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return Calendar.getInstance().get(Calendar.YEAR)-fechaDeNacimiento.getYear();
        }
    }
}
