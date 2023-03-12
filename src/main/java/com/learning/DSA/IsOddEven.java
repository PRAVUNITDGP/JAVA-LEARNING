package com.learning.DSA;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class IsOddEven {
    /*
           -> odd Indexed => even Integers in increasing Order
           -> even Indexed => odd Integers in Decreasing Order
    */
    public boolean isValid(ArrayList<Integer> values , Boolean isLevel){
        if(isLevel){
            for(int i=0 ; i < values.size() ; i++){
                if(values.get(i) % 2 == 0)
                    return false;
                if(i ==0 )
                    continue;
                if(values.get(i) <=  values.get(i-1))
                    return false;
            }
            return true;
        }
        if(!isLevel){
            for(int i=0 ; i < values.size() ; i++){
                if(values.get(i) % 2 == 1)
                    return false;
                if(i ==0 )
                    continue;
                if(values.get(i) >=  values.get(i-1))
                    return false;
            }
            return true;
        }
        return true;
    }
    public boolean isEvenOddTree(TreeNode root){
        if(root == null)
            return true;
        Deque<TreeNode> dq = new LinkedList<>() ;
        if(!((root.val & 1) == 1))
            return false;
        dq.addLast(root);
        int siz = 1  ;
        Boolean isEvenLevel = false;
        while(dq.size() > 0){
            isEvenLevel = !isEvenLevel;
            siz = dq.size();
            ArrayList<Integer> keep = new ArrayList<Integer>();
            for(int i=0 ; i < siz ; i++){
                TreeNode top = dq.getFirst();
                dq.pop();
                if(top.left != null){
                    dq.addLast(top.left);
                    keep.add(top.val);
                }
                if(top.right != null){
                    dq.addLast(top.right);
                    keep.add(top.val);
                }
            }
            if(!isValid(keep,isEvenLevel))
                return false;

        }
        return true;
    }
}
