package com.Test0311;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-03-11
 */

class ListNode{
    public int val;
    public ListNode next;
    public ListNode prev;

    public ListNode(int val){
        this.val = val;
    }
}
public class MyDoubleLinkedList {
    public ListNode head = new ListNode(-1);
    public ListNode last = head;
    //头插法
     public void addFirst(int data){
        ListNode node = new ListNode(data);
        if (head.next == null){
            head.next = node;
            node.prev = head;
            last = node;
            return;
        }
        ListNode cur = head;
        cur.next.prev = node;
        node.next = cur.next;
        cur.next = node;
        node.prev = cur;

     }
     //尾插法
     public void addLast(int data){

         ListNode node = new ListNode(data);
         ListNode cur = head;
         while (cur.next != null){
             cur = cur.next;
         }
         cur.next = node;
         node.prev = cur;
         last = cur;
    }

    //查找index 位置节点
    public ListNode searchIndex(int index){
         if (index < 0 || index >= size()){
             System.out.println("index 位置不合法");
             return null;
         }
         ListNode cur = head;
         while (index != 0){
             cur = cur.next;
             index--;
         }
         return cur;
    }


    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if (index == 0){
            throw new RuntimeException("不可以在该位置加入节点");
        }else if (index == 1){
            addFirst(data);
        }else if (index == size()){
            addLast(data);
        }else {
            ListNode node = new ListNode(data);
            ListNode cur = searchIndex(index);
            cur.prev.next = node;
            node.prev = cur.prev;
            node.next = cur;
            cur.prev = node;
        }
    }
     //查找是否包含关键字key是否在单链表当中
     public boolean contains(int key){
         if (head.next == null){
             return false;
         }
         ListNode cur = head.next;
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
        ListNode cur = head.next;
        while (cur != null){
            if (cur.val == key){
                cur.prev.next = cur.next;
                if (cur.next == null){
                    last = null;
                }else {
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
        ListNode cur = head.next;
        while (cur != null){
            if (cur.val == key){
                cur.prev.next = cur.next;
                if (cur.next == null){
                    last = null;
                }else {
                    cur.next.prev = cur.prev;
                }
            }
            cur = cur.next;
        }
    }
    //得到单链表的长度
    public int size(){
         int count = 0;
         ListNode cur = head;
         while (cur != null){
             count++;
             cur = cur.next;
         }
         return count;
    }
     public void display(){
        ListNode cur = head;
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
         System.out.println("删除所有节点");

     }

}
