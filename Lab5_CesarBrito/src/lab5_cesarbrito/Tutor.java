package lab5_cesarbrito;

public class Tutor extends Estudiante {

    private String clase;
    private boolean lab;

    public Tutor() {
        super();
    }

    public Tutor(String clase, boolean lab, String nombre, String apellido, int numRegistro, String carrera, String deporte, String facultad, int clases, boolean becado, boolean carro, String usuario, String password) {
        super(nombre, apellido, numRegistro, carrera, deporte, facultad, clases, becado, carro, usuario, password);
        this.clase = clase;
        this.lab = lab;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public boolean isLab() {
        return lab;
    }

    public void setLab(boolean lab) {
        this.lab = lab;
    }

    @Override
    public String toString() {
        return "Tutor{" + "clase=" + clase + ", lab=" + lab + '}';
    }
    
    
}
