package com.Test0108;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-01-08
 */

import java.util.Scanner;

public class Test1 {
    /**
     * Java 的方法
     * @param args
     */

    public static void main(String[] args) {
        System.out.println(factory(7));
    }

    /**
     * 求 n 的阶乘
     * @param n
     * @return
     */
    public static int fac(int n){
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }

    public static int factory(int n){
        int sum = 0;
        for (int i = 1;i <= n;i++){
            sum += fac(i);
        }
        return sum;
    }

    public static int numsMax(int num1,int num2,int num3){
        int max = num1 > num2 ? num1 : num2;
        max = max > num3 ? max : num3;
        return max;
    }


    /**
     * 获取一个数二进制序列中的所有偶数位和奇数位，分别输出二进制序列
     */
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 31;i >= 1;i -= 2){
            System.out.print(((n >> i) & 1) + " ");
        }
        System.out.println();
        for (int i = 30; i>= 0; i -= 2){
            System.out.print(((n >> i) & 1) + " ");
        }
    }

    /**
     * 判断二进制1的个数->1.判断每一位上是不是1，当前数字和1与操作
     * 2.n&(n-1)
     */
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 0){
            n = n & ( n - 1);
            count++;
        }
        System.out.println(count);
    }

    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1 ) == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
