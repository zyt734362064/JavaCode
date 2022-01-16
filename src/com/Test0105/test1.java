package com.Test0105;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-01-05
 */
public class test1 {
    public static void main(String[] args) {
        System.out.println(Solve("adfghj"));
    }
    public static String Solve(String str){
        char[] chars = str.toCharArray();
        int a = 0;
        int b = chars.length - 1;
        while (a <= b){
            char c = chars[a];
            chars[a] = chars[b];
            chars[b] = c;
            a++;
            b--;
        }
        return new String(chars);
    }
}
