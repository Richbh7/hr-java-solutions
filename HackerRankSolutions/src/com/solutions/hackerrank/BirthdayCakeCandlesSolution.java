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
 * You are in-charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task is to find out how many candles she can successfully blow out.

For example, if your niece is turning  years old, and the cake will have  candles of height , , , , she will be able to blow out  candles successfully, since the tallest candle is of height  and there are  such candles.

Complete the function birthdayCakeCandles that takes your niece's age and an integer array containing height of each candle as input, and return the number of candles she can successfully blow out.

Input Format

The first line contains a single integer, , denoting the number of candles on the cake. 
The second line contains  space-separated integers, where each integer  describes the height of candle .

Constraints

Output Format

Print the number of candles the can be blown out on a new line.


 * I/P:
 * 10
18 90 90 13 90 75 90 8 90 43
* O/P:
5
 */
import java.util.*;

public class BirthdayCakeCandlesSolution {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int largest = ar[0];
        int count =0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>largest)
            {
                largest = ar[i];
                count =0;
            }
            
            if(ar[i]==largest)
            {
                count++;
            }
        }
       // System.out.println(largest);
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}