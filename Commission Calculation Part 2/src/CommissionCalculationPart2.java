/*
 * Week two assignment of adding additional calcuations to the salary
   of a sales employee plus printing out a chart
 */

/**
 *
 * @author Michael Crane
 */
import java.util.Scanner;  // Import Scanner utility
import java.text.DecimalFormat;  //  Import Decimal format utility

public class CommissionCalculationPart2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int count = 0;  // counter
        double increments = 5000;  //increments by 5000
        double salary = 40000;  // base salary
        double finalCommission;  // final commission over 150,000 sales
        double salesTargetCommission = .25;  // sales target commission 120,000
        double currentCommission = .10; //commission under 120,000
        double accerlatorFactor = 1.25;  // accerlator factor for achieving over 150,000 in sales
        double annualSales; // variable for annual sales
        double totalSalary; // variable to total salary
      
        Scanner input = new Scanner(System.in); // Scanner method to input from the keyboard
       
        DecimalFormat dollar = new DecimalFormat ("###,###.##");
        
        System.out.println( " Sales under $120,000 receive basic commission rates. ");
        System.out.println( " Sales between $120,000 and $150,000 receive the target commission rate. ");
        System.out.println( " Sales over $150,000 receive an increase in the commission rate. ");
        System.out.print( " Enter the annual sales amount: ");
        annualSales = input.nextDouble();
        
          
        /*
        Annual sales amount under 120,000 and displaying results
        */
        if ( annualSales < 120000)
        {    
            totalSalary = annualSales * currentCommission + salary;
            
            System.out.println ();
            System.out.println ( " Base salary for sales employee is 40,000. ");
            System.out.println ( " Commission for 2015 is " + currentCommission);
            System.out.println ( " Your final salary for 2015 is " + dollar.format (totalSalary ));
            System.out.println ( " Total Sales  Total Compensation");   
                while (count <= 10)
                {
                annualSales = annualSales + increments;
                totalSalary = annualSales * currentCommission + salary;
                System.out.println (dollar.format(annualSales) + "\t\t" + dollar.format (totalSalary));
                count = count + 1;
                }   
        }    
                    /*
                    Annual Sales amount over 120,000 but under 150,000    
                    */
                    else if ( annualSales >= 120000 && annualSales <= 150000 )
                    {
                    System.out.println ();
                    System.out.println ( " Base salary for sales employee is 40,000. ");
                    System.out.println( " Commission for 2015 is " + salesTargetCommission );
                    System.out.println (" Total Sales  Total Compensation ");    
                    totalSalary = annualSales * salesTargetCommission + salary;
                    System.out.println (dollar.format (annualSales) + "\t\t" + dollar.format (totalSalary));
                        while (count <= 10)
                        {
                        annualSales = annualSales + increments;
                        totalSalary = annualSales * salesTargetCommission + salary;
                        System.out.println (dollar.format (annualSales) + "\t\t" + dollar.format (totalSalary ));
                        count = count + 1;
                        }
                
                    }
                            /*
                            Annual Sales over 150,000 gaining increased commission
                            */
                            else if( annualSales > 150000)
                            {
                            finalCommission = salesTargetCommission * accerlatorFactor;   
                            totalSalary = annualSales * finalCommission + salary;
                            System.out.println ();
                            System.out.println ( " Congradulations on exceeding the sales target. ");
                            System.out.println ( " Base salary for sales employee is 40,000. ");
                            System.out.println ( " The commission increases to " + finalCommission);
                            System.out.println ( " Final salary for 2015 is: " +  dollar.format (totalSalary ));
                                                       
                                              
                            }       
    
    
    /*
    Class calling end of program display message    
    */
    SalesChart mySalesChart = new SalesChart();
    mySalesChart.displayMessage();
    
    }
   
    
        
    
}           
                    
                    
                   
      
      
                                       
      
                 
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
        
        
                

    
  
   
    
