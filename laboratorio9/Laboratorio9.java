package laboratorio9;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author jsandi321
 */
public class Laboratorio9 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de objetos para pruebas
        Scanner sc = new Scanner(System.in);
        Police pol1 = new Police("Jeison", 3);
        Admin admin1 = new Admin("Juan",1212);
        
        boolean salida = false;
        int opcion;
        while(!salida){
            System.out.println("Elija el tipo de Usuario: ");
            System.out.println("1. Administrador");
            System.out.println("2. Policia");
            System.out.println("3. Salir");
            try{
                System.out.println("Elige una de las opciones");
                opcion = sc.nextInt();
                
                switch (opcion){
                    case 1:
                        System.out.println("Bienvenido Administrador "+admin1.getName());
                        System.out.println("Eliga una de las siguientes opciones");
                        System.out.println("1. Ver informacion de Policia");
                        System.out.println("2. Asignar tarea permanente");
                        System.out.println("3. Asignar tarea temporal");
                        System.out.println("4. Salir");
                        try{
                            System.out.println("Eliga una de las siguientes opciones");
                            boolean salir = false;
                            
                            while(!salir) {
                                opcion = sc.nextInt();
                                if(opcion == 1){
                                    System.out.println("Esta es la informacion del policia");
                                    System.out.println("1. "+pol1.getName());
                                    System.out.println("1. "+pol1.getId());
                                    System.out.println("1. "+pol1.getRegulares());
                                    System.out.println("1. "+pol1.getTemporales());
                            }
                                if(opcion == 2){
                                    System.out.println("Por favor ingrese una descripcion de la tarea que desea asignar");
                                    String asignacion= sc.next();
                                    Regular asignacionPermanente = new Regular(asignacion);
                                    admin1.addAssignmentRegular(pol1.getRegulares(), asignacionPermanente);
                                    ArrayList<Regular> tarea = pol1.getRegulares();
                                    System.out.println((tarea.get(0)).getAssignment());
                                    
                                }
                            }
                        }
                }
            }   
        }
    }
}

