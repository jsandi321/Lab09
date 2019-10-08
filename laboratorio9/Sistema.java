
package laboratorio9;

import java.util.ArrayList;

public class Sistema {
    
    private ArrayList<Police> policias = new ArrayList<>();
    private ArrayList<Regular> regulares = new ArrayList<>(); 
    private ArrayList<Temporary> temporales = new ArrayList<>();

    public ArrayList<Police> getPolicias(){
        return policias;
    }
    
    public void addPolice(Police L) {
        this.policias.add(L);
    }
    
    public void printdata(){
        for (int i =0; i<policias.size(); i++){
            System.out.print(policias);
        }
    }
    
    public boolean checkId(int id){        
    for(int i=0; i<policias.size();i++){
        if(policias.get(i).getId() == id){
            return true; 
        } else {
            return false;   
        }
        
    }

     
    
    public ArrayList<Regular> getRegulares(){
        return regulares;
    }
    public ArrayList<Temporary> getTemporales(){
        return temporales;
    }
    
    public void addRegular(Regular R) {
        this.regulares.add(R);
    }
    
    public int getSize(){
        return regulares.size();
    }
    
    public void addTemporary(Temporary T) {
        this.temporales.add(T);
    }
}

