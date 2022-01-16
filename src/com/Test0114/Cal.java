package com.Test0114;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-01-14
 */
class Calculator{
    private int num1;
    private int num2;

    public void setNum1(int num1){
        this.num1 = num1;
    }
    public int getNum1(){
        return this.num1;
    }
    public  void setNum2(int num2){
        this.num2 = num2;
    }
    public int getNum2(){
        return this.num2;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

    public int add (){
        return this.num1+this.num2;
    }
    public int sub(){
        return this.num1 - this.num2;
    }
    public int mul(){
        return this.num1 * this.num2;
    }
    public double div(){
        return (double)(this.num1 / this.num2);
    }
    public Calculator(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("num1 = " + this.num1 +  "  num2 = " + this.num2);
    }
}
public class Cal {
    public static void main(String[] args) {
        Calculator cal = new Calculator(8,2);
        cal.setNum1(10);
        cal.setNum2(5);
        System.out.println(cal);
        System.out.println(cal.getNum1() + "+" + cal.getNum2()+ "=" + cal.add());
        System.out.println(cal.getNum1() + "-" + cal.getNum2()+ "=" + cal.sub());
        System.out.println(cal.getNum1() + "x" + cal.getNum2()+ "=" + cal.mul());
        System.out.println(cal.getNum1() + "÷" + cal.getNum2()+ "=" + cal.div());
    }
}
