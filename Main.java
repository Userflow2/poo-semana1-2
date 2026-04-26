
public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante(1001, "Juan Perez", 16.5);
        Estudiante e2 = new Estudiante(1002, "Maria Gomez", 14.0);
        Estudiante e3 = new Estudiante(1003, "Carlos Sanchez", 18.0);

        e1.mostraInfo();
        e2.mostraInfo();
        e3.mostraInfo();

        System.out.println("Totala de estudiantes: " + Estudiante.getTotalEstudiantes());
    }
}

