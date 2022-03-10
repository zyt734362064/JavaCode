package com.Test0310;

import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-03-09
 */
class ListNode{
    public int val;
    public ListNode prev;
    public ListNode next;

    public ListNode(int val){
        this.val = val;
    }
}
public class MyLinkedList {
    public ListNode head;
    public ListNode last;

    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if (this.head == null){
            this.head = node;
            this.last = node;
            return;
        }
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }
         //尾插法
     public void addLast(int data){
        ListNode node = new ListNode(data);
        if (this.head == null){
            this.head = node;
            this.last = node;
            return;
        }
        last.next = node;
        node.prev = this.last;
        this.last = node;

    }

    public ListNode searchIndex(int index){
        if (index < 0 || index > size()){
             throw new  RuntimeException("index 位置不合法");
        }
        ListNode cur =  head;
        while (index != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
     public void addIndex(int index,int data) {
        ListNode cur = searchIndex(index);
        if (index == 0){
            addFirst(data);
        }else if (index == size()){
            addLast(data);
        }else {
            ListNode node = new ListNode(data);
            node.prev = cur.prev;
            node.next = cur;
            cur.prev.next = node;
            cur.prev = node;
        }
     }
     //查找是否包含关键字key是否在单链表当中
     public boolean contains(int key){
        ListNode cur = this.head;
        while (cur != null){
            if (cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
     }
    //删除第一次出现关键字为key的节点
     public void remove(int key){
         ListNode cur = head;
         while (cur != null) {
             if (cur.val == key){
                 if (cur == head){
                     head = head.next;
                     if (head == null){
                         last = null;
                     }else {
                         head.prev = null;
                     }
                 }else if (cur == last){
                     cur = cur.prev;
                     cur.next = null;
                 }else {
                     cur.prev.next = cur.next;
                     cur.next.prev = cur.prev;
                 }
                 return;
             }else {
                 cur = cur.next;
             }
         }
     }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == key){
                if (cur == head){
                    head = head.next;
                    if (head == null){
                        last = null;
                    }else {
                        head.prev = null;
                    }
                }else if (cur == last){
                    cur = cur.prev;
                    cur.next = null;
                }else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
                //return;
            }
            cur = cur.next;

        }
    }
     //得到单链表的长度
    public int size(){
        ListNode cur = head;
        int count = 0;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
     public void display(){
        ListNode cur = this.head;
        while (cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
         System.out.println();
     }
     public void clear(){
        while (head != null){
            ListNode curNext = head.next;
            head.prev = null;
            head.next = null;
            head = curNext;
        }
        last = null;
     }

}
