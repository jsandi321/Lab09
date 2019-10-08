package laboratorio9;
//import java.util.ArrayList;

public class Police extends User{
    
    /*ArrayList<Regular> regul = new ArrayList<>();
    ArrayList<Temporary> temp = new ArrayList<>();*/
    
    
    // Constructores
    
    public Police(){
        
    }
    public Police(String name, int id/*, ArrayList<Regular> regulares, ArrayList<Temporary> temporales*/){
        super(name, id);
        //this.regulares = regulares;
        //this.temporales = temporales;       
    }
    
    //Metodos
    
    /*public ArrayList<Regular> getRegul(){
        return regul;
    }
    public ArrayList<Temporary> getTemp(){
        return temp;
    }
    
    public void addRegul(Regular R) {
        this.regul.add(R);
    }
    
    public void addTemp(Temporary T) {
        this.temp.add(T);
    }
    */
    @Override
    public String toString(){
        return "\n\n" + name + "\nId: "+ getId();
    }
}
