package trenes.personal;

public class Mecanico {
    //Atributos
    public enum Especialidad {FRENOS,HIDRAULICA,ELECTRICIDAD,MOTOR};

    private String nombre;
    private String tlf;
    private Especialidad especialidad;

    //Constructor
    public Mecanico(String nombre,String tlf, Especialidad especialidad) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.especialidad = especialidad;
    }
}
