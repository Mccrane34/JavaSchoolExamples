/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Crane
*/

import java.text.DecimalFormat;


public class EmployeeArray // Employee class to calculate the difference between two employees 
{
   
    
   
    
   public void calculation ( double totalSalaryEmployee1, double totalSalaryEmployee2, String employee1, String employee2 ) 
   {     
       
    double employee1More; // Variables to determine the employee with the highest salary.
    double employee2More;   
    
   
    
    DecimalFormat dollar = new DecimalFormat ("$###,###.00");  // Decimal format to display the final salary.
    
        if ( totalSalaryEmployee1 > totalSalaryEmployee2) // If decision determining which salary is the highest after calculating.
        {
        System.out.println ();
        System.out.println ( "Employee name: " + employee1);  // Employee name with the higher salary for the year 
        employee1More = totalSalaryEmployee1 - totalSalaryEmployee2;  // employee 1 salary subtracted by employee 2 salary
        System.out.println (  employee1  +  "'s salary of " +(dollar.format (totalSalaryEmployee1) + " is " + dollar.format (employee1More) + " more than " + employee2  + "'s salary. "));
        } // End of if statement
            else
            {
            System.out.println ();
            System.out.println ( "Employee name: " + employee2); 
            employee2More = totalSalaryEmployee2 - totalSalaryEmployee1;
            System.out.println ( employee2 + "'s salary of " +(dollar.format (totalSalaryEmployee2) + " is " + dollar.format (employee2More ) + " more than " + employee1 + "'s salary. "));
    
            } // End of else statement 
    
    
   } // End of void calculation 
   
          
} // End of class EmployeeArrary
   
    
    
    
     
    
   




    
  
    
    
    

