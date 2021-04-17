package com.practice.sudoku;

import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {
    public static void main(String args[]){
        char[][] board =
                {{'.','.','4','.','.','.','6','3','.'},
                 {'.','.','.','.','.','.','.','.','.'},
                 {'5','.','.','.','.','.','.','9','.'},
                 {'.','.','.','5','6','.','.','.','.'},
                 {'4','.','3','.','.','.','.','.','1'},
                 {'.','.','.','7','.','.','.','.','.'},
                 {'.','.','.','5','.','.','.','.','.'},
                 {'.','.','.','.','.','.','.','.','.'},
                 {'.','.','.','.','.','.','.','.','.'}};


        ValidSudoku vs = new ValidSudoku();
            System.out.print(vs.isValidSudoku(board));
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                     if(!(isValidRow(board,i) && isValidColumn(board,j) &&
                            isValidBox(board,i-i%3,j-j%3))){
                        return  false;
                }
            }
        }
        return true;
    }
    public boolean isValidRow(char[][] board,int row){
        HashSet<Character> hs = new HashSet<Character>();
        for(int i=0;i<9;i++){
            System.out.print(board[row][i]);
            if(hs.contains(board[row][i])){
              return  false;
            }
            if(board[row][i] != '.'){
                hs.add(board[row][i]);
            }
        }
        System.out.println();
        return true;
    }
    public boolean isValidColumn(char[][] board,int column){
        HashSet<Character> hs = new HashSet<Character>();
        for(int i=0;i<9;i++){
            System.out.print(board[i][column]);
            if(hs.contains(board[i][column])){
                return false;
            }
            if(board[i][column] != '.'){
                hs.add(board[i][column]);
            }

        }
        System.out.println();
        return true;
    }
    public boolean isValidBox(char[][] board,int row,int column){
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[row+i][column+j]);
                if(hs.contains(board[row+i][column+j])){
                    return false;
                }
                if(board[row+i][column+j] != '.'){
                    hs.add(board[row+i][column+j]);
                }
            }
        }
        System.out.println();
        return true;
    }
}
