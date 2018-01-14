package cn.chenwj.leetcode;

import org.junit.Test;

import java.util.stream.Stream;

/**
 * @author chen weijie
 * @date 2018-01-15 1:14 AM
 */
public class TwoSum {


    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * <p>
     * 给定一个数组,返回两个数加起来等于给定元素的索引.你要保证任何输入有确切的结果,而且你可以使用同一个元素两次.
     * Given nums = [2, 7, 11, 15], target = 9,
     * <p>
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == target - nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("no two sum solution");
    }


    @Test
    public void test() {
        int[] input = new int[]{4, 7, 1, 3, 6, 5};
        int[] array = twoSum(input, 10);
        System.out.print("result:");
        for (int i : array) {
            System.out.print(i+",");
        }
    }



}
