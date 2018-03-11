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

public class KangarooSolution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
         //int d1=0,d2=0;
       if((x2>x1)&&(v2>v1))
       {  
           return "NO";
       }
       else{
           
           
           if(v2>v1){
            if((x1-x2)%(v2-v1)==0)
               return "YES";
           else 
               return "NO";
           }
          
           
           //BRUTE FORCE APPROACH
     /*
           for(int i=0;i<10000;i++){
            d1= x1+v1*i;
            d2= x2+v2*i;
            
            if(d1==d2)
            {
                System.out.println("i:"+i);
                return "YES";
            }
                
            
        }//end of for
    */
       }//end of else
       
       return "NO";
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int x1 = in.nextInt();
//        int v1 = in.nextInt();
//        int x2 = in.nextInt();
//        int v2 = in.nextInt();
        //String result = kangaroo(4523, 8092, 9419, 8076);
        String result = kangaroo(43, 2, 70, 2);
        System.out.println(result);
    }
}
