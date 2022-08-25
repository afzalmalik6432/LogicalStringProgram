package com.ashokIt;

import java.util.Scanner;

public class Program07 {
    public static void main(String[] args) {
        // Remove duplicate character using from string using java 8
        System.out.println("Enter the String from which you want to remove duplicate character: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        str.chars().distinct().forEach(c -> result.append((char)c));
        System.out.println("String after removal of duplicate character: "+result);
        sc.close();
    }
}
