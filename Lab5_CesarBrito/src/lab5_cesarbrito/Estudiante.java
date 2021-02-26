package lab5_cesarbrito;

public class Estudiante extends Persona {

    private String nombre;
    private String apellido;
    private int numRegistro;
    private String carrera;
    private String deporte;
    private String facultad;
    private int clases;
    private boolean becado;
    private boolean carro;

    public Estudiante() {
        super();
    }

    public Estudiante(String nombre, String apellido, int numRegistro, String carrera, String deporte, String facultad, int clases, boolean becado, boolean carro, String usuario, String password) {
        super(usuario, password);
        this.nombre = nombre;
        this.apellido = apellido;
        this.numRegistro = numRegistro;
        this.carrera = carrera;
        this.deporte = deporte;
        this.facultad = facultad;
        this.clases = clases;
        this.becado = becado;
        this.carro = carro;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getClases() {
        return clases;
    }

    public void setClases(int clases) {
        this.clases = clases;
    }

    public boolean isBecado() {
        return becado;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }

    public boolean isCarro() {
        return carro;
    }

    public void setCarro(boolean carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", numRegistro=" + numRegistro + ", carrera=" + carrera + ", deporte=" + deporte + ", facultad=" + facultad + ", clases=" + clases + ", becado=" + becado + ", carro=" + carro + '}';
    }
    
    
    
    
    
}
