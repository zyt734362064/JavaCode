package com.TestJavaSE;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-01-11
 */
public class TestJumpFloor {
    public static void main(String[] args) {
        System.out.println(JumpFloor(4));
    }

    /**
     * 青蛙跳台阶
     * @param target
     * @return
     */
    public static int JumpFloor(int target){
        if (target == 1){
            return 1;
        }else if (target == 2){
            return 2;
        }else {
            return JumpFloor(target - 1) +JumpFloor(target - 2);
        }
    }


}
