package com.Test0114;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-01-14
 */

class Person{
    private String name;
    private  int age;

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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    {
        System.out.println("实例代码块……");
    }
    static {
        System.out.println("静态代码块");
    }
    public Person(){
        this("zhangfei",18);
        System.out.println("person<>"+ this.name + this.age);
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        Person person = new Person();
        //person.setAge(29);
        //System.out.println(person.getAge());
    }
}
