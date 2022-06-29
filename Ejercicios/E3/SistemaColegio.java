package Ejercicios.E3;

public class SistemaColegio implements ISistema{
    private String nombre;
    private String capacidad;
    private Estudiante[] estudiantes;
    private String requisitos;

    public SistemaColegio(String nombre, String capacidad,  Estudiante[] estudiantes, String requisitos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.requisitos = requisitos;
    }

    @Override
    public void inscribirse() {
        System.out.println("<<<<=== Sistema Del Colegio ===>>>>");
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("<--- Lista De Estudiantes --->");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("CI: " + estudiante.getCi());
        }
        System.out.println(|"<----------> ");
        System.out.println("Requistos: " + requisitos);
        System.out.println("<<<<=== Sistema Del Colegio ===>>>>");
    }
}
