/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nishchal.program;

/**
 *
 * @author Nishchal
 */
public class Multiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
   {
    int a,i,j;   
   
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++){
                a=(i*j);
                System.out.println(String.format("%d*%d = %d", i,j,a));
// TODO code application logic here
                
    }
    
}
   }
}
