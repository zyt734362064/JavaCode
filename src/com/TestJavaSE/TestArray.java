package com.TestJavaSE;

import java.util.Arrays;

/**
 * Create with IntelliJ IDEA
 * Description:数组
 * User:Zyt
 * Date:2022-01-11
 */
public class TestArray {
    public static void main(String[] args) {
        int[] arr = {11,37,27,4,8,12,5};
        int[] arr2 = {1,2,3,4,5,6,7};
        //bubbleSort(arr);
        swapJiOu(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    public static void swapJiOu(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            while (left < right && arr[left] % 2 == 0){
                left++;
            }
            while (left < right && arr[right] % 2 != 0){
                right--;
            }
            if (left < right){
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
    }
    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
    public static int[] bubbleSort(int[] arr){
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            flag = true;
            for(int j = 0;j < arr.length - 1 -i;j++){
                if (arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = false;
                    }
                }
            if (flag == true){
                break;
            }
        }
        return arr;
    }
    public static boolean isUp(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i - 1] > arr[i]){
                return false;
            }
        }
        return true;
    }
    /**
     * 数组的拷贝有四种浅拷贝方式:
     * 1、for
     * 2、Arrays.copyOf
     * 3、System.arrayCopy
     * 4、clone();产生了此对象的副本，这个方法是Object的克隆方法
     * 浅拷贝
     *
     * @param args
     */
    public static void main6(String[] args) {
        int[] arr = {51,13,4,26,8,32,15,28,35};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //System.out.println(key);
        //System.out.println(Arrays.binarySearch(arr,2,6,6));
    }

    /**
     *二分查找
     * @param array
     * @return
     */
    public static int binarySearch(int[] array,int key){
        int left = 0;
        int right = array.length - 1;
        int m = 0;
        while (left <= right){
            m = (left + right) >>> 1;
            //m = (left + right) / 2;
            if (array[m] < key){
                left = m + 1;
            }else if (array[m] > key){
                right = m - 1;
            }else{
                return m;
            }

        }
        return -1;
    }

    public static void swap1(int[] arr){

        int i = arr[0];
        arr[0] = arr[1];
        arr[1] = i;

    }
    public static int maxValue(int[] arr){
        int max = arr[0];
        for (int i = 1;i < arr.length;i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main5(String[] args) {
        int[] arr = {2,5,4,1,34,56};
        /*int[] arr2 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arr2));*/
        int[] ret = new int[arr.length];
        //System.arraycopy(arr,0,ret,0,arr.length);
        ret = arr.clone();
        System.out.println(Arrays.toString(ret));
    }

    public static void main4(String[] args) {
        int[] arr = {2,5,4,1,34,56};
        int[] arr2 = copyArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] copyArray(int[] array){
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }
    public static String myToString(int[] arr){
        String s = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            s += arr[i];
            s += ",";
        }
        s += arr[arr.length - 1] ;
        s += "]";
        return s;
    }
    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] ret = doubleArray(array);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] doubleArray(int[] arr){
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i] * 2;
        }
        return array;
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        Arrays.toString(array);//将数组以字符串的形式输出
            }
    public static void main1(String[] args) {
        int[] array = {10,20};

        /*int[] array1 = new int[]{11,22,33,44};
        int[] array2 = new int[4];
        for (int arr:array1) {
            System.out.println(arr);
        }*/
        System.out.print(array[0] + " " + array[1]);
        System.out.println();
        swap(array);
        System.out.print(array[0] + " " + array[1]);
    }
    public static void swap(int[] arr){
        int i = arr[0];
        arr[0] = arr[1];
        arr[1] = i;
    }
}
