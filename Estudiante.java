// Estudiante.java — clase creada en Semana 2
public class Estudiante {

    // Atributos
    private int codigo;
    private String nombre;
    private double nota;


    //Variable stática: Compartida por todos los estudiantes
    private static int totalEstudiantes = 0;

    public Estudiante() {
    }

    public Estudiante(int _codigo, String _nombre, double _nota) {
        setCodigo(_codigo);
        setNombre(_nombre);
        setNota(_nota);

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    //Metodo static
    public static int getTotalEstudiantes() {
        return totalEstudiantes;
    }
    
    public void mostraInfo(){
        System.out.println("Estudiante: " + nombre + " |  Nota: " + nota);
        
    }

}
