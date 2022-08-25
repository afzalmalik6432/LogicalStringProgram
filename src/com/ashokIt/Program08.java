package com.ashokIt;

import java.util.Scanner;

public class Program08 {
    public static void main(String[] args) {
        // Remove duplicate character using from string using indexOf method
        System.out.println("Enter the String from which you want to remove duplicate character: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = str.indexOf(ch, i+1);
            if (idx == -1) {
                result.append(ch);
            }
        }
        System.out.println("String after removal of duplicate character: "+result);
        sc.close();
        
    }
}
