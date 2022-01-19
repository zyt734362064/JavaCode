package com.Test0119;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-01-19
 */
class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedList {
    public Node head;
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        node.next = this.head;
        this.head = node;
    };
    //尾插法
    public void addLast(int data){
        if (this.head == null){
            addFirst(data);
        }
        Node node = new Node(data);
        Node cur = this.head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
    };
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if (index == 0){
            addFirst(data);
            return;
        }
        if (index == size()){
            addLast(data);
            return;
        }
        if (index < 0 || index > size() + 1){
            throw new RuntimeException("index 不合法");
        }
        Node cur = this.head;
        Node node = new Node(data);
        while (index - 1 != 0){
            cur = cur.next;
            index--;
        }
        node.next = cur.next;
        cur.next = node;
    };
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = this.head;
        while (cur != null){
            if (cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    };
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if (!contains(key)){
            System.out.println("不存在该节点");
            return;
        }
        Node cur = this.head.next;
        Node pre = this.head;
        if (pre.data == key){
            this.head = cur;
            return;
        }
        while (cur.data != key){
            pre = cur;
            cur = cur.next;
        }
        pre.next = cur.next;

    };
    //删除所有值为key的节点
    public void removeAllKey(int key){
        if (!contains(key)){
            System.out.println("不存在该节点");
            return;
        }
        Node cur = this.head.next;
        Node pre = this.head;
        while (cur != null){
            if (head.data == key){
                this.head = this.head.next;
                pre = this.head;
                cur = this.head.next;
            }else if (cur.data == key){
                cur = cur.next;
                pre.next = cur;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }
    };
    //得到单链表的长度
    public int size(){
        Node cur = this.head;
        int size = 0;
        while (cur != null){
            size++;
            cur =cur.next;
        }
        return size;
    };
    public void display(){
        Node cur = this.head;
        while (cur != null){
            System.out.printf(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    };
    public void clear(){
        this.head = null;
    };
}
