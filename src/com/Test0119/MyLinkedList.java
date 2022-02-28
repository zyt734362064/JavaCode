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
        if (this.head == null){
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

    public void display2(Node newHead){
        Node cur = newHead;
        while (cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void clear(){
        this.head = null;
    };

    /**
     * 反转链表
     * @return
     */
    public Node reverseList(){
        Node cur = this.head;
        Node newHead = null;
        Node pre = null;
        while (cur != null){
            Node curNext = cur.next;
            if (curNext == null){
                newHead = cur;
            }
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return newHead;
    }

    /**
     * 找到单链表的中间节点
     * @param
     * @return
     */
    public Node middleNode() {
        if (head == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     * 倒数第K个节点
     * @param
     * @param k
     * @return
     */
    public Node FindKthToTail(int k){
        if(k <= 0 || this.head == null){
            throw new RuntimeException("k位置不合法");
        }
        Node fast = this.head;
        Node slow = this.head;
        while (k - 1 != 0){
            fast = fast.next;
            k--;
            if (fast == null){
                return null;
            }
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    /**
     * 合并两个链表
     */
    public Node mergeTwoLists(Node list1, Node list2){
        Node newHead  = new Node(-1);
        Node tmp = newHead;
        while (list1 != null && list2 != null){
            if (list1.data > list2.data){
                tmp.next = list2;
                list2 = list2.next;
                tmp = tmp.next;
            }else {
                    tmp.next = list1;
                    list1 = list1.next;
                    tmp = tmp.next;
            }
        }
        if (list1 != null){
            tmp.next = list1;
        }else if (list2 != null){
            tmp.next = list2;
        }

        return newHead.next;
    }
    /**
     * 链表分割
     */
    public Node partition(Node pHead, int x){
        Node be = null;
        Node bs = null;
        Node ae = null;
        Node as = null;
        Node cur = pHead;
        while (cur != null){
            if (cur.data < x){
                if (bs == null){
                    bs = cur;
                    be = cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                if (as == null){
                    as = cur;
                    ae = cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }

            }
            cur = cur.next;
        }
        if (be == null){
            return as;
        }
        be.next = as;
        if (as != null){
            ae.next = null;
        }
        return bs;
    }

    public Node deleteDuplication(Node pHead){
        Node newHead = new Node(-1);
        Node tmp = newHead;
        Node cur = pHead;
        while (cur != null){
            if (cur.next != null && cur.data == cur.next.data){
                while (cur.next != null && cur.data == cur.next.data){
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }
}
