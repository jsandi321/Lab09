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
        Police pol1 = new Police("Jeison", 3);
        Admin admin1 = new Admin("Juan",1212);
        Regular reg1 = new Regular("Patrullar");
        
        admin1.addAssignment(pol1.getRegister(), reg1);
        
        System.out.println("El Policia es : "
                +pol1.getName()+"\nY el ID es\n"+pol1.getId());
        
        System.out.println("El admin es "+admin1.getName()+
                "\nEl ID es "+admin1.getId());
    }
}

