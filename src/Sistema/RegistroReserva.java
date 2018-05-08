package Sistema;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Julio Flores <00081817@uca.edu.sv>
 */
public class RegistroReserva{
    private final ArrayList<Reserva> reservas;
    
    public RegistroReserva(){
        reservas = new ArrayList<>();
    }
    
    public void add(){
        Reserva reserva = new Reserva();
        
        reservas.add(reserva);
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Cuantas reservas desea hacer: ");
           
        //while (leer.nextInt() < 1 && leer.nextInt() > 2){
        if (leer.nextInt() == 1){
            System.out.println("Se hizo 1 reserva con exito... Ahora ingrese los datos de la reserva: ");
                //Pidiendo el codigo 
            System.out.println("Ingrese el codigo de la reserva: ");
            reserva.setCodigo(leer.nextLine());
        
        //Obteniendo fecha de entrada y salida...
        
            System.out.println("Ingrese la fecha de entrada: ");
            reserva.setFechaent(leer.nextLine());
        
            System.out.println("Ingrese la fecha de salida: ");
            reserva.setFechasal(leer.nextLine());
        
        //Tipo de paquete
            System.out.println("Ingrese el tipo de paquete, puede ser PREMIUN o BASICO: ");
            reserva.setPaquete(leer.nextLine());
        
        //Dias de reserva
            System.out.println("Ingrese los dias de reserva: ");
                reserva.setDias(leer.nextInt());
        }
        else{
            System.out.println("Se hicieron 2 reservas...");
            //Pidiendo el codigo 
            System.out.println("Ingrese el codigo de la reserva: ");
            reserva.setCodigo(leer.nextLine());
        
        //Obteniendo fecha de entrada y salida...
        
            System.out.println("Ingrese la fecha de entrada: ");
            reserva.setFechaent(leer.nextLine());
        
            System.out.println("Ingrese la fecha de salida: ");
            reserva.setFechasal(leer.nextLine());
        
        //Tipo de paquete
            System.out.println("Ingrese el tipo de paquete, puede ser PREMIUN o BASICO: ");
            reserva.setPaquete(leer.nextLine());
        
        //Dias de reserva
            System.out.println("Ingrese los dias de reserva: ");
            reserva.setDias(leer.nextInt());
        }
    }
        

        
    
    public void remove(){
        Reserva reserva = new Reserva();
        int eliminar;
        System.out.println("Segun la lista mostrada luego de ingresar un producto, ingrese el numero correspondiente segun fila de la habitacion que desea remover.\n NOTA: LA LISTA EMPIEZA CON EL NUMERO 0. ");
        Scanner numero = new Scanner(System.in);
        eliminar = numero.nextInt();
        reservas.remove(eliminar);
    }
    
    public void modificar(){
        Reserva reserva = new Reserva();
        int numero;
        Scanner modificar = new Scanner(System.in);
        System.out.println("Segun la lista mostrada luego de ingresar un producto, ingrese el numero correspondiente segun fila de la habitacion que desea remover.\n NOTA: LA LISTA EMPIEZA CON EL NUMERO 0.  ");
        numero=modificar.nextInt();
        /**
        System.out.println("Ingrese la fecha de salida que desea modificar: ");
        reservas.get(numero).setFechasal(modificar.nextLine());
        
        System.out.println("Ingrese los dias que desea modificar: ");
        reservas.get(numero).setDias(modificar.nextInt());
        
        System.out.println("Ingrese el paquete que desea modificar: ");
        reservas.get(numero).setPaquete(modificar.nextLine());
        */
    }
    public void mostrar(){
        
        for (Reserva e:reservas){
            //Orden
            System.out.println("Codigo de reserva: "+e.getCodigo());
            /**
            System.out.println("Fecha de entrada: "+e.getFechaent());
            System.out.println("Fecha de salida: "+e.getFechasal());
            System.out.println("Tipo de paquete: "+e.getPaquete());
            System.out.println("Dias de reserva: "+e.getDias());
            */
            System.out.println("\n");
        }
    }
}