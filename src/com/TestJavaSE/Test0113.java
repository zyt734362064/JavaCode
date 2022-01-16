package com.TestJavaSE;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-01-13
 */
class Student{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                '}';
    }

    public void eat(){
        System.out.println(this.name + "吃饭饭");
    }
    public void sleep(){
        System.out.println(this.name + "睡觉觉");
    }
}
public class Test0113 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("小明");
        stu.setAge(18);
        System.out.println(stu);
        stu.eat();
        stu.sleep();
    }
}
