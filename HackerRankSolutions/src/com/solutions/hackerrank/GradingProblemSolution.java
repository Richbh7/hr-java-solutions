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
import java.util.*;

public class GradingProblemSolution {

    static int[] solve(int[] grades){
        // Complete this function
        
        for(int i=0;i<grades.length;i++){
            if(grades[i]>=38){
                int rem = grades[i]%5;
                int diff = 5-rem;
                int roundoff = grades[i]+diff;
                //System.out.println("diff:"+diff);
                //System.out.println("roundoff:"+roundoff);
                if(roundoff-grades[i]<3){
                    grades[i]= roundoff;
                }
                
            }
          
        }
          return grades;
    }

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        int[] grades = {73,67,38,33};
//        for(int grades_i=0; grades_i < n; grades_i++){
//            grades[grades_i] = in.nextInt();
//        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}

/*
Expected O/P:
75
67
40
33
*/