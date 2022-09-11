package ödev46.mayin_tarlasi_oyunu;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("===============================");
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz ! ");
        System.out.println("===============================\n");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz... ");
        Scanner input = new Scanner (System.in);

        System.out.print("Satır Sayısı : ");
        int row = input.nextInt();
        System.out.print("Sütun Sayısı : ");
        int col = input.nextInt();

        MineSweeper mine = new MineSweeper(row, col);

        mine.run();

    }
    
}