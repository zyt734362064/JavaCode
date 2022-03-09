package com.Test0119;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-01-19
 */
public class TestDemo1 {
    /**
     * 合并两个链表
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
     * @param list1
     * @param list2
     * @return
     */
    public static Node mergeTwoLists(Node list1, Node list2) {
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while (list1 != null && list2 != null ){
            if (list1.data < list2.data){
                tmp.next = list1;
                tmp = tmp.next;
                list1 = list1.next;
            }else {
                tmp.next  = list2;
                tmp = tmp.next;
                list2 = list2.next;
            }
        }
        if (list1 == null){
            tmp.next = list2.next;
        }else {
            tmp.next = list1.next;
        }
        return newHead.next;
    }
    public static Node getIntersectionNode(Node headA, Node headB){
        if (headA == null || headB == null){
            return null;
        }
        Node pl = headA;
        Node ps = headB;
        int lenA = 0;
        int lenB = 0;
        int len = 0;
        while (pl != null){
            lenA++;
            pl = pl.next;
        }
        pl = headA;
        while (ps != null){
            lenB++;
            ps = ps.next;
        }
        ps = headB;
        len = lenA - lenB;
        if (len < 0 ){
            ps = headA;
            pl = headB;
            len = lenB - lenA;
        }
        while (len != 0){
            pl = pl.next;
            len--;
        }
        while (pl != null){
            if (pl == ps){
                return  ps;
            }
            pl = pl.next;
            ps = ps.next;
        }
        return null;
    }
    public static void createCut(Node headA,Node headB){
        headA.next.next = headB.next.next;
    }
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        MyLinkedList myLinkedList1 = new MyLinkedList();
        //myLinkedList1.addFirst(98);
        //myLinkedList1.addFirst(68);
        //myLinkedList1.addFirst(68);
        myLinkedList1.addLast(19);
        myLinkedList1.addLast(29);
        myLinkedList1.addLast(29);
        myLinkedList1.addLast(40);
        myLinkedList.addLast(79);
        myLinkedList.addLast(92);
        myLinkedList.addLast(92);
        myLinkedList.addLast(92);
        //myLinkedList.display();
        //myLinkedList.addIndex(0,99);
        //myLinkedList.addIndex(4,99);
        //myLinkedList.display();
        //myLinkedList.removeAllKey(99);
        //System.out.println(myLinkedList.contains(99));
        //System.out.println("-------删除99后---------");
        //myLinkedList.display();
        //myLinkedList1.display();
        //myLinkedList.clear();
        //System.out.println("-------全部清除后--------");
        //myLinkedList.display();
        //myLinkedList.display2(myLinkedList.reverseList());
        //System.out.println(myLinkedList.FindKthToTail(5).data);
       // System.out.println("//////////分割///////////");
        //Node tmp = myLinkedList.partition(myLinkedList1.head,40);
        //myLinkedList.display2(tmp);
        //Node tmp = myLinkedList1.deleteDuplication(myLinkedList1.head);
        //myLinkedList1.display2(tmp);


        createCut(myLinkedList.head,myLinkedList1.head);
        myLinkedList.display();
        myLinkedList1.display();
        try{
            Node ret = getIntersectionNode(myLinkedList.head,myLinkedList1.head);
            System.out.println(ret.data);
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("没有相交的节点!");
        }


    }
}
