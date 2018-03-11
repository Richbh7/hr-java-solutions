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

public class AppleAndOrangeSolution {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        // Complete this function
      
        int countApples =0,countOranges =0;
        for(int i=0;i<apples.length;i++)
        {
             //System.out.println("a+apples[i]:"+(a+apples[i]));
               
            
            if(((a+apples[i])>=s)&&((a+apples[i])<=t))
                countApples++;
        }
        
          for(int i=0;i<oranges.length;i++)
        {
              //System.out.println("b+oranges[i]:"+(b+oranges[i]));
              if(((b+oranges[i])>=s)&&((b+oranges[i])<=t))
                    countOranges++;
        }
        System.out.println(countApples);
        System.out.println(countOranges);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}
