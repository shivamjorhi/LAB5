package cg;


import java.util.Scanner;


   class Exercise1{
      public static void main(String args[]){
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter your choice from Red, Yellow and Green");
    	  String st = sc.nextLine();
    	  switch(st)
    	  {
    	  case "Red":
    		  System.out.println("Stop");
    		  break;
    	  case "Yellow":
    		  System.out.println("Ready");
    		  break;
    	  default:
    		  System.out.println("Go");
    		  break;
    		  
    	  }
    	  
    	  
    	  
     }
}