/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laneassignment;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
/**
 *
 * @author bruce
 */
public class LaneAssignment {   // Class LaneAssignment

private static int laneNumber = 1;    //Create variable 

private static final LaneAssignment laneAssignmentInstance = new LaneAssignment();  // Create LaneAssignment and assign the variable laneAssignment Instance

public int AssignLane(String name)
{

    
return laneNumber++; 
 
}   

 public static LaneAssignment getInstance() {
     
 return laneAssignmentInstance;
 }
    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
  
  String lang = "fr";
  String country ="CA";
  
  Locale l = new Locale(lang, country);
  ResourceBundle r = ResourceBundle.getBundle("weekTwo", l);
  String str = r.getString("spokenWord");
  System.out.println(str);
  
  Date today = new Date(0);    
  SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("08-16-2015");
  String date = DATE_FORMAT.format(today);
  System.out.println("Today in dd-MM-yyyy format : " + date); 
  
      
  int laneNumber = 0;   
  String name;
  
  
  Scanner input = new Scanner(System.in);
  
  while (laneNumber < 8){
    
  System.out.println( "Please enter each runner's name.");
  name = input.next(); 
  assert checkName(name);
  laneNumber = LaneAssignment.getInstance().AssignLane("");
  System.out.println(  name + " is in lane " + laneNumber);
     
  }  
   
  System.out.println("No more runners can be entered in the race");
  
  
  }  
  private static boolean checkName(String s) {
  try {
  Integer.parseUnsignedInt(s);
  return true;
  } catch (Exception e) {
  return false;  
  }
  
  }   
  
     
  }
  


