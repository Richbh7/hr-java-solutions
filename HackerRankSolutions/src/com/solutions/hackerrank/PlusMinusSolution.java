/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solutions.hackerrank;

/**
 *
 * @author richabhatia
 * 
 * Input
 * 6
* -4 3 -9 0 4 1
* Output
* 0.5
* 0.3333333333333333
* 0.16666666666666666
 */
import java.util.*;

public class PlusMinusSolution {

    static void plusMinus(int[] arr) {
        // Complete this function
        int n= arr.length;
        int posCount=0, negCount=0, zeroCount=0;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
                posCount++;
            if(arr[i]<0)
                negCount++;
            if(arr[i]==0)
                zeroCount++;
            
        }
        System.out.println((double)posCount/n);
        System.out.println((double)negCount/n);
        System.out.println((double)zeroCount/n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}