package com.ashokIt;

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        System.out.println("Enter the String to sort: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        char temp;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("String after sorting the data: "+String.valueOf(arr));
        sc.close();
    }
}
