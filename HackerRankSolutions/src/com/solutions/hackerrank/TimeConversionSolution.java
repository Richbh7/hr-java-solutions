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
I/P: 12:40:22PM
O/P: 12:40:22
* 
I/P: 12:40:22AM
O/P: 00:40:22
 */
import java.util.*;

public class TimeConversionSolution {

    static String timeConversion(String s) {
        // Complete this function
        String ampm = s.substring(8, 10);

        String op = "";
        if (ampm.equalsIgnoreCase("AM")) {
            String hh = s.substring(0, 2);
            int hhInt = Integer.parseInt(hh);

            //int milHH = 12 - hhInt;
            if (hhInt == 12) {

                op = "00" + s.substring(2, 8);
            } else {
                op = s.substring(0, 8);
            }

        }
        if (ampm.equalsIgnoreCase("PM")) {
            String hh = s.substring(0, 2);
            int hhInt = Integer.parseInt(hh);

            if (hhInt == 12) {
                op = s.substring(0, 8);
            } else {
                int milHH = 12 + hhInt;
                op = String.valueOf(milHH) + s.substring(2, 8);
            }

        }

        return op;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
