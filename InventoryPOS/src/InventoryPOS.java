/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Crane
 */
import java.util.Scanner;



public class InventoryPOS 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       String Answer;
       String[] itemDescription = new String[ 100 ];
       Double[] itemProductNumber = new Double[ 10000 ];
       Double[] itemPrice = new Double[ 10000 ];
       Double[] itemSize = new Double[ 10000 ];
       Double[] itemQuantity = new Double[ 10000 ];
       
    Scanner input = new Scanner(System.in); // Scanner input
    
    
    System.out.println( " Enter new data, Y for Yes or N for No?");   
       Answer = input.nextLine();
    
    switch ("Y")
    {
    case "Y":
    case "y": //WRITE YOUR CODE HERE
               
            
    System.out.println ( "Enter a description of the item.");
       itemDescription[0] = input.next();
    System.out.println( "Enter the product number of the item." );
       itemProductNumber[0] = input.nextDouble();
    System.out.println( "Enter the price of the item.");
        itemPrice[0] = input.nextDouble();
    
    System.out.println( "Enter the quantity on stock. ");
        itemQuantity[0] = input.nextDouble();
      break;   
    case "N":
    case "n"://exit from program;
             break;

    default :
             System.out.println("invalid choice")   ;
             break;
    
    }   
           
          
        
            
        
    
    
    
    
    
    
    }
        
        
    
}
