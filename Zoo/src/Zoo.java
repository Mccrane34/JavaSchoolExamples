/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
/**
 *
 * @author Michael Crane
 */
public class Zoo {

  String name;
  String color;
  String mainHabitat;
  
public Zoo(String startName, String startColor, String startMainHabitat){
      name = startName;
      color = startColor;
      mainHabitat = startMainHabitat;
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);   
        
    List<String> animals; 
    animals = new ArrayList<>(); 
        
    Zoo Lions, Tigers, Bears, Zebra, Elephant;  
    
    Lions = new Zoo("Lions", "Gold", "Africa");
    Tigers = new Zoo("Tigers", "Gold and Black","India");
    Bears = new Zoo("Bears", "Brown", "North America");
    Zebra = new Zoo("Zebra", "Striped", "Africa");
    Elephant = new Zoo("Elephant", "Gray", "Asia or Africa");

    animals.add("Lions");
    animals.add("Tigers");
    animals.add("Bears");
    animals.add("Zebra");
    animals.add("Elephant");
    animals.remove("Zebra");
     
     do {
     System.out.println(" Enter a animal from the list");
        String response = input.nextLine();
        if (response.equalsIgnoreCase("Lions")) {
        System.out.println(Lions.color + "\n" + Lions.mainHabitat); 
        }
        else if (response.equalsIgnoreCase("Tigers")) {
        System.out.println(Tigers.color + "\n" + Lions.mainHabitat);
        }      
        else if (response.equalsIgnoreCase("Bears")) {
        System.out.println(Bears.color + "\n" + Bears.mainHabitat);
        }
        else if (response.equalsIgnoreCase("Zebra")) {
        System.out.println(Zebra.color + "\n" + Zebra.mainHabitat);    
        }
        else if (response.equalsIgnoreCase("Elephant")) {
        System.out.println(Elephant.color + "\n" + Elephant.mainHabitat);    
                     
        }
        System.out.println("Enter another animal");
        String answer = input.nextLine();
        
     } while (answer.equalsIgnoreCase("y")); {
        System.out.println(" Enter a animal from the list");    
        
        }
 
     
     }
     
     
     
    
    
}
       
     
        
     
            

        
        
        
         
        
       
        
        
        
        
     
        
    
        
        
        
        
        
        
    