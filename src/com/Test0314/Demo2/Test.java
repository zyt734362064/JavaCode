package com.Test0314.Demo2;

/**
 * Create with IntelliJ IDEA
 * Description:抽象类
 * User:Zyt
 * Date:2022-03-14
 */

abstract class  Shape {
    String name ;
    public abstract void draw();//抽象方法
}


class Rect extends Shape {

    @Override
    public void draw(){
        System.out.println("♦");
    }
}


class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}

class Cycle extends Shape {
    @Override
    public void draw(){
        System.out.println("○");
    }
}
public class Test {
    public static void drawMap(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape = new Rect();
        drawMap(shape);
        Cycle cycle = new Cycle();
        drawMap(cycle);
    }
}
