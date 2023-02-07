package com.learning.DSA;

import java.util.*;

public class snakeAndLadder {
    int siz ;
    ArrayList<Integer> giveCoOrdinates(int square){
        ArrayList<Integer> coOrd = new ArrayList<>();
        int rw = (square -1 ) / 2 ;
        int cl = (square -1 ) % siz ;
        if(cl % 2 == 1){
            cl = siz -1 -cl;
        }
        coOrd.add(rw);
        coOrd.add(cl);

        return coOrd;

    }
    public int snakesAndLadders(int[][] board) {
        this.siz = board.length;
        int row = board.length;
        int col = board[0].length;
        Deque<ArrayList<Integer>> dq = new ArrayDeque<ArrayList<Integer>>();

        Collections.reverse(Arrays.asList(board));

        Set<Integer> visited = new HashSet<Integer>();

        while(!dq.isEmpty()){

            ArrayList<Integer> topElement = dq.poll();
            int currentSquare = topElement.get(0);
            int currentSteps = topElement.get(1);
            for(int i= 1  ; i  < 7 ;  i++){

                int nextSquare = currentSquare + i ;
                ArrayList<Integer> coOrd = giveCoOrdinates(nextSquare);
                if(board[coOrd.get(0)][coOrd.get(1)] != -1){
                    nextSquare = board[coOrd.get(0)][coOrd.get(1)];

                }
                if(nextSquare == row * col )
                    return currentSteps + 1 ;
                if(!visited.contains(nextSquare)){
                    visited.add(nextSquare);
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nextSquare);
                    temp.add(currentSteps + 1);
                    dq.add(temp);
                }
            }



        }

        return -1;





    }

}
