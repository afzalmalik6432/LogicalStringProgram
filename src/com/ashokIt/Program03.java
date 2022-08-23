package com.ashokIt;

import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {
        // reverse string using charAt method
        System.out.println("Enter the string to reverse: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result = result+str.charAt(i);
        }
        System.out.println("Reversed String: "+result);
        sc.close();
    }
}
