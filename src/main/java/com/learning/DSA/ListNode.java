package com.learning.DSA;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ListNode {
    int val ;
    ListNode next ;
    ListNode(){};
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val , ListNode next){
        this.val = val ;
        this.next = next ;
    }
}

class Solution{
    public int subarraysDivByK(int[] nums, int k) {
        int siz = nums.length;
        int[] prefixSum = new int[siz];
        HashMap<Integer,Integer > keep = new HashMap<Integer,Integer>();
        Integer sum = 0 ;
        int answer = 0 ;
        for(int i = 0 ; i < siz ; i++){
            sum += nums[i];
            sum %= k ;
            if(keep.containsKey(sum)){
                keep.put(sum , keep.get(sum)+1);
            }
            else{
                keep.put(sum , 0);
            }
            answer += keep.containsKey(k-sum) ? keep.get(k - sum) : 0 ;
        }
        return answer;
    }
}