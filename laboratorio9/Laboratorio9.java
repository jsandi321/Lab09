package laboratorio9;
import java.time.LocalDateTime;
import java.util.Scanner;


public class Laboratorio9 {
  
    public static void main(String[] args) {
        //Creacion de objetos para pruebas
        Scanner sc = new Scanner(System.in);
                
        Sistema sis = new Sistema();
        
        Police police1 = new Police("Jeison", 5555);
        Police police2 = new Police("Emmanuel", 2222);
        
        
        Regular regular1 = new Regular(police1, "Patrullar zona del Hospital", LocalDateTime.now());
        Temporary temporary1 = new Temporary(police2, "Juicio", LocalDateTime.now());
                

        Admin admin1 = new Admin("Juan", 8888);
            
        
        sis.addRegular(regular1);
        sis.addTemporary(temporary1);
        sis.addPolice(police1);
        sis.addPolice(police2);
        
        
        boolean salida = false;
        
        while(!salida){
            System.out.println("\nBienvenido\n");
            System.out.println("A continuacion elija el tipo de Usuario: \n");
            System.out.println("1. Administrador");
            System.out.println("2. Policia");
            System.out.println("3. Salir\n");

                System.out.print("Digite la opción deseada: ");
                int option = sc.nextInt();
                
                switch (option){
                    case 1:
                        System.out.println("\nBienvenido Administrador "+admin1.name);
                        System.out.print("\nDigite su ID para continuar: ");
                        int idtyped = sc.nextInt();
                        if (idtyped == admin1.id){
                            System.out.println("\nMenu Principal\n");
                            System.out.println("1. Ver informacion de Policias");
                            System.out.println("2. Asignar una tarea permanente");
                            System.out.println("3. Asignar una tarea temporal");
                            System.out.println("4. Salir\n");
                            
                            int election = sc.nextInt();
                            switch (election){
                                case 1:
                                    System.out.println("\nConsulta de Policías\n"+sis.getPolicias());
                                break;
                                    
                                case 2:
                                    System.out.println("\nAsignar una tarea permanente\n\n");
                                    System.out.println("Digite el iD del oficial al que desea encargar la tarea: ");
                                    
                                    int numid = sc.nextInt();
                                    if (sis.checkId(numid) == true){
                                        int idOfficer = numid;
                                        System.out.println("Digite la descripción de la tarea: ");
                                        String descrip = sc.nextLine();
                                        Regular regular2 = new Regular(police2,descrip,LocalDateTime.now());
                                    } else{
                                        System.out.println("\nIntentelo mas tarde");
                                    }
                                    
                                case 3:
                                    sis.getRegulares();
                                    
                                    
                                    

                            
                        }
                }
              
                    /*default:
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
                       */ }
                }
            }   
        }
    //}
//}

