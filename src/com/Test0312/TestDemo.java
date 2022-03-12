package com.Test0312;


import java.util.Date;

/**
 * Create with IntelliJ IDEA
 * Description:继承
 * User:Zyt
 * Date:2022-03-12
 */
class Animal {
    public String name = "666";
    public int age;

    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println(name + "eat()");
    }
}

class Dog extends Animal {
    public Dog(String name,int age){
        super(name,age);//显示调用方法
    }


    @Override
    public void eat(){
        System.out.println(name + "狼吞虎咽");
    }
}

class Bird extends Animal {
    public String wing;
    public String name = "666666";
    public Bird(String name,int age,String wing){
        super(name,age);
        this.wing = wing;
    }



    public void fly(){
        System.out.println(name + "fly()" + wing);
    }
}

public class TestDemo {

    public static void func(Animal animal){

    }
    //返回值向上转型
    public Animal func2(){
        Dog dog = new Dog("huhu",8);
        return dog;
    }

    public static void main(String[] args) {
        Animal animal = new Dog("hhh",3);
        animal.eat();
        Animal animal2 = new Bird("3",1,"想要飞");
        Bird bird = new Bird("3",1,"想要飞");
        bird.eat();
        ((Bird) animal2).fly();

    }
    public static void main2(String[] args) {
        /*Dog dog = new Dog("haha",9);
        Animal animal = dog;*/

        //向上转型
        Animal animal = new Dog("huahua",9);

        //传参向上转型
        Dog dog = new Dog("xiaohua",8);
        func(dog);

    }
    public static void main1(String[] args) {
        Dog dog = new Dog("facai",3);
        System.out.println(dog.name);
        dog.eat();
        Bird bird = new Bird("green",2,"飞呀飞呀");
        bird.name = "hhh";
        bird.fly();
        bird.eat();
    }
}
