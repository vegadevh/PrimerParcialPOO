package Sistema;

/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
 */
public class Habitacion {
    //Atributos.
    public Nombre NombreHabitacion;//Clase aun no agregada, a espera de la clase.
    private String TipoHabitacion;
    private Double precio;
    private Boolean Estado;
    public Cliente Huesped;
    //Metodos.
    //Constructor.
    public Habitacion(){
    }
    public Habitacion(String TipoHabitacion, Double precio, Boolean Estado, Cliente Huesped){
        this.TipoHabitacion=TipoHabitacion;
        this.precio=precio;
        this.Estado=Estado;
        this.Huesped=Huesped;
    }
    //SETTER Y GETTERS
    public String getTipoHabitacion() {
        return TipoHabitacion;
    }

    public void setTipoHabitacion(String TipoHabitacion) {
        this.TipoHabitacion = TipoHabitacion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean Estado) {
        this.Estado = Estado;
    }  
}
