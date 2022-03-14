package com.Test0314.Demo3;

import java.math.BigInteger;

/**
 * Create with IntelliJ IDEA
 * Description:接口
 * User:Zyt
 * Date:2022-03-14
 */

class Animal {
    protected String name;
    public Animal(String name){
        this.name = name;
    }

}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
}

interface IFlying{
    void fly();
}

interface IRunning {
    void run();
}

interface ISwimming {
    void swimming();
}

class Bird extends Animal implements IFlying,IRunning{
    public Bird(String name){
        super(name);
    }

    @Override
    public void fly(){
        System.out.println(this.name + "正在飞!");
    }

    @Override
    public void run(){
        System.out.println(this.name + "跑起来!");
    }
}

class Frog extends Animal implements IRunning,ISwimming{
    public Frog(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在跑");
    }
    @Override
    public void swimming(){
        System.out.println(this.name + "游泳呢！");
    }
}

class Duck extends Animal implements IFlying,ISwimming,IRunning {
    public Duck(String name){
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name + "飞起来!");
    }

    @Override
    public void run() {
        System.out.println(this.name + "跑起来!");
    }

    @Override
    public void swimming() {
        System.out.println(this.name + "在游泳！");
    }
}
public class Test4 {

    public static void runFunc(IRunning iRunning){
        iRunning.run();
    }
    public static void swimmingFunc(ISwimming iSwimming){
        iSwimming.swimming();
    }

    public static void flyFunc(IFlying iFlying){
        iFlying.fly();
    }

    public static void main(String[] args) {
        //swimmingFunc(new Duck("唐老鸭"));
        //swimmingFunc(new Frog("小跳蛙"));

        flyFunc(new Bird("家雀"));

    }
}
