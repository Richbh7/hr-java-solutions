/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solutions.hackerrank;

/**
 *
 * @author richabhatia
 * I/P:
 * 6
 * O/P:
     #
    ##
   ###
  ####
 #####
######
 
 */

import java.util.*;

public class StaircaseSolution {

    static void staircase(int n) {
        // Complete this function

          for(int i=0;i<n;i++)
        {
            for(int j=0; j<n;j++)
            {
                if((i+j)<=(n-2)){
                     System.out.print(" ");
                }
              else{
                  System.out.print("#");
              }
             
            }
              
                System.out.println();
                
        }
            
            
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}