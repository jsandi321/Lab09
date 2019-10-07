package laboratorio9;
/**
 *
 * @author jsandi321
 */
public class User {
    private String name;
    private int id;

    /**
     * Constructores
     */
    public User(){
    }
    public User(String name, int id){
        this.name = name;
        this.id = id;
    }
    /**
     * Metodos
     * @return 
     */
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
