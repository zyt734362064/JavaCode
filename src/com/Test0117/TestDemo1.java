package com.Test0117;

import java.util.Arrays;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-01-16
 */
public class TestDemo1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {2,4,5,6,8,9};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        func1(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void func1(int[] arr1,int[] arr2){
        for (int i = 0;i < arr1.length;i++){
            int tmp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = tmp;
        }
    }
}
