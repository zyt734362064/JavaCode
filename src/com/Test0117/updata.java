package com.Test0117;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-01-16
 */
class Value{
    private int myValue;

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class updata {
    public static void main(String[] args) {
        Value value1 = new Value();
        value1.setMyValue(10);
        Value value2 = new Value();
        value2.setMyValue(20);
        System.out.println(value1.getMyValue());
        System.out.println(value2.getMyValue());
        swap(value1,value2);
        System.out.println("开始交换：");
        System.out.println(value1.getMyValue());
        System.out.println(value2.getMyValue());
    }
    public static void swap(Value value1,Value value2){
        int tmp = value1.getMyValue();
        value1.setMyValue(value2.getMyValue());
        value2.setMyValue(tmp);
    }
}
