package com.Test0118;

import java.util.Arrays;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-01-18
 */
public class MyArrayList {
    private int[] elem;
    private int usersize;
    private final int capacity = 10;

    public MyArrayList(){
        this.usersize = 0;
        this.elem = new int[this.capacity];
    }

    public int[] getElem() {
        return elem;
    }

    public void setElem(int[] elem) {
        this.elem = elem;
    }

    public int getUsersize() {
        return usersize;
    }

    public void setUsersize(int usersize) {
        this.usersize = usersize;
    }

    public int getCapacity() {
        return capacity;
    }
    // 打印顺序表
    public void display() {
        for (int i = 0; i < usersize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (pos < 0 || pos > usersize + 1){
            throw new RuntimeException("pos位置不合法");
        }
        if (this.elem.length == this.usersize){
            this.elem = Arrays.copyOf(this.elem,2 * elem.length);
        }
        for (int i = usersize - 1; i >= pos ; i--) {
            elem[i + 1] = elem[i];
        }
        this.elem[pos] = data;
        usersize++;
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < usersize; i++) {
            if (toFind == this.elem[i]){
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usersize; i++) {
            if (toFind == this.elem[i]){
                return i;
            }
        }
        return -1;
    }

    /**
     * 检查 POS位置合法性
     */
    private void checkPos(int pos){
        if (pos < 0 ||pos >= usersize){
            throw new RuntimeException("pos位置不合法");
        }
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        checkPos(pos);
        return this.elem[pos];
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        checkPos(pos);
        this.elem[pos] = value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        if (!contains(toRemove)){
            System.out.println("该元素不存在");
            return;
        }
        int index = search(toRemove);
        for (int i = index; i < this.usersize; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usersize--;
    }
    // 获取顺序表长度
    public int size() {
        return this.usersize;
    }
    // 清空顺序表
    public void clear() {
        this.usersize = 0;
    }
}
