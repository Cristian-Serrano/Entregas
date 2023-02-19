package trenes.personal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class JefeEstacion {
    //Atributos
    private String nombre;
    private String dni;
    private LocalDate fechaNombramiento;

    //Constructores
    public JefeEstacion(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    //Métodos
    public void modificarFechaCargo(int ano, int mes, int dia)
    {
        this.fechaNombramiento = LocalDate.of (ano, mes, dia);
    }

    @Override
    public String toString()
    {
        String resultado = "";
        //Doy formato a la fecha
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        if (fechaNombramiento != null) {
            resultado += nombre + dni + fechaNombramiento.format(formato);
        }
        else 
        {
            resultado += nombre + dni +", no tiene fecha de nombramiento";
        }

        return resultado;
    }
}
