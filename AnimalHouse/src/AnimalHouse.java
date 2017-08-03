/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Michael Crane
 */


public class AnimalHouse {
    String name;
    String color;
    String mainHabitat;
    
public AnimalHouse(String startName, String startColor, String startMainHabitat) {
    name = startName;
    color = startColor;
    mainHabitat = startMainHabitat;
}

public static void addAnimals(ArrayList<AnimalHouse> animals) {
    Scanner input = new Scanner(System.in);
    String newName, newColor, newHabitat;
    
    System.out.println("Enter the name of a new animal");
    newName = input.nextLine();
    System.out.println("Enter the color");
    newColor = input.nextLine();
    System.out.println("Enter the habitat of the animal");
    newHabitat = input.nextLine();
    
    AnimalHouse NewAnimal = new AnimalHouse( newName, newColor, newHabitat);
    animals.add(NewAnimal);
}
public static void deleteAnimals(ArrayList<AnimalHouse> animals ) {
    Scanner delNamerep = new Scanner(System.in);
    int delName;
    
    System.out.println("Enter the animal from the list");
    delName = delNamerep.nextInt();
    animals.remove(delName);
}
       

public static void editAnimals(ArrayList<AnimalHouse> animals) {
    Scanner editNamerep = new Scanner(System.in);
    int editName;
    
    System.out.println("Enter an animal from the list");
    
    editName = editNamerep.nextInt();
    animals.set(animals.size(), null);
}

public static void chooseAnimals(ArrayList<AnimalHouse> animals) {
     System.out.println("Choose Animal");
        System.out.println("-------------------------\n");

        for(int n = 0; n < animals.size(); n = n + 1) {
            AnimalHouse obj = animals.get(n);    
            System.out.println(n + ". Name: "+ obj.name + " Appearance: " + obj.color + " Habitat: " + obj.mainHabitat);
        }
     }

      
      
        
    
       

public static void main(String[] args) {
    
       
        
    ArrayList<AnimalHouse> animals; 
    animals = new ArrayList<>(); 
        
    AnimalHouse Lions, Tigers, Bears, Zebra, Elephant;  
   
    
    
    Lions = new AnimalHouse("Lions", "Gold", "Africa");
    Tigers = new AnimalHouse("Tigers", "Gold and Black","India");
    Bears = new AnimalHouse("Bears", "Brown", "North America");
    Zebra = new AnimalHouse("Zebra", "Striped", "Africa");
    Elephant = new AnimalHouse("Elephant", "Gray", "Asia or Africa");

    animals.add(Zebra);
    animals.add(Bears);
    animals.add(Lions);
    animals.add(Tigers);
    animals.add(Elephant);
    
    chooseAnimals(animals);
    
    Scanner in = new Scanner(System.in);
    String answer;
    do {
    System.out.println("(A)dd, (D)elete, (E)dit, (C)hoose an animal or (Q)uit");
    answer = in.nextLine();
    if (answer.equalsIgnoreCase("A")) {
    addAnimals(animals);    
    }
    else if (answer.equalsIgnoreCase("D")) {
    deleteAnimals(animals);     
    }
    else if (answer.equalsIgnoreCase("E")) {
    editAnimals(animals);  
    } else if (answer.equalsIgnoreCase("C")) {
    chooseAnimals(animals);    
    }
    }
    while (!answer.equalsIgnoreCase("Q"));
        
     
    } 
    
}
