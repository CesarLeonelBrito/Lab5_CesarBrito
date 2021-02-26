package lab5_cesarbrito;

public class CEO extends Persona {

    private String nombre;
    private String apellido;
    private int numRegistro;
    private String nacionalidad;
    private String titulo;
    private int edad;
    private int experencia;
    private int laborando;

    public CEO() {
        super();
    }

    public CEO(String nombre, String apellido, int numRegistro, String nacionalidad, String titulo, int edad, int experencia, int laborando, String usuario, String password) {
        super(usuario, password);
        this.nombre = nombre;
        this.apellido = apellido;
        this.numRegistro = numRegistro;
        this.nacionalidad = nacionalidad;
        this.titulo = titulo;
        this.edad = edad;
        this.experencia = experencia;
        this.laborando = laborando;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getExperencia() {
        return experencia;
    }

    public void setExperencia(int experencia) {
        this.experencia = experencia;
    }

    public int getLaborando() {
        return laborando;
    }

    public void setLaborando(int laborando) {
        this.laborando = laborando;
    }

    @Override
    public String toString() {
        return "CEO{" + "nombre=" + nombre + ", apellido=" + apellido + ", numRegistro=" + numRegistro + ", nacionalidad=" + nacionalidad + ", titulo=" + titulo + ", edad=" + edad + ", experencia=" + experencia + ", laborando=" + laborando + '}';
    }

}
