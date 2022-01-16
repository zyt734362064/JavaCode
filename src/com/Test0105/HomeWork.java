package com.Test0105;
import java.util.Random;
import java.util.Scanner;
/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-01-07
 */
public class HomeWork {
    public static void main16(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 3;

        while (count != 0){
            System.out.println("请输入您的密码：");
            String password = sc.nextLine();
            if (password.equals("123456")){
                System.out.println("输入正确！");
                break;
            }else {
                count--;

                if (count== 0){
                    System.out.println("输入失败");
                }else {
                    System.out.println("输入错误，你还有"+ count + "次机会");
                }
            }
        }
    }
    public static void main(String[] args) {
        for(int n = 1;n <= 999999;n++){
            int count = 0;
            int tmp = n;
            while (tmp != 0){
                count++;
                tmp = tmp / 10;
            }
            tmp = n;
            int sum = 0;
            while (tmp != 0){
                sum += Math.pow(tmp % 10,count);
                tmp = tmp / 10;
            }
            if (sum == n){
                System.out.println(n + "是我们要找的数字");
            }
        }
    }
    public static void main13(String[] args) {
        int count = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 9){
                count++;
            }
            if (i / 10 == 9){
                count++;
            }
        }
        System.out.println(count);
    }


    public static void main12(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        int flag = 1;

        for (int i = 1; i <= n; i++) {
            sum += 1.0/i * flag;
            flag = - flag;
        }
        System.out.println(sum);
    }
    public static void main14(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        while (num1 % num2  != 0){
            int i = num1 % num2;
            num1 = num2 ;
            num2 = i;
        }
        System.out.println(num2);
    }

    public static void main10(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1;j <= i;j++){
                System.out.print(i + "*" + j + "=" + i*j + " ");
            }
            System.out.println();
        }


        /*Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        for (int i = 1000; i <= year; i++) {
            if ((i % 100 != 0 && i % 4 == 0) || i % 400 == 0 ){
                System.out.println(i + "是闰年");
            }
        }*/
    }



    public static void main9(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0;i <= n;i++ ){
            int j = 2;
            for( ; j <= (int)Math.sqrt(i);j++){
                if (i % j == 0){
                    break;
                }

            }
            if (j > (int)Math.sqrt(i)) {
                System.out.println(i + "是素数");
            }
        }












/*        for (int i = 0; i <= n; i++) {
            int j = 2;
            for ( ; j <= (int)Math.sqrt(n); j++) {
                if (i % j == 0) {
                    break;
                    }
                }
            if (j > (int)Math.sqrt(i)){

                System.out.println(i + "是素数");
            }
        }*/

    }


    public static void main8(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2;i < n;i++){
            if (n % i == 0){
                System.out.println("n不是一个素数");
                break;
            }else {
                System.out.println("n是素数");
                break;
            }
        }


        /*int n = sc.nextInt();
        if (n <= 19){

        }else if (n <= 19 && n <=55){

        }else if (n > 55){

        }*/
    }



    public static void main7(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randNum = random.nextInt(100);
        System.out.println(randNum);
        while (true){
            System.out.println("请输入你猜的数字");
            int num = sc.nextInt();
            if (num < randNum){
                System.out.println("你猜的数字小了！");
            }else if (num == randNum){
                System.out.println("你猜的数字对了！");
                break;
            }else {
                System.out.println("你猜的数字大了！");
            }

        }
    }



    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num;i++){
            int ret = 1;
            for (int j = 1;j < i;j++){
                ret *= j;
            }
            sum += ret;
        }
        System.out.println(sum);
    }


    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num <= 200){
            if (num % 15 == 0){
                System.out.println(num);
                continue;
            }
            System.out.println("hhh");
            num++;
        }
    }


    public static void main4(String[] args) {

        int sum = 0;
        int r = 1;
        while (r <= 5){
            int i = 1;
            int ret = 1;
            while (i <= r){
                ret *= i;
                i++;
            }
            sum += ret;
            r++;
        }

        System.out.println(sum);
    }





    public static void main3(String[] args) {

        int a =  2;
        switch (a){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
            default:
                System.out.println("请输入正确的数字");
        }




        /*int x = 10;
        int y = 10;
        if (x == 10) {
            if (y == 10){
                System.out.println("aaa");}
            else{
                System.out.println("bbb");}
        }*/
    }



    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()){
            int year = scan.nextInt();
            if ((year %  4 == 0 && year % 100 != 0) || year % 400 == 0){
                System.out.println(year + "年是闰年!");
            }else {
                System.out.println(year + "年不是闰年!");
            }
        }

    }



    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        String str = sc.next();
        System.out.println(str);
    }
}
