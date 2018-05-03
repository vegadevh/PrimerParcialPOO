package Sistema;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio Flores <00081817@uca.edu.sv>
 */
public class Reserva {
    //Atributos
    public Cliente cliente;
    private String codigo;
    private String fechaent;
    private String fechasal;
    private int dias;
    private String paquete;
    //Constructor
    public Reserva(){}
    //Metodos

    public Reserva(Cliente cliente, String codigo, String fechaent, String fechasal, int dias, String paquete) {
        this.cliente = cliente;
        this.codigo = codigo;
        this.fechaent = fechaent;
        this.fechasal = fechasal;
        this.dias = dias;
        this.paquete = paquete;
    }
    //Setters and getters
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(){
        this.cliente = cliente;
    }
    
    public String getCodigo(){
        return codigo;
    } 
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getFechaent(){
        return fechaent;
    }

    public void setFechaent(String fechaent){
        this.fechaent = fechaent;
    }
    
    public String getFechasal(){
        return fechasal;
    }
    
    public void setFechasal(String fechasal){
        this.fechasal = fechasal;
    }
    
    public int getDias(){
        return dias;
    }
    
    public void setDias(int dias){
        this.dias = dias;
    }
    
    public String getPaquete(){
        return paquete;
    }
    
    public void setPaquete(String paquete){
        this.paquete = paquete;
    }
}
