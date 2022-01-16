package com.Test0114;

import java.util.Random;
import java.util.Scanner;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-01-14
 */
public class TestDemo2 {
    public static void main(String[] args) {
        shuiXianHua(10000);
    }

    /**
     * 先求出这个数字是几位数字
     */
    public static void shuiXianHua(int n){
        for (int i = 1;i <= n;i++) {
            int tmp = i;
            int count = 0;
            while (tmp != 0) {
                tmp = tmp / 10;
                count++;
            }
            tmp = i;
            int sum = 0;
            while (tmp != 0) {
                sum += Math.pow(tmp % 10, count);
                tmp = tmp / 10;
            }
            if (sum == i){
                System.out.println(i + "是这个数字");
            }
        }
    }
    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(get_gcd(a, b));
        System.out.println(get_mingb(a,b));
    }
    /**
     * 最小公倍数= a * b / (a,b)的最大公约数
     */
    public static int get_mingb(int a,int b){
        return a * b / get_gcd(a,b);
    }

    /**
     * 最大公约数（辗转相除法）
     * @param a
     * @param b
     * @return
     */
    public static int get_gcd(int a,int b){
        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;
        if (max % min != 0){
            return get_gcd(min,max % min);
        }else {
            return min;
        }
    }
    public static void main5(String[] args) {
        double sum = 0;
        int flag = 1;
        for (int i = 1; i <= 100 ; i++) {
            sum += (double) 1 / ((flag)*i);
            flag = - flag;
        }
        System.out.println(sum);
    }
    public static void main4(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int i = 2;
        for (int j = 1;j <= 100;j++){
            for ( i = 2;i <= j;i++){
            if (j % i == 0){
                break;
                }
            }
            if (i == j){
                System.out.print(i + " ");
            }
        }


    }
    /**
     * 猜数字
     * @param args
     */
    public static void main3(String[] args) {
        Random random = new Random();
        int num =  random.nextInt(100);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("输入数字：");
            int n = sc.nextInt();
            if (n < num){
                System.out.println("小了");
            }else if (n > num){
                System.out.println("大了");
            }else {
                System.out.println("对了");
                break;
            }
        }
    }
    public static void main2(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while (i<= 10);
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = 1;
            for (int j = 1;j <= n; j++){
                tmp *= j;
            }
            sum += tmp;
        }
        System.out.println(sum);
    }
}
