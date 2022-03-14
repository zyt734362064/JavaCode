package com.Test0314.Demo3;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Create with IntelliJ IDEA
 * Description:接口
 * User:Zyt
 * Date:2022-03-14
 */
interface IA {
    public final int A = 10;

    public void funcA();
}

interface IB{
    public void funcB();
}

class AClass implements IA,IB{
    @Override
    public void funcA() {
        System.out.println("A::funcA()");
        System.out.println(A);
    }

    @Override
    public void funcB() {
        System.out.println("A::funcB");
    }
}

public class Test2 {

}
