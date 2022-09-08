/*ÖDEV 43:
Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.
Örneğin 2x3’lik A matrisinin transpozu (devriği), 3x2’lik bir A^T matrisidir.
 */

package ödev43;
import java.util.Scanner;
public class matrisTranspozu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Oluşturulacak satır sayısını girin : ");
        int row = input.nextInt();
        System.out.print("Oluşturulacak sütun sayısını girin : ");
        int col = input.nextInt();

        int[][] matris = new int[row][col];
        int[][] transpoze = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print((i+1)+"x"+(j+1)+" : ");
                matris[i][j] = input.nextInt();
                transpoze[j][i] = matris[i][j];
            }
        }

        System.out.println("\nOluşturulan Matris : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matris[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("\nMatrisin devriği yani Transpozu : ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpoze[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
