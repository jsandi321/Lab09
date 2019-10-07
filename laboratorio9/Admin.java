
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
     * @param policeRegulares
     * @param assignment
 */
    public void addAssignmentRegular(ArrayList<Regular> policeRegulares, Regular assignment){
        policeRegulares.add(assignment);
    }
    /**
     * @param policeTemporales
     * @param assignment
     */
    public void addAssignmentTemporary(ArrayList<Temporary> policeTemporales, Temporary assignment){
        policeTemporales.add(assignment);
    }

}
