package com.Test0118;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-01-18
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
        if (this.head == null){
            this.head  = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    };
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
    };
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if (index == 0){
            this.addFirst(data);
            return;
        }
        if (index == this.size()){
            this.addLast(data);
            return;
        }
        Node cur = searchIndex(index);
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;

    };
    private Node searchIndex(int index){
        if (index < 0 || index > this.size()){
            throw new RuntimeException("index位置不合法");
        }
        Node cur = this.head;
        while (index-1 != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }


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


    private Node searchPre(int key){
        Node pre = this.head;
        while (pre.next != null){
            if (pre.next.data == key){
                return pre;
            }
            pre = pre.next;
        }
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if (this.head == null){
            System.out.println("链表为空");
            return;
        }
        if (this.head.data == key){
            this.head = this.head.next;
            return;
        }
        Node pre = searchPre(key);
        if (pre == null){
            System.out.println("没有这个节点");
            return;
        }
        Node cur = pre.next;
        pre.next = cur.next;
    };
    //删除所有值为key的节点
    public void removeAllKey(int key){
        Node pre = this.head;
        Node cur = pre.next;
        while (cur != null){
            if (cur.data == key){
                pre.next = cur.next;
                cur = cur.next;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }
        if (this.head.data == key){
            this.head = this.head.next;
        }
    };
    //得到单链表的长度
    public int size(){
        if (this.head == null){
            return 0;
        }
        int size = 0;
        Node cur = this.head;
        while (cur != null){
            size++;
            cur = cur.next;
        }
        return size;
    };
    public void display(){
        Node cur = this.head;
        while (cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    };
    public void clear(){

    };
}
