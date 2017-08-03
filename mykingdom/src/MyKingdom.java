/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author bruce
 */
public class MyKingdom {
    public String color;
    public String name;

     public String getAnimalAtt()
     {
         return color;
     }
     public String getAnimalName()
     {
         return name;
     }
     public static void showAnimals(ArrayList<MyKingdom> zoo) {
        System.out.println("Choose Animal");
        System.out.println("-------------------------\n");

        for(int n = 0; n < zoo.size(); n = n + 1) {
            MyKingdom obj = zoo.get(n);    
            System.out.println(n + ". Name: "+ obj.name + " Attribute: " + obj.color);
        }
     }
     public static void addAnimal(ArrayList<MyKingdom> zooList){
        System.out.println("Add Animal"); 
        // Ask for name and color
        // Get user input
        // MyKingdom newAnimal = new MyKingdom(color, name)
        // zooList.add(newAnimal)
     }
     public static void editAnimal(ArrayList<MyKingdom> zooList){
        System.out.println("Edit Animal"); 
        // print list of animals
        // ask for index of animal
        // ask color and name
        // zooList.set(index,object)
     }
     public static void deleteAnimal(ArrayList<MyKingdom> zooList){
        System.out.println("Delete Animal"); 
        // print list of animals
        // ask for the number to delete
        // zooList.remove(int)
     }

    public MyKingdom(String startColor, String startName){    
        color = startColor;
        name = startName;  
    }    

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> MyKingdom = new ArrayList<>();    
        MyKingdom Zebra, Lion, Giraffe, Monkey;
        ArrayList<MyKingdom> zoo;

        zoo = new ArrayList<>();

        Zebra = new MyKingdom("Stripe", "Zebras");
        Lion = new MyKingdom("Gold", "Lion");    
        Giraffe = new MyKingdom("Yellow", "Giraffe");    
        Monkey = new MyKingdom("Brown", "Monkey");

       zoo.add(Zebra);   
       zoo.add(Lion);   
       zoo.add(Giraffe);    
       zoo.add(Monkey);   

       showAnimals(zoo);
       
        Scanner user_input = new Scanner( System.in );
        String action;
       do{
          System.out.println("Add,Delete,Edit,Quit");
          action = user_input.next( );

          if (action.equalsIgnoreCase("a")){
              addAnimal(zoo);
          } else if (action.equalsIgnoreCase("d")){
              deleteAnimal(zoo);

          } else if (action.equalsIgnoreCase("e")){
              editAnimal(zoo);
          }
       }
       while (!action.equalsIgnoreCase("q"));


    }

}