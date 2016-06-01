/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nisal;

import java.util.Scanner;

public class Program {

    public static void calc(int a, int b, int c, int d, int e) {
        int total;
        float P;
        total = a + b + c + d + e;
        P = total / 5;
        System.out.println("\nTotal: " + total);
        System.out.println("Percentage: " + P);
        if (a >= 32 && b >= 32 && c >= 32 && d >= 32 && e >= 32) {
            System.out.println("Status : Pass");
            if (P >= 75) {
                System.out.println("Division : Distinction");
            } else if (P >= 60 && P < 75) {
                System.out.println("Division : First");
            } else if (P >= 40 && P < 60) {
                System.out.println("Division : Second");
            } else {
                System.out.println("Division : Third");
            }

        } else {
            System.out.println("Status : Fail");
        }
    }

    public static void main(String[] args) {
        String a, ch;
        int b, c, d, e, f, g;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your Name: ");
            a = in.nextLine();

            System.out.println("Enter your Symbol No.: ");
            b = in.nextInt();
            System.out.println("Enter tha marks in Science : ");
            c = in.nextInt();
            System.out.println("Enter tha marks in Maths : ");
            d = in.nextInt();
            System.out.println("Enter tha marks in English : ");
            e = in.nextInt();
            System.out.println("Enter tha marks in Nepali : ");
            f = in.nextInt();
            System.out.println("Enter tha marks in Health : ");
            g = in.nextInt();
            System.out.println("\n--------------MARKSHEET----------------");

            System.out.println("Name: " + a);
            System.out.println("Symbol No.: " + b);

            System.out.println("Marks obtained in:\n");
            System.out.println("Science     " + c);
            System.out.println("Maths       " + d);
            System.out.println("English     " + e);
            System.out.println("Nepali      " + f);
            System.out.println("Health      " + g);
            calc(c, d, e, f, g);

            System.out.println("\nDo you want to enter next data?[Y/N]");
            ch = in.next();
            if (ch.equalsIgnoreCase("n")) {
                System.exit(0);
            }

        }
    }

}
