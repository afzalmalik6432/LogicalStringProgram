package com.ashokIt;

import java.util.Scanner;

public class Program09 {
    public static void main(String[] args) {
        // Remove duplicate from string using toCharArray method
        System.out.println("Enter the string to remove duplicate: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag){
                result.append(arr[i]);
            }
        }
        System.out.println("String without duplicate: "+result);
        sc.close();
    }
}
