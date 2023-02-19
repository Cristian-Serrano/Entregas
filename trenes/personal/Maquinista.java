package trenes.personal;

public class Maquinista {
    //Atributos
    private String nombre;
    private String dni;
    private double sueldo;
    private String rango;
    
    //Constructores
    public Maquinista(String nombre, String dni, double sueldo, String rango) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }
    public Maquinista(String nombre, String dni, double sueldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;

        //rango por defecto es ayudante
        this.rango = "Ayudante";
    }

    //Metodos
    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString()
    {
        String resultado = "";
        resultado += this.nombre+" ("+this.rango+")";
        return resultado;
    }
}
