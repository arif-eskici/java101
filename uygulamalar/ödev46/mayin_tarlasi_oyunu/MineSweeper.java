package ödev46.mayin_tarlasi_oyunu;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class MineSweeper {

    Scanner input = new Scanner (System.in);
    Random random = new Random();

    int row, col, size;
    String [][] map;
    String [][] board;
    int mineNumber;
    int selectRow, selectCol, closedBox, otherMine;

    MineSweeper (int row, int col) {
        this.row = row;
        this.col = col;
        this.map = new String [row][col];
        this.board = new String [row][col];
        this.size = row * col;
    }

    public void map () {
        mineNumber = size / 4;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map [i].length; j++) {
                map[i][j] = "-  ";
            }
        } 
        while (mineNumber > 0) {
            int rowNumber = random.nextInt(row);
            int colNumber = random.nextInt(col);
            if (map[rowNumber][colNumber] != "*  ") {
                map[rowNumber][colNumber] = "*  ";
                mineNumber -= 1;
            }
        }
        System.out.println("\nOyunun haritası şu şekildedir : \n");
        mapWrite();
        
    }

    public void mapWrite () {
        for (String []i : map) {
            for (String j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void board () {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board [i][j] = "-  ";
            }
        }
    }

    public void boardWrite () {
        for (String [] i : board) {
            for (String j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void game () {
        if (winKontrol()) {
            System.out.println("==========================");
            System.out.println("You Win !!!");
            boardWrite();
            System.out.println("==========================\n");
        } else {
            System.out.println("==========================");
            boardWrite();
            System.out.print("Satır sayısını girin : ");
            selectRow = input.nextInt()-1;
            System.out.print("Sütun sayısını girin : ");
            selectCol = input.nextInt()-1;

            if (selectRow > row || selectCol > col ) {
                System.out.println("Yaptığınız seçim aralık dışındadır! Lütfen tekrar deneyin...");
                game();
            } else {
                karsilastir ();
            }
        }
    }

    public boolean winKontrol () {
        closedBox = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == "-  ") {
                    if (map[i][j] != "*  ") {
                        closedBox += 1;
                    }
                }
            }
        }
        if (closedBox == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void karsilastir () {
        otherMine = 0;
        if (map[selectRow][selectCol] == "*  ") {
            System.out.println("==========================");
            System.out.println("Game Over!!!");
            mapWrite();
            System.out.println("==========================\n");
        } else {
            for (int i = selectRow-1; i <= selectRow+1; i++) {
                for (int j = selectCol-1; j <= selectCol+1; j++) {
                    try {
                        if (map [i][j] == "*  ") {
                            otherMine += 1;
                        }
                    } catch (Exception e) {

                    }
                }
            }
            board [selectRow][selectCol] = String.valueOf(otherMine) + "  ";
            game();
        }
    }

    public void run () {
        map ();
        board ();
        game ();

    }
}

