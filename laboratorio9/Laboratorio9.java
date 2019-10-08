package laboratorio9;
import java.time.LocalDateTime;
import java.util.Scanner;


public class Laboratorio9 {
  
    public static void main(String[] args) {
        //Creacion de objetos para pruebas
        Scanner sc = new Scanner(System.in);
                
        Police police1 = new Police("Jeison", 5555);
        Police police2 = new Police("Emmanuel", 2222);
        
        
        Regular regular1 = new Regular(police1, "Patrullar zona del Hospital", LocalDateTime.now());
        Regular regular2 = new Regular(police2, "Patrullar zona Comercial B", LocalDateTime.now());
        Temporary temporary1 = new Temporary(police1, "Juicio", LocalDateTime.now(), "1 dia");
        Temporary temporary2 = new Temporary(police2, "Custodiar Concierto", LocalDateTime.now(), "2 dias");
                
        Admin admin1 = new Admin("Juan", 8888);
        //Asignaciones de prueba
        admin1.addAssignmentRegular(police1.regul, regular1);
        admin1.addAssignmentTemporary(police1.temp, temporary1);
        admin1.addAssignmentRegular(police2.regul, regular2);
        admin1.addAssignmentTemporary(police2.temp, temporary2);
        
        admin1.addPolice(police1);
        admin1.addPolice(police2);
        
        
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
                                    System.out.println("\nConsulta de Policías\n"+admin1.getPolice());
                                break;
                                    
                                case 2:
                                    System.out.println("\nAsignar una tarea permanente\n\n");
                                    System.out.println("Digite el iD del oficial al que desea encargar la tarea: ");
                                    
                                    int numid = sc.nextInt();
                                    if (admin1.checkId(numid) == true){
                                        int idOfficer = numid;
                                        int posPolice = admin1.posPolice(numid);
                                        Police pol = admin1.getPolice().get(posPolice);
                                        System.out.println("Digite la descripción de la tarea de "+pol.getName());
                                        String descrip = sc.nextLine();
                                        Regular regular3 = new Regular(pol,descrip,LocalDateTime.now());
                                        admin1.addAssignmentRegular(pol.regul, regular3);
                                    } 
                                    else{
                                        System.out.println("\nIntentelo mas tarde");
                                    }
                                    
                                case 3:
                                    System.out.println("\nAsignar una tarea temporal\n\n");
                                    System.out.println("Digite el iD del oficial al que desea encargar la tarea: ");
                                    
                                    int numid1 = sc.nextInt();
                                    if(admin1.checkId(numid1) == true){
                                        int idPolice = numid1;
                                        int posPol= admin1.posPolice(idPolice);
                                        Police poliTemporal = admin1.getPolice().get(posPol);
                                        System.out.println("Ingrese descripcion de la tarea para "+poliTemporal.getName());
                                        String description = sc.next();
                                        Temporary temporary3 = new Temporary(poliTemporal, description, LocalDateTime.now(),"1 dia");
                                    }
                                case 4:
                                    break;
                            }
                        }
                }
        }
    }
}

