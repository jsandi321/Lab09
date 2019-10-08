package laboratorio9;
import java.time.LocalDateTime;

     
public class Assignment {
    protected Police policia;
    protected String description;
    protected  LocalDateTime startDate;
    
            
    public Assignment(){
    }
    public Assignment(Police policia,String description, LocalDateTime startDate){        
        this.description = description;
        this.startDate = startDate;
        this.policia = policia;
    }
    public String getAssignment(){
        return description;
    }
    public LocalDateTime getstartDate() {
        return startDate;
    }

    @Override
    public String toString(){
        return "Asignacion"+ "\n\nAsiganado a: "+policia + "\nDescripcion: "+ description+ "\nFecha de inicio: "+ startDate;
    }
}
