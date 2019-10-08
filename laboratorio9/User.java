package laboratorio9;

public class User {
    protected String name;
    protected int id;

   
    //Constructores
    
    public User(){
    }
    public User(String name, int id){
        this.name = name;
        this.id = id;
    }

    //Metodos
    
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
