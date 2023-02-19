package trenes.maquinaria;

import trenes.personal.Mecanico;

public class Locomotora {
    //Atributos
    private String matricula;
    private double potencia;
    private int antigüedad;
    private Mecanico mecanico;

    //Constructores
    public Locomotora(String matricula, double potencia, int antigüedad) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.antigüedad = antigüedad;
    }
    public Locomotora(String matricula, double potencia
    ) {
        this.matricula = matricula;
        this.potencia = potencia;
    }
    //Metodos
    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    @Override
    public String toString()
    {
        String resultado = "";
        resultado += "Locomotora: "+this.matricula+" ("+this.potencia+"Cv)";
        return resultado;
    }
}
