package com.ashokIt;

import java.util.Arrays;
import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        // Sort String data using sort method.
        System.out.println("Enter the String to sort: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(String.valueOf(ch));
        sc.close();
    }
}
