package com.Test0119;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-01-19
 */
public class TestDemo1 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(98);
        myLinkedList.addFirst(68);
        myLinkedList.addFirst(99);
        myLinkedList.addFirst(18);
        myLinkedList.addLast(100);
        myLinkedList.addLast(102);
        myLinkedList.addLast(99);
        myLinkedList.addLast(99);
        myLinkedList.addLast(99);
        myLinkedList.addLast(99);
        //myLinkedList.display();
        myLinkedList.addIndex(0,99);
        myLinkedList.addIndex(0,99);
        //myLinkedList.display();
        myLinkedList.removeAllKey(99);
        //System.out.println(myLinkedList.contains(99));
        //System.out.println("-------删除99后---------");
        myLinkedList.display();
        //myLinkedList.clear();
        //System.out.println("-------全部清除后--------");
        //myLinkedList.display();
        //myLinkedList.display2(myLinkedList.reverseList());
        System.out.println(myLinkedList.middleNode().data);
    }
}
