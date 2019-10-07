
package laboratorio9;
import java.util.ArrayList;
/**
 *
 * @author jsandi321
 */
public class Admin extends User{
/**
 * Constructores
 */    
    public Admin(){
    }
    public Admin(String name, int id){
        super(name, id);
    }
/**
 * Metodos de la clase
 */
    
    public void addAssignment(ArrayList<Assignment> policeRegister, Assignment assignment){
        policeRegister.add(assignment);
    }

}
