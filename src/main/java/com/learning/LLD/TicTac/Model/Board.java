package com.learning.LLD.TicTac.Model;


import java.util.ArrayList;
import java.util.List;

public class Board {

    public int size ;
    public PlayingPiece[][] board ;
    public Board(int size){
        this.size = size ;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row , int col , PlayingPiece playingPiece){
        System.out.println(row + " " +  col);
       if(board[row][col] != null)
           return false;
       board[row][col] = playingPiece;
       return true;
    }

    public List<List<Integer>> getFreeCells(){
        List<List<Integer>> freeCells = new ArrayList<>() ;
        for(int i=0 ; i < size ; i++){
            for(int j=0 ; j < size ;j++){
                if(board[i][j] == null){
                    List<Integer> availableSlot = new ArrayList<>();
                    availableSlot.add(i);
                    availableSlot.add(j);
                    freeCells.add(availableSlot);
                }
            }
        }
        return freeCells;
    }

    public void printBoard(){
        for(int i=0 ; i < size ; i++){
            for(int j=0 ; j < size ; j++){
                System.out.print(" | ");
                if(board[i][j] != null){
                    System.out.print(board[i][j].type.name() + "  ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }



}
