package com.Test0311;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-03-11
 */
public class TestDemo {
    public static void main(String[] args) {
        MyDoubleLinkedList myDoubleLinkedList = new MyDoubleLinkedList();
        myDoubleLinkedList.addFirst(3);
        myDoubleLinkedList.addFirst(2);
        myDoubleLinkedList.addFirst(1);
        myDoubleLinkedList.addLast(4);
        myDoubleLinkedList.addLast(5);
        myDoubleLinkedList.addLast(6);
        myDoubleLinkedList.addIndex(7,999);
        myDoubleLinkedList.addIndex(1,999);
        myDoubleLinkedList.addIndex(3,999);
        myDoubleLinkedList.display();
        //System.out.println(myDoubleLinkedList.contains(3));
        //System.out.println(myDoubleLinkedList.contains(8));
        //myDoubleLinkedList.remove(999);
        //myDoubleLinkedList.removeAllKey(999);
        myDoubleLinkedList.clear();
        System.out.println("====================");
        myDoubleLinkedList.display();
    }
}
