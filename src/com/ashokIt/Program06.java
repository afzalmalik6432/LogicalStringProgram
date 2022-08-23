package com.ashokIt;

import java.util.Scanner;

public class Program06 {
    public static void main(String[] args) {
        // Replace white space from front and back
        System.out.println("Enter the String with Special character: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("String after removing trailing and leading spaces: "+str.trim());
        System.out.println("String after removing spaces: "+str.replaceAll("\\s", ""));
        sc.close();
    }
}
