package com.srihari;

import java.util.Scanner; 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		  System.out.println("Numner 1:");
		  
		  int a =0;
		  
		  a = Integer.parseInt(myObj.nextLine());
		  
		   System.out.println("Numner 2:");
		  
		  int b =0;
		  
		  b = Integer.parseInt(myObj.nextLine());
		  
		  System.out.println("Sum of Two Numbers :" + (a +b));
		
    }
}
