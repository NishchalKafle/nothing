/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;

import java.util.Scanner;
public class Calculator {

    
    public static void main(String[] args) {
        int a,b,ans=0;
        char op;
        Scanner c = new Scanner(System.in);
        System.out.println("Enter two numbers = ");
        a = c.nextInt();
        b = c.nextInt();
        System.out.println("Enter either '+' or '-' or '*' or '/'");
        op = c.next().charAt(0);
        
        switch (op){
            case '+': ans = a + b;
                break;
            case '-': ans = a - b;
                break;
            case '*': ans = a * b;
                break;
            case '/': ans = a / b;
                break;
                
        }
        System.out.println(String.format("%d%c%d = %d" ,a,op,b,ans));
    }
    
}
