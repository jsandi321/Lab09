
package laboratorio9;

import java.time.LocalDateTime;

public class Temporary extends Assignment{
    private final String type = "Temporal";
    
 //Constructores
   
    public Temporary(){
        
    }
    public Temporary(Police policia, String description, LocalDateTime startDate){
        super(policia, description, startDate);
        
    }
    @Override
    public String toString(){
        return "Asignacion"+ "\n\nAsiganado a: "+policia + "\nDescripcion: "+ description+ "\nFecha de inicio: "+ startDate;
    } 
    
}
