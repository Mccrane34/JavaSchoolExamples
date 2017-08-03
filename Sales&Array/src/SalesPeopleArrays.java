/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Crane
 */
public class SalesPeopleArrays 


{
 //sets the variables
    double commission = 0.10;//the commission is 10%
    final int fixedSalary = 70000;//stating the fixed salary
    String name1;//space for the 1st name
    double sales1;//space for the 1st sales
    String name2;//space for the 2nd name
    double sales2;//space for the 2nd sales
    
    //This void gets information from the main class
    public void set(String person1, String person2, double S1, double S2)
    {
     name1 = person1;
     name2 = person2;
     sales1= S1;
     sales2= S2;
             
    }
    
    public void getArray()
    {
        //First array is a string and for the names
       String[] Person1 = new String[2]; 
            Person1[0] = name1;
            Person1[1] = name2; 
              System.out.println("       Sale associate and sales    ");
              System.out.println(" ------------------------------------------");
              
              for (int i = 0; i < 2; i++)
            {
             
              System.out.print("     " +  "      " + Person1[i] ); 
             
            }
    
                    
       //Second array is for the two sales amounts     
       double[] annualsales2 = new double[2];
            annualsales2[0] = sales1;
            annualsales2[1] = sales2;
               System.out.println("         ");
               System.out.println("-------------------------------------------");
               
               for (int p = 0; p < 2; p++) 
            {
              
              System.out.print("      " + "     " + annualsales2[p] ); 
              
            }
        
    }
    //This void gets the highest seller and gets the difference between the two
    public void getHighest()
{
    //if-else statement that prints something different depending on who is higher
    if (sales1 < sales2){
        System.out.println("\n" + name2 + " with $" + sales2 
                + " in sales is the highest seller this year. " + name1 + "needs $" 
                + (sales2 - sales1) + " to match the highest seller.");
    }else{
        System.out.println("\n" + name1 + " with $" + sales1 
                + " in sales is the highest seller this year. " + name2 + "  needs $" 
                + (sales1 - sales2) + " to match the highest seller.");
         }//displays sells and how much is needed to match
              
}
    
} //end of class         
   
    
    
    

