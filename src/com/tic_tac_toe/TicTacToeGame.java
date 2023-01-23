package com.tic_tac_toe;

class TicTacToe {
    char[][] board;

    public TicTacToe() {
        board = new char[3][3];
        createBoard();
    }

    void createBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    void dispBoard() {
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}

public class TicTacToeGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Game TicTacToe");
        TicTacToe obj = new TicTacToe();
        obj.dispBoard();
    }

}
