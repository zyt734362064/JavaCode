package com.Test0118;

/**
 * Create with IntelliJ IDEA
 * Description:检验单链表的方法
 * User:Zyt
 * Date:2022-01-18
 */
public class TestDemo2 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(5);
        myLinkedList.addLast(108);
        myLinkedList.addLast(133);
        myLinkedList.addLast(143);
        myLinkedList.addLast(5);
        myLinkedList.addLast(5);
        myLinkedList.addLast(5);
        //myLinkedList.display();
        System.out.println(myLinkedList.size());
        myLinkedList.addIndex(6,10);
        myLinkedList.addIndex(2,5);
        myLinkedList.addIndex(2,5);
        myLinkedList.addIndex(2,5);
        //myLinkedList.addIndex(10,5);
        myLinkedList.display();
        myLinkedList.removeAllKey(5);
        myLinkedList.display();
        //System.out.println(myLinkedList.contains(18));
        //System.out.println(myLinkedList.size());

    }
}
