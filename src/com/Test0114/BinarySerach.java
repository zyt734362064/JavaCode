package com.Test0114;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-01-14
 */
public class BinarySerach {
/**
 * 二分法查找数字的下标
 */
    public static int binarySearch(int[] nums,int num){
        int left = 0;
        int right = nums.length;
        while (left <= right){
            int mid = left + ((right - left) / 2);
            if (nums[mid] < num){
                left = mid + 1;
            }else if (nums[mid] > num){
                right = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,32,55,76};
        System.out.println(binarySearch(array, 6));
    }
}
