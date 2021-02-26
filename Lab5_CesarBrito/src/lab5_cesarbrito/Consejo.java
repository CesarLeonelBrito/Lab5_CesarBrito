package lab5_cesarbrito;

public class Consejo extends Persona {

    private String nombre;
    private String apellido;
    private int numRegistro;
    private String cargo;
    private int becados;
    private int personas;
    private String segTrabajo;
    private String acuerdo;

    public Consejo() {
        super();
    }

    public Consejo(String nombre, String apellido, int numRegistro, String cargo, int becados, int personas, String segTrabajo, String acuerdo, String usuario, String password) {
        super(usuario, password);
        this.nombre = nombre;
        this.apellido = apellido;
        this.numRegistro = numRegistro;
        this.cargo = cargo;
        this.becados = becados;
        this.personas = personas;
        this.segTrabajo = segTrabajo;
        this.acuerdo = acuerdo;
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

    public int getBecados() {
        return becados;
    }

    public void setBecados(int becados) {
        this.becados = becados;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public String getSegTrabajo() {
        return segTrabajo;
    }

    public void setSegTrabajo(String segTrabajo) {
        this.segTrabajo = segTrabajo;
    }

    public String getAcuerdo() {
        return acuerdo;
    }

    public void setAcuerdo(String acuerdo) {
        this.acuerdo = acuerdo;
    }

    @Override
    public String toString() {
        return "Consejo{" + "nombre=" + nombre + ", apellido=" + apellido + ", numRegistro=" + numRegistro + ", cargo=" + cargo + ", becados=" + becados + ", personas=" + personas + ", segTrabajo=" + segTrabajo + ", acuerdo=" + acuerdo + '}';
    }
    
    
    
}
