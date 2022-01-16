package com.TestJavaSE;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-01-13
 */
class Person{
    //字段->成员变量
    private String name;

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

    private int age;
    //方法->行为
    public void eat(){
        System.out.println(name + "eat()");
    }
    public void sleep(){
        System.out.println("sleep()");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestClass {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("wuwuwu");
        person.setAge(18);
        //System.out.println(person.getName());
        System.out.println(person);
        person.eat();
    }
    public static void main1(String[] args) {
        System.out.println(6 ^ 4);
    }
}
