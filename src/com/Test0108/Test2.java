package com.Test0108;

/**
 * Create with IntelliJ IDEA
 * Description:方法的重载和重写的区别
 *
 * User:Zyt
 * Date:2022-01-10
 */
public class Test2 {
    public static void main(String[] args) {

    }
    public static int add(int a,int b){
        return (a + b);
    }
    public static double add(double a,double b){
        return a + b;
    }
    public static int add(int a,int b,int c){
        return a + b + c;
    }
    public static int add(int a,int b,int c,int d){
        return a + b + c + d;
    }
}
