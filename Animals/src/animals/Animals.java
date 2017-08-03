/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;
import java.util.ArrayList;
/**
 *
 * @author bruce
 */
public class Animals {

 String color;
 String name;
 
 public Animals(String startColor, String startName){
    color = startColor;
    name = startName;
}


    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Animals Zebra, Lion, Giraffe, Monkey;
    
    ArrayList<Animals> zoo;
    zoo = new ArrayList<>(); 
    
    Zebra = new Animals("Stripe", "Zebras");
   
    Lion = new Animals("Gold", "Lion");
    
    Giraffe = new Animals("Yellow", "Giraffe");
    
    Monkey = new Animals("Brown", "Monkey");
   zoo.add(Zebra);
   
   zoo.add(Lion);
   
   zoo.add(Giraffe); 
   
   zoo.add(Monkey);        
    }
    
}
