package laboratorio9;
import java.util.ArrayList;

/**
 *
 * @author jsandi321
 */
public class Police extends User{
    private ArrayList<Assignment> register = new ArrayList();

    public Police(){
        super();
    }
    public Police(String name, int id){
        super(name, id);
    }
    public ArrayList getRegister(){
        return register;
    }   
    public Assignment getRegisterPos(int pos){
        return register.get(pos);
    }
}
