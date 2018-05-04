package Sistema;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
 */
public class RegistroHabitacion extends Habitacion{
    //Atributos.
    private final ArrayList<Habitacion> habitaciones;
    
    public RegistroHabitacion(){
        habitaciones=new ArrayList<>();
    }
    //Metodos.
    public void add(){
        Habitacion habitacion = new Habitacion();
        
        habitaciones.add(habitacion);
        Scanner leer=new Scanner(System.in);
        //PARA SABER EL TIPO DE HABITACION SE PIENSA AGREGAR UN METODO QUE VERIFIQUE SI EL NUMERO DE HABITACION ES PAR O NO.
        System.out.println("Ingrese tipo de habitacion, Doble o Sencilla.");
        habitacion.setTipoHabitacion(leer.nextLine());
        
        
        Nombre nombre=new Nombre();
        nombre.num=1;
        nombre.piso='a';
        
        habitacion.setNombreHabitacion(NombreHabitacion);
        
        
        
        System.out.println("Ingrese el Estado de la habitacion: ");
        //PROBABLE CONDICION PARA IDENTIFICAR EL ESTADO DEL CUARTO.
        habitacion.setEstado(Boolean.TRUE);
        
        System.out.println("Ingrese el precio de la habitacion: ");
        habitacion.setPrecio(leer.nextDouble());
        //SET ESTADO
    }
    
    public void remove(){
        Habitacion habitacion=new Habitacion();
        int nume;
        System.out.println("Segun la lista mostrada luego de ingresar un producto, ingrese el numero correspondiente segun fila del producto que desea remover./n NOTA: LA LISTA EMPIEZA CON EL NUMERO 0. ");
        Scanner num=new Scanner(System.in);
        nume=num.nextInt();
        habitaciones.remove(nume);
    }
    
    public void set(){
        Habitacion habitacion=new Habitacion();
        int num;
        String nom;
        Scanner cambio=new Scanner(System.in);
        System.out.println("Segun la lista mostrada luego de ingresar un producto, ingrese el numero correspondiente segun fila del producto que desea modificar./n NOTA: LA LISTA EMPIEZA CON EL NUMERO 0. ");
        num=cambio.nextInt();
        
        System.out.println("Ingrese Tipo de habitacion: ");
        habitaciones.get(num).setTipoHabitacion(cambio.nextLine());
        
        System.out.println("Ingrese nuevo estado para la habitacion (Si esta habilitada pasara a no estarlo): ");
        habitaciones.get(num).setEstado(Boolean.FALSE);
        
        System.out.println("Ingrese nuevo precio para la habitacion: ");
        habitaciones.get(num).setPrecio(cambio.nextDouble());
        //A TRAVES DE CONDICION PARA SIMPLIFICAR.
    }
    public void mostrar(){
        for(Habitacion e:habitaciones){
            System.out.println("Tipo de habitacion: ");
            System.out.print(e.getTipoHabitacion());
            System.out.print(" ");
            System.out.print("Estado: "+e.getEstado());
            System.out.println(" ");
            System.out.print("Precio: $"+e.getPrecio());
            System.out.println("\n");
        }
    }
}