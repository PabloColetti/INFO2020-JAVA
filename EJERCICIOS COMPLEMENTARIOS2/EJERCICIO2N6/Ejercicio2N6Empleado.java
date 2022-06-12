package EJERCICIO2N6;

// Se dispone de una colección de Empleados, de cada empleado se conoce:
// ○ Nombre y Apellido
// ○ DNI
// ○ horasTrabajadas
// ○ valorPorHora
// - Todos los empleados están cargados en un Set (HashSet), se desea calcular el
// sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
// almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
// (value) es el sueldo calculado.

public class Ejercicio2N6Empleado {
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(int valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return "Ejercicio2N6Empleado [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", horasTrabajadas=" + horasTrabajadas
        + ", valorPorHora=" + valorPorHora + "]";
    }  

    
}