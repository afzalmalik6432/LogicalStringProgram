package com.ashokIt;

import java.util.Scanner;

public class Program04 {
    public static void main(String[] args) {
        System.out.println("Enter the String with special character: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("String after deleting the special character: "+str.replaceAll("[^a-zA-Z0-9]", ""));
        sc.close();
    }
}
