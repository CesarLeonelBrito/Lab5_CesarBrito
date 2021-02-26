package lab5_cesarbrito;

public class Planta extends Persona {

    private String nombre;
    private String apellido;
    private int numRegistro;
    private String cargo;
    private String facultad;
    private String carrera;
    private String clase;

    public Planta() {
        super();
    }

    public Planta(String nombre, String apellido, int numRegistro, String cargo, String facultad, String carrera, String clase, String usuario, String password) {
        super(usuario, password);
        this.nombre = nombre;
        this.apellido = apellido;
        this.numRegistro = numRegistro;
        this.cargo = cargo;
        this.facultad = facultad;
        this.carrera = carrera;
        this.clase = clase;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "Planta{" + "nombre=" + nombre + ", apellido=" + apellido + ", numRegistro=" + numRegistro + ", cargo=" + cargo + ", facultad=" + facultad + ", carrera=" + carrera + ", clase=" + clase + '}';
    }

}
