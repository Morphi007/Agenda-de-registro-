package modelo;

/**
 * Estudiantes
 *
 * @author MPZ
 */

/*metodos y atributos  */
 /*set y get */
public class Estudiante {

    int id;
    String nombres;
    String apellidos;
    String matricula;
    String correo;
    String buscar;
    String materia;

    public Estudiante() {
    }

    public Estudiante(int id, String nombres, String apellidos, String matricula, String correo, String buscar, String materia) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.matricula = matricula;
        this.correo = correo;
        this.buscar = buscar;
        this.materia = materia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCorreo() {
        return correo;
    }

    public String getBuscar() {
        return buscar;
    }

    public String getMateria() {
        return materia;
    }

}
