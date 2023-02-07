package com.learning.DSA;

import java.util.Stack;

public class MaxRectangle {
    int N , M ;
    int[] nextSmallerHelper(int[] heights){
        int[] answer = new int[N];
        Stack<Integer> stk = new Stack<Integer>();
        for(int i = N-1 ; i >= 0 ; i--){

            while(!stk.empty() && heights[stk.peek()] >= heights[i]){
                stk.pop();
            }
            if(stk.empty()){
                answer[i] = N ;
            }
            else{
                answer[i] = stk.peek();
            }
            stk.push(i);
        }

        return answer ;
    }

    int[] prevSmallerHelper(int[] heights){
        int[] answer = new int[N];
        Stack<Integer> stk = new Stack<Integer>();
        for(int i = 0 ; i < N ; i++){

            while(!stk.empty() && heights[stk.peek()] >= heights[i]){
                stk.pop();
            }
            if(stk.empty()){
                answer[i] = - 1 ;
            }
            else{
                answer[i] = stk.peek();
            }
            stk.push(i);
        }

        return answer ;
    }


    public int maximalRectangle(char[][] matrix) {
        this.N = matrix[0].length;
        this.M = matrix.length;
        int answer = 0 ;
        int[] current = new int[N];
        for(int i= 0 ; i < N ; i++){
            if(matrix[0][i] == '1')
                current[i]= 1 ;
            else
                current[i] = 0 ;
        }

        for(int i = 1 ; i < M ; i++){

            for(int j =0 ; j < N ; j++){
                if(matrix[i][j] == '1'){
                    current[j] = current[j] + 1;
                }
                else
                    current[j] = 0 ;
            }
            int[] prevSmaller = prevSmallerHelper(current);
            int[] nextSmaller = nextSmallerHelper(current);

            for(int x=0 ; x < N ; x++){
                int temp = (nextSmaller[x] - prevSmaller[x] + 1) * current[x];
                answer = Math.max(answer,temp);
            }
        }
        return answer;

    }

}
