package com.softnerve.assesment;

import java.io.BufferedReader;
import java.lang.*;
import java.io.InputStreamReader;

public class Stocks {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Size of array: ");
        int n = Integer.parseInt(br.readLine()); //size of array
        int[] arr = new int[n];
        String[] str;
        System.out.print("Enter elements of array: ");
        str = br.readLine().split(" ");    //user input of array
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(str[i]);

        //solving to find best time to sell stock;
        int max= 0;
        int buy = 0; //points sum
        int sell = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i; j < arr.length; j++) {
                if (arr[j]-arr[i]>max) {
                    max = arr[j]-arr[i];
                    buy = i+1;
                    sell = j+1;
                }
            }
        }
        if(max>0){
            System.out.println("Shares should be bought on day "+buy+" "+"and sold on day "+sell);
            System.out.println("Total profit: "+arr[sell-1]+" - "+arr[buy-1]+" = "+max);
        }
        else System.out.println("No profitable transaction dates.");
    }
}
