package com.zerent.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TwoNumSum {
    public static void main(String[] args) {
        int[] nums={3,3};
        int target=6;
        int[] ints = twoSum(nums, target);
        System.out.println(ints[0]+"-"+ints[1]);

    }
    public static  int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap=new HashMap<Integer, Integer>();
            for(int i=0;i<nums.length;i++){
                if(hashMap.containsKey(target-nums[i])){
                    return new int[]{hashMap.get(target-nums[i]),i};
                }
                hashMap.put(nums[i],i);
            }
            return new int[2];
    }
}
