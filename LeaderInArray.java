package com.softnerve.assesment;

import java.io.BufferedReader;
import java.lang.*;
import java.io.InputStreamReader;

public class LeaderInArray {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Size of array: ");
        int n = Integer.parseInt(br.readLine()); //size of array
        int[] arr = new int[n];
        String[] str;
        System.out.print("Enter elements of array: ");
        str = br.readLine().split(" ");    //user input of array
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(str[i]); //input in array
        int max =0;  //contains value of leader
        int num = 0; //contains index of leader
        //finding leader in array
        for(int i=0; i<n; i++){
            if(arr[i]>=max){
                max = arr[i];
                num = i;
            }
        }
        //printing output
        for(int i=num; i<n; i++) System.out.print(arr[i]+" ");
    }
}
