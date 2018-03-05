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

public class MiniMaxSumSolution {

    static void miniMaxSum(int[] arr) {
        // Complete this function
        long largest=arr[0],smallest=arr[0],sum=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
                largest = arr[i];
             if(arr[i]<smallest)
                 smallest = arr[i];
            
            sum+=arr[i];
        }
       
//        for(int i=0;i<arr.length-1;i++)
//        {
//            if(arr[i+1]>arr[i])
//                largest = arr[i+1];
//             if(arr[i+1]<arr[i])
//                 smallest = arr[i];
//            
//            
//        }
//        for(int i=0;i<arr.length;i++)
//        {
//            sum+=arr[i];
//        }
        
        System.out.println((sum-largest)+" "+(sum-smallest));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
