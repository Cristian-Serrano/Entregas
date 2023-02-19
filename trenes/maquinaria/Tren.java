package trenes.maquinaria;

import trenes.personal.Maquinista;

public class Tren {
    //Atributos
    private Maquinista maquinista;
    private Locomotora locomotora;
    private Vagon[] vagones = new Vagon[0];

    //Constructores
    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.maquinista = maquinista;
        this.locomotora = locomotora;
    }

    //Métodos
    public void enganchaVagon(int cargaMax,int cargaActual,String tipoMercancia)
    {
        Vagon v1 = new Vagon(cargaMax,cargaActual,tipoMercancia);

        //Compruebo si ya hay 5 vagones
        if (this.vagones.length < 5) {
            //Compruebo si la carga actual del vagon es superior a la maxima permitida
            if (cargaMax >= cargaActual) {
                Vagon[] vagonesNuevo = new Vagon[getVagones().length + 1];
                for (int i = 0; i < vagones.length; i++) {
                    vagonesNuevo[i] = vagones[i];
                }
        
                vagonesNuevo[vagonesNuevo.length -1] = v1;
                setVagones(vagonesNuevo);  
            }
            else
            {
                System.out.println("No se puede enganchar el vagon porque la carga actual del vagon es mayor que su carga maxima permitida");
            }
        }
        else
        {
            System.out.println("No se puede enganchar el vagon porque ya tiene 5 vagones");
        }
    }

    public Vagon[] getVagones() {
        return vagones;
    }

    public void setVagones(Vagon[] vagones) {
        this.vagones = vagones;
    }

    private String vagonesToString()
    {
        String resultado = "";

        double acumuladorCarga = 0;
        for (int i = 0; i < vagones.length; i++) {
            resultado += "["+vagones[i].toString()+"] -";
            acumuladorCarga = vagones[i].getCargaActual();
        }
        resultado += acumuladorCarga + "kgs de Carga total";
        return resultado;
    }

    @Override
    public String toString()
    {
        String resultado = "";
        resultado += this.locomotora.toString()+" - "+vagonesToString()+" - "+this.maquinista.toString();
        return resultado;
    }
}
