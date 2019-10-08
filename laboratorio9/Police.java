package laboratorio9;
import java.util.ArrayList;

public class Police extends User{
    ArrayList<Regular> regul = new ArrayList<>();
    ArrayList<Temporary> temp = new ArrayList<>();
    
    
    // Constructores
    public Police(String name, int id){
        super(name, id);
    }
    
    //Metodos
    
    public ArrayList<Regular> getRegul(){
        return regul;
    }
    public ArrayList<Temporary> getTemp(){
        return temp;
    }
    
    @Override
    public String toString(){
        return "\n\n" + name + "\nId: "+ getId();
    }
}
