package com.ashokIt;

import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {
        // Remove special character using ascii values
        System.out.println("Enter the String with Special character: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>64 && str.charAt(i)<91 || str.charAt(i)>=97 && str.charAt(i)<=122) {
                result = result+str.charAt(i);
            }
        }
        System.out.println("String without special char: "+result);
        sc.close();
    }
}
