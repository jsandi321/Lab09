package laboratorio9;

import java.time.LocalDateTime;

public class Regular extends Assignment{ 
    
     private final String type = "Regular";
        
     
    public Regular(){
    }
    
    public Regular(Police policia, String description, LocalDateTime startDate){
        super(policia, description, startDate);
    }
    
    @Override
    public String toString(){
        return "Asignacion"+ "\n\nAsiganado a: "+policia + "\nDescripcion: "+ description+ "\nFecha de inicio: "+ startDate;
    }
}
