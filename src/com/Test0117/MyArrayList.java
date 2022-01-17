package com.Test0117;

import java.util.Arrays;

/**
 * Create with IntelliJ IDEA
 * Description:线性表\顺序表
 * User:Zyt
 * Date:2022-01-17
 */
public class MyArrayList {
    public int[] elem;//数组
    public int usedSize;//有效的数据个数
    public static  final int capacity = 10; //初始容量
    public MyArrayList(){
        this.elem = new int[capacity];
        this.usedSize = 0;
    }


        // 打印顺序表
        public void display() {
            for (int i = 0;i < usedSize;i++){
                System.out.print(this.elem[i] + " ");
            }
        }

        // 在 pos 位置新增元素
        private boolean isFull(){
            if (this.usedSize == this.elem.length){
                return true;
            }
            return false;
        }
        /**
         * 1、判断pos位置是否合法
         * 2、移动数据i = usedSize - 1;[i +1] = [i]
         * 3、当 i < pos 说明数据移动完了
         * 4、this.elem[pos] = data;
         * @param pos
         * @param data
         */

        public void add(int pos, int data) {
            if (isFull()){
                //扩容为原来的二倍
                this.elem = Arrays.copyOf(this.elem,2 * this.elem.length);
            }
            checkPos(pos);
            for (int i = usedSize - 1;i >= pos;i--){
                this.elem[i + 1] = elem[i];
            }
            this.elem[pos] = data;
            this.usedSize++;
        }

        // 判定是否包含某个元素
        public boolean contains(int toFind) {
            for (int i = 0; i < usedSize; i++) {
                if (toFind == this.elem[i]){
                    return true;
                }
            }
            return false;
        }

    /**
     * 检查pos位置合法性
     * @param pos
     */
        private void checkPos(int pos){
            if (pos < 0 || pos > this.usedSize ){
                throw new RuntimeException("pos位置不合法！");
            }
        }
        // 查找某个元素对应的位置
        public int search(int toFind) {
            for (int i = 0; i < usedSize; i++) {
                if (toFind == this.elem[i]){
                    return i;
                }
            }
            return -1;
        }

        // 获取 pos 位置的元素

    /**
     * 1、顺序表是否为 null
     * 2、 pos 合法性
     * 3、return pos位置的数据
     * @param pos
     * @return
     */
        public int getPos(int pos) {
            if (this.usedSize == 0){
                //return -1;
                throw new  RuntimeException("顺序表为空!");
            }
            if (pos < 0 || pos >= this.usedSize){
                throw new RuntimeException("pos位置不合法");
            }
                return this.elem[pos];
            }

        // 给 pos 位置的元素设为 value
        public void setPos(int pos, int value) {
            if (pos < 0 || pos >= this.usedSize){
                throw new RuntimeException("pos 位置不合法");
            }
            this.elem[pos] = value;
        }

        //删除第一次出现的关键字key
        public void remove(int toRemove) {
            int index = search(toRemove);
            if (index == -1){
                System.out.println("不存在该数字");
                return;
            }
            for (int i = index;i < this.usedSize -1;i++){
                this.elem[i] = this.elem[i + 1];
            }
            this.usedSize--;

        }

        // 获取顺序表长度
        public int size() {
            return this.usedSize;
        }

        // 清空顺序表
        public void clear() {
            this.usedSize = 0;
        }

    public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            myArrayList1.add(i,i);
        }
        //myArrayList1.display();
        myArrayList1.add(10,123);
        System.out.println();
        myArrayList1.display();
        System.out.println();
        System.out.println("====================");
        /*System.out.println(myArrayList1.contains(51));
        System.out.println(myArrayList1.search(9));*/
        //System.out.println(myArrayList1.size());
        //System.out.println(myArrayList1.getPos(10));
        myArrayList1.remove(123);
        myArrayList1.display();
        System.out.println();
        myArrayList1.remove(3);
        myArrayList1.display();
        myArrayList1.clear();
        System.out.println("claer");
        myArrayList1.display();
    }
}


