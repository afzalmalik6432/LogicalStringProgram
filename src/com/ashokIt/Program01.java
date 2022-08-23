package com.ashokIt;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {

        System.out.println("Enter the String to reverse: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Approach 1 --> Using StringBuffer class
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println("Reversed String: "+sb1.reverse());
        sc.close();

        // Approach 2 --> Using StringBuilder class
        StringBuilder sb2 = new StringBuilder(str);
        System.out.println("Reversed String: "+sb2.reverse());
    }
}
