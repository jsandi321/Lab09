
package laboratorio9;
import java.util.ArrayList;

public class Admin extends User{
    
    private ArrayList<Police> policias = new ArrayList<>();
    
//Constructores
    public Admin(String name, int id){
        super(name, id);
    }

//Metodos de la clase
    /**
     *
     * @param police
     */
    public void addPolice(Police police){
        policias.add(police);
        
    }

    public void addAssignmentRegular(ArrayList<Regular> regul, Regular assignment){
        regul.add(assignment);
    }
    /**
     *
     * @param temp
     * @param assignment
     */
    public void addAssignmentTemporary(ArrayList<Temporary> temp, Temporary assignment){
        temp.add(assignment);
    }
    public ArrayList<Police> getPolice(){
        return policias;
    }
    public String printPolice(){
        for(int i = 0; i < policias.size(); i++){
            return "Nombre: "+policias.get(i).name+"\nID: "+policias.get(i).id;
        }
        return null;
    }
    
     public boolean checkId(int id){        
         for(int i=0; i<policias.size();i++){
             if(policias.get(i).getId() == id){
                 return true;
             }
         }
        return false;
     }
     public int posPolice(int id){
         for(int i = 0; i < policias.size(); i++){
             if(policias.get(i).getId() == id){
                 return i;
             }
         }
        return 0;
}
