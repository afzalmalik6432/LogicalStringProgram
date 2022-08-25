package com.ashokIt;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Program10 {
    public static void main(String[] args) {
        // Remove Duplicate using Set Interface
        System.out.println("Enter the String to remove the duplicate: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        Set<Character> set = new LinkedHashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        for (Character ch : set) {
            result.append(ch);
        }
        result.toString();
        System.out.println("String After removing dupicate character: "+result);
        sc.close();
    }
}
