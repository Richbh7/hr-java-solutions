/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solutions.hackerrank;

/**
 *
 * @author richabhatia
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DatatypesTest {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
         /* Declare second integer, double, and String variables. */

        int secI = 0;
        double secD = 0;
       
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        secI = scan.nextInt();
        secD = scan.nextDouble();
        String str = scan.next();
        String str2 = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+secI);

        /* Print the sum of the double variables on a new line. */
		 System.out.println(d+secD);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

            System.out.println("input: "+str2);
         System.out.println(s+str + str2);
         


        scan.close();

    }

}