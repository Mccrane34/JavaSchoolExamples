/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Michael Crane
 */
public class SalesCompensation // Sales person annual salary calculation
{
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  
    {
        double salary;          // Salary varibale
        double salesYear;       // Sales for the year variable
        double commission = .20;      // Percentage of commission
        double yearEndTotal;          // End of year total commission
        double annualCompensation;    // Final annual salary including commission
                    
        /* Entering the sales employee annual salary and inputing that number in
        the salary variable
        */      
        
        System.out.println ("What is the sales employee annual salary? ");
        Scanner input = new Scanner(System.in);
        salary = input.nextDouble();
        
        /* Entering the total sales for the year and multiplying that number by
        the commission varibale
        */
        
        System.out.println (" Enter the total sales amount for the year. ");
        salesYear = input.nextDouble();
        
        /* Calculaing the final annual compensation for the sales employee
        */
        
        yearEndTotal = salesYear * commission;
        annualCompensation = yearEndTotal + salary;
        
        /* Accessing the FinalCalculation class to display the total salary 
        for the year.
        */
        
        FinalCalculation myFinalCalculation = new FinalCalculation();
        
        myFinalCalculation.displayMessage( annualCompensation );
        
    } 
             
}   
    //End of Program
        
        
              
     
       
        
        
        
 
    
  
