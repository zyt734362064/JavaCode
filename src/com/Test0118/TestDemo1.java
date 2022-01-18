package com.Test0118;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-01-18
 */
public class TestDemo1 {
    public static void main(String[] args) {
        MyArrayList  myArrayList = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            myArrayList.add(i,i);
        }
        //myArrayList.display();
        myArrayList.add(10,13);
        //myArrayList.display();
        /*System.out.println(myArrayList.search(15));
        System.out.println(myArrayList.search(1));
        System.out.println(myArrayList.search(13));*/
        //System.out.println(myArrayList.getPos(4));
        myArrayList.setPos(10,110);
        myArrayList.display();
        myArrayList.remove(0);
        myArrayList.remove(110);
        myArrayList.display();
    }
}
