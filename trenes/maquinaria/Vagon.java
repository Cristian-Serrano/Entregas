package trenes.maquinaria;

class Vagon {
    //Atributos
    private static int cantidad;

    private int numero;
    private double cargaMax;
    private double cargaActual;
    private String tipoMercancia;

    //Constructor
    public Vagon(double cargaMax, double cargaActual, String tipoMercancia) {
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;

        cantidad += 1;
        this.numero = cantidad;
    }

    //Métodos
    public double getCargaActual() {
        return cargaActual;
    }
    
    public double getCargaMax() {
        return cargaMax;
    }

    @Override
    public String toString()
    {
        String resultado = "";
        resultado += "V"+numero+" - "+cargaActual+"kgs de "+cargaMax+" "+tipoMercancia;
        return resultado;
    }
}
