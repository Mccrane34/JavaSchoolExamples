/*70
8S70Z707SADP[Pdis license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Michael Crane
 */
public class Runner {

    private static final Runner runner = new Runner();
    private final ArrayList<String> individualRunners;
    
   
    private Runner() {
    individualRunners = new ArrayList<>(); 
        individualRunners.add("Michael");
        individualRunners.add("Jennifer");
        individualRunners.add("Jackson");
        individualRunners.add("Walt");
        individualRunners.add("Christopher");
        individualRunners.add("Jerry");
        individualRunners.add("Jose");
        individualRunners.add("Benson");
        
    }
    public String getindividualRunners(){
       if (individualRunners.size()> 0)
            return individualRunners.remove(0);
        return "No Runner";
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
               
        for (int i=0; i<8; i++){
            
        
            
            System.out.println( " Runners in each lane are: " + runner.getindividualRunners());
        
        }

// TODO code application logic here
    

}  
                   
                    
}
  
    

    

    

