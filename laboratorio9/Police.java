package laboratorio9;
import java.util.ArrayList;

/**
 *
 * @author jsandi321
 */
public class Police extends User{
    private ArrayList<Regular> regulares = new ArrayList();
    private ArrayList<Temporary> temporales = new ArrayList();
    // Constructores
    public Police(){
        
    }
    public Police(String name, int id){
        super(name, id);
    }
    //Metodos
    public ArrayList getRegulares(){
        return regulares;
    }
    public ArrayList getTemporales(){
        return temporales;
    }
}
