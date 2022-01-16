package com.TestDay;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2021-02-02
 */
public class Main41_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            String[] strs = str.split(";");
            int x = 0;
            int y = 0;
            for (String s: strs){
                if (s.charAt(0) == 'D' && s.substring(1).matches("[0-9]{1,2}")){
                    x += Integer.parseInt(s.substring(1));
                }
                if (s.charAt(0) == 'A' && s.substring(1).matches("[0-9]{1,2}")){
                    x -= Integer.parseInt(s.substring(1));
                }
                if (s.charAt(0) == 'W' && s.substring(1).matches("[0-9]{1,2}")){
                    y += Integer.parseInt(s.substring(1));
                }
                if (s.charAt(0) == 'S' && s.substring(1).matches("[0-9]{1,2}")){
                    y -= Integer.parseInt(s.substring(1));
                }
            }
            System.out.println(x + "," + y);
        }
    }
}
