package com.ashokIt;

import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        // reverse string using tocharArray method
        System.out.println("Enter the string to reverse: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        char[] ch = str.toCharArray();
        for (int i = ch.length-1; i >= 0; i--) {
            result = result+ch[i];
        }
        System.out.println("Reversed String: "+result);
        sc.close();
    }
}
