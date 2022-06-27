package com.softnerve.assesment;

import java.io.BufferedReader;
import java.lang.*;
import java.io.InputStreamReader;

public class XOR_Sum {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Size of array: ");
        int n = Integer.parseInt(br.readLine()); //size of array
        int[] arr = new int[n];
        String[] str;
        System.out.print("Enter elements of array: ");
        str = br.readLine().split(" ");    //user input of array
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(str[i]); //input in array

        //solving to find XOR sum
        int ans= 0;
        int xor_sum = 0; //points sum
        for (int i = 0; i < (1<<arr.length); i++)
        {
            for (int j = 0; j < arr.length; j++) {
                if ((i & (1 << j)) > 0) {
                    xor_sum = xor_sum ^ arr[j];
                }
            }
            ans += xor_sum;
            xor_sum = 0;
        }
        System.out.println("XOR Sum: "+ans);
    }
}
