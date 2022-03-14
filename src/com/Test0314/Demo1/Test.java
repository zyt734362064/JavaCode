package com.Test0314.Demo1;

/**
 * Create with IntelliJ IDEA
 * Description:多态
 * User:Zyt
 * Date:2022-03-14
 */

class Shape {
    public void draw(){
        System.out.println("Shape::draw()");
    }
}


class Rect extends Shape {

    @Override
    public void draw(){
        System.out.println("♦");
    }
}


class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("❀");
    }
}

class Cycle extends Shape{
    @Override
    public void draw(){
        System.out.println("○");
    }
}
public class Test {

    public static void main(String[] args) {

        Rect rect = new Rect();
        Flower flower = new Flower();
        Cycle cycle = new Cycle();

        Shape[] shapes = {cycle,rect,cycle,rect,flower};
        for (Shape shape:shapes
             ) {
            shape.draw();
        }
    }

    public static void main1(String[] args) {
        Shape shape = new Rect();
        shape.draw();
        Shape shape1 = new Flower();
        shape1.draw();
    }
}
