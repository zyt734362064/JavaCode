package com.Test0108;

/**
 * Create with IntelliJ IDEA
 * Description:递归
 * User:Zyt
 * Date:2022-01-10
 */

public class Test3 {
    public static int fac(int n){
        if(n == 1){
            return 1;
        }
        return n * fac(n - 1);
    }
    public static void  func1(int a){
        if(a > 9){
            func1(a / 10);
        }
        System.out.println(a % 10);
    }

    public static void main(String[] args) {
        int a = 10;
        hanoi(1,'a','b','c');
        System.out.println();
        hanoi(2,'a','b','c');
        System.out.println();
        hanoi(3,'a','b','c');

        //func1(a);
    }
    public  static void move(char pos1,char pos2){
        System.out.print(pos1 + "->" + pos2 + " ");
    }
    /**
     *
     * @param n 方块的个数
     * @param pos1：起始位置
     * @param pos2：中途位置
     * @param pos3：终点位置
     */
    public static void hanoi(int n,char pos1,char pos2,char pos3){
        if (n == 1){
            move(pos1,pos3);
        }else {
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }
    public static int frog(int n){
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        return frog(n -  1) + frog(n - 2);
    }
    public static int fabonaci(int n){
        if (n == 1 || n== 2){
            return 1;
        }
        return fabonaci(n - 1) + fabonaci(n - 2);
    }
    public static int fabonaci2(int n ){
         int f1 = 1;
         int f2 = 1;
         int f3 = 1;
        for (int i = 3; i <= n ; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n - 1);
    }

    public static int func2(int n){
        if (n >= 9){
            return n % 10 + func2(n / 10);
        }
        return n;
    }
}
