/*
 * Week four program that asks for employee name and sales information for the year.
 * Each sales employee salary will be calculated by total sales multilplied by
 * a commission.  Commission will be determined by sales totals.  A salary will 
 * be added which also includes an increase in salary by total sales.  The two
 * employees will be compared in the year end salary.  
 */

/**
 *
 * @author Michael Crane
 */
  // Scanner input 
import java.util.Scanner;
import java.text.DecimalFormat;  // Decimal format 

public class SalesArray
{

    /**
     * @param args the command line arguments
     * 
     */
    
    
    /*
     Main program for each employee.  
    */
    public static void main(String[] args)
    {
    
   
    String employee1;  //Name for each employee
    String employee2;
    
    double sales;  // Total sales for year
    double totalSalaryEmployee1;  // Total salary for employee 1
    double totalSalaryEmployee2;  // Total salary for employee 2
    double totalSales;  // Total sales including commission 
    
    double[] Commission = {.10, .25, .35};  // Commission array containing commission rates depending on sales
    double[] Salary = {40000, 50000, 75000};  // Salary array containing salary rates depending on sales
   
    Scanner input = new Scanner(System.in); // Scanner input
    DecimalFormat dollar = new DecimalFormat ("$###,###.00"); // Format for displaying numbers
    
    
    System.out.println ( " Check the employee handbook for commission and salary scales. ");
    System.out.println ( " Enter information for sales employee 1: ");  // Information for employee 1
    System.out.print ( "Name: " ); 
    employee1 = input.nextLine();
    System.out.print ( "Sales: "); // Total sales only for employee 1 
    sales = input.nextDouble();  // input the sales amount 
        if (sales < 20000 )  // If decision if sales is less than 20,000.  Total salary is calculated in this if statement when sales is less than 20,000.
        {
            totalSales = (sales * Commission[0]); 
            totalSalaryEmployee1 = totalSales + Salary[0];
            System.out.println ( " The total salary for " + employee1 + " is: " + (dollar.format (totalSalaryEmployee1)));
            System.out.println ( " Salary for 2015 is: " + (dollar.format (Salary[0])));
            System.out.println ( " Commission for 2015: " + Commission[0]);
            System.out.println ( " Money earned from commmission and sales: " + (dollar.format (totalSales)));
            
        } //End of if statement 
                else if ( sales >= 20000 && sales <= 75000)  // If decision if sales is greater than 20,000 and less than 75,000.  Total salary is calculated.
                {  
                totalSales = sales * Commission[1];
                totalSalaryEmployee1 = totalSales + Salary[1];
                System.out.println (" The total salary for " + employee1 + " is: " + (dollar.format (totalSalaryEmployee1)));
                System.out.println ( " Salary for 2015 is: " + (dollar.format (Salary[1])));
                System.out.println ( " Commission for 2015: " + Commission[1]);
                System.out.println ( " Money earned from commmission and sales: " + (dollar.format (totalSales)));
                }  // End of else if statment    
                else // Else statement for when sales is over 75,000.  Total salary is calculated.  
                    {
                    totalSales = sales * Commission[2];
                    totalSalaryEmployee1 = totalSales + Salary[2];
                    System.out.println ( " The total salary for " + employee1 + " is: "+ (dollar.format (totalSalaryEmployee1)));
                    System.out.println ( " Salary for 2015 is: " + (dollar.format (Salary[2])));
                    System.out.println ( " Commission for 2015: " + Commission[2]);
                    System.out.println ( " Money earned from commmission and sales: " + (dollar.format (totalSales)));
                    } // End of else statement                 
    
        
    Scanner keyboard = new Scanner( System.in); // Scanner input 
    
    System.out.println ();
    System.out.println ( " Check the employee handbook for commission and salary scales. ");
    System.out.println ( " Enter information for sales employee 2: "); // Information for employee 2
    System.out.print ( "Name: " );
    employee2 = keyboard.nextLine();
    System.out.print ( "Sales: "); // Total sales for year
    sales = keyboard.nextDouble();
        if (sales < 20000 ) // If decision if sales is less than 20,000.  Total salary is calculated in this if statement when sales is less than 20,000.
        {
            totalSales = (sales * Commission[0]); 
            totalSalaryEmployee2 = totalSales + Salary[0];
            System.out.println (" The total salary for " + employee2 + " is: " + (dollar.format ( totalSalaryEmployee2)));
            System.out.println ( " Salary for 2015 is: " + (dollar.format (Salary[0])));
            System.out.println ( " Commission for 2015: " + Commission[0]);
            System.out.println ( " Money earned from commmission and sales: " + (dollar.format (totalSales)));
        } // End of if statement 
                else if ( sales >= 20000 && sales <= 75000) // If decision if sales is greater than 20,000 and less than 75,000.  Total salary is calculated.
                {  
                totalSales = sales * Commission[1];
                totalSalaryEmployee2 = totalSales + Salary[1];
                System.out.println (" The total salary for " + employee2 + " is: " + (dollar.format (totalSalaryEmployee2)));
                System.out.println ( " Salary for 2015 is: " + (dollar.format (Salary[1])));
                System.out.println ( " Commission for 2015: " + Commission[1]);
                System.out.println ( " Money earned from commmission and sales: " + (dollar.format (totalSales)));
                } // End of else if statement     
                else // Else statement for when sales is over 75,000.  Total salary is calculated.
                    {
                    totalSales = sales * Commission[2];
                    totalSalaryEmployee2 = totalSales + Salary[2];
                    System.out.println ( "The total salary for " + employee2 + " is: " + (dollar.format (totalSalaryEmployee2)));
                    System.out.println ( " Salary for 2015 is: " + (dollar.format (Salary[2])));
                    System.out.println ( " Commission for 2015: " + Commission[2]);
                    System.out.println ( " Money earned from commmission and sales: " + (dollar.format (totalSales)));
                    } // End of else statement             
     
    
        
    EmployeeArray myEmployeeArray = new EmployeeArray ( );  // New class to calculate the difference of the two employees
    myEmployeeArray.calculation( totalSalaryEmployee1, totalSalaryEmployee2, employee1, employee2 ); // Variables used by the class
                           
     
    
    
    
    
    
    
    
 
    
    }   
   
}    