
package laboratorio9;

import java.time.LocalDateTime;

public class Temporary extends Assignment{
    private String finalDate;
    
 //Constructores
    public Temporary(Police policia, String description, LocalDateTime startDate, String finalDate){
        super(policia, description, startDate);
        this.finalDate = finalDate;
    }
    
    @Override
    public String toString(){
        return "Asignacion"+ "\n\nAsiganado a: "+policia + "\nDescripcion: "+ description+ "\nFecha de inicio: "+ startDate+"\nFecha final: "+ finalDate;
        
    } 
    
}
