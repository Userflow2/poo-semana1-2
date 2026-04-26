public class Profesor {

    private int id; 
    private String nombre;
    private String materia;
    private String correo;
    private String especialidad;

    Profesor() {
    }

    public Profesor(int _id, String _nombre, String _materia, String _correo, String _especialidad) {
        setId(id);
        setNombre(nombre);
        setMateria(materia);
        setCorreo(correo);
        setEspecialidad(especialidad);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor [id=" + id + ", nombre=" + nombre + ", materia=" + materia + ", correo=" + correo
                + ", especialidad=" + especialidad + "]";
    } 
}
