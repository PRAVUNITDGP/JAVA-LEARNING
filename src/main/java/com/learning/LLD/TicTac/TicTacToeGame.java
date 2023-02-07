package com.learning.LLD.TicTac;

import com.learning.LLD.TicTac.Model.*;


import java.util.*;

public class TicTacToeGame {

    Deque<Player> players;
    Board playingBoard;

    TicTacToeGame(){
        initializeGame();
    }

    public void initializeGame(){
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1" , crossPiece);
        players.add(player1);
        PlayingPieceO noughtsPiece = new PlayingPieceO();
        Player player2 = new Player("Player2",noughtsPiece);
        players.add(player2);
        playingBoard = new Board(3);

    }

    public List<Integer> handleInput(Player playerTurn) throws Exception {
        int inputRow, inputColumn;
        System.out.print("Player:" + playerTurn.getName() + " Enter row,column: ");
        Scanner inputScanner = new Scanner(System.in);
        String s = inputScanner.nextLine();
        String[] values = s.split(",");
        inputRow = Integer.valueOf(values[0]);
        inputColumn = Integer.valueOf(values[1]);
        if(inputRow >= 0 && inputRow < playingBoard.size && inputColumn >=0 && inputColumn < playingBoard.size) {
            List<Integer> input = new ArrayList();
            input.add(inputRow);
            input.add(inputColumn);
            return input;
        }
        else{
            throw  new Exception("Ooops You went Out Of Boaundary....EnterAgain");
        }
    }

    public String startGame(){
        boolean isWinner = true;
        while(isWinner){

            Player playerTurn = players.removeFirst();
            playingBoard.printBoard();
            List<List<Integer>> freeSpaces = playingBoard.getFreeCells();
            if(freeSpaces.isEmpty()){
                isWinner = false;
                continue;
            }
            List<Integer> input = null;
            while(true){
                try {
                    input = handleInput(playerTurn);
                    break;
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
            boolean pieceAddedSuccessfully = playingBoard.addPiece(input.get(0),input.get(1), playerTurn.getPlayingPiece());
            if(!pieceAddedSuccessfully) {
                //player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(input.get(0),input.get(1), playerTurn.getPlayingPiece().type);
            if(winner) {
                playingBoard.printBoard();
                return playerTurn.getName();
            }


        }
        return "tie";
    }

    public boolean isThereWinner(int row , int column , PieceType pieceType){
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<playingBoard.size;i++) {

            if(playingBoard.board[row][i] == null || playingBoard.board[row][i].type != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<playingBoard.size;i++) {

            if(playingBoard.board[i][column] == null || playingBoard.board[i][column].type != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<playingBoard.size;i++,j++) {
            if (playingBoard.board[i][j] == null || playingBoard.board[i][j].type != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=playingBoard.size-1; i<playingBoard.size;i++,j--) {
            if (playingBoard.board[i][j] == null || playingBoard.board[i][j].type != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }




}
