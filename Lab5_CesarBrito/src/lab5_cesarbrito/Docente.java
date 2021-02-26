package lab5_cesarbrito;

public class Docente extends Persona {

    private String nombre;
    private String apellido;
    private int numRegistro;
    private String clase;
    private String facultad;
    private boolean distintas;
    private String conocimiento;
    private boolean lab;

    public Docente() {
        super();
    }

    public Docente(String nombre, String apellido, int numRegistro, String clase, String facultad, boolean distintas, String conocimiento, boolean lab, String usuario, String password) {
        super(usuario, password);
        this.nombre = nombre;
        this.apellido = apellido;
        this.numRegistro = numRegistro;
        this.clase = clase;
        this.facultad = facultad;
        this.distintas = distintas;
        this.conocimiento = conocimiento;
        this.lab = lab;
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

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public boolean isDistintas() {
        return distintas;
    }

    public void setDistintas(boolean distintas) {
        this.distintas = distintas;
    }

    public String getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(String conocimiento) {
        this.conocimiento = conocimiento;
    }

    public boolean isLab() {
        return lab;
    }

    public void setLab(boolean lab) {
        this.lab = lab;
    }

    @Override
    public String toString() {
        return "Docente{" + "nombre=" + nombre + ", apellido=" + apellido + ", numRegistro=" + numRegistro + ", clase=" + clase + ", facultad=" + facultad + ", distintas=" + distintas + ", conocimiento=" + conocimiento + ", lab=" + lab + '}';
    }

}
