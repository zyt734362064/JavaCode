package com.Test0314.Demo3;


/**
 * Create with IntelliJ IDEA
 * Description:接口
 * User:Zyt
 * Date:2022-03-14
 */

interface  IShape{

    public abstract void draw();
    default public void func(){
        System.out.println("func()");
    }
}
class Rect implements IShape {

    @Override
    public void draw(){
        System.out.println("♦");
    }
}


class Flower implements IShape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}

class Cycle implements IShape {
    @Override
    public void draw(){
        System.out.println("○");
    }
}
public class Test {
    public static void drawMap(IShape iShape){
        iShape.draw();
    }

    public static void main(String[] args) {
        IShape iShape = new Cycle();
        Rect rect = new Rect();
        Flower flower = new Flower();
        iShape.draw();
        drawMap(rect);
        drawMap(flower);
    }
}
