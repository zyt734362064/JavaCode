package com.Test0310;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-03-10
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(99);
        myLinkedList.addFirst(99);
        myLinkedList.addFirst(99);
        myLinkedList.addFirst(99);
        myLinkedList.addFirst(99);
        myLinkedList.addFirst(99);

        //myLinkedList.addIndex(3,0);
        //myLinkedList.addIndex(0,0);
/*        myLinkedList.addFirst(99);
        myLinkedList.addFirst(77);
        myLinkedList.addFirst(77);
        myLinkedList.addLast(101);
        myLinkedList.addLast(77);
        myLinkedList.addLast(101);
        myLinkedList.addLast(202);
        myLinkedList.addLast(77);
        myLinkedList.addLast(202);
        myLinkedList.addLast(77);
        myLinkedList.addLast(77);*/
        //myLinkedList.addLast(303);
        //myLinkedList.addLast(303);
        myLinkedList.display();
        //System.out.println(myLinkedList.size());
        //System.out.println(myLinkedList.contains(22));
        //myLinkedList.removeAllKey(99);
        //myLinkedList.remove(101);
        System.out.println("==================");
        //myLinkedList.addIndex(6,0);
        //myLinkedList.display();
        myLinkedList.clear();
        myLinkedList.display();
    }
}
