package lab5_cesarbrito;

public class Admin extends Persona {

    private String nombre;
    private String apellido;
    private int numRegistro;
    private String cargo;
    private String area;
    private int subordinados;
    private String asistente;
    private String jefe;

    public Admin() {
        super();
    }

    public Admin(String nombre, String apellido, int numRegistro, String cargo, String area, int subordinados, String asistente, String jefe, String usuario, String password) {
        super(usuario, password);
        this.nombre = nombre;
        this.apellido = apellido;
        this.numRegistro = numRegistro;
        this.cargo = cargo;
        this.area = area;
        this.subordinados = subordinados;
        this.asistente = asistente;
        this.jefe = jefe;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(int subordinados) {
        this.subordinados = subordinados;
    }

    public String getAsistente() {
        return asistente;
    }

    public void setAsistente(String asistente) {
        this.asistente = asistente;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    @Override
    public String toString() {
        return "Admin{" + "nombre=" + nombre + ", apellido=" + apellido + ", numRegistro=" + numRegistro + ", cargo=" + cargo + ", area=" + area + ", subordinados=" + subordinados + ", asistente=" + asistente + ", jefe=" + jefe + '}';
    }

}
