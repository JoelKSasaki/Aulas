import java.util.Arrays;
import java.util.Scanner;
public class velha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char [][] tab = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
        char p1 = 'X';
        char p2 = 'O';

        System.out.println("considerando:");
        for(int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }

        mostrartab(tab);
        moviment(p1, tab);
        moviment(p2, tab);
    }
    public static void mostrartab(char[][] tabuleiro){

        for (int i = 0; i < tabuleiro.length; i++)
        {
            Arrays.fill(tabuleiro[i], ' ');
        }

        for(int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.print("|  |");
            }
            System.out.println();
        }

    }
    public static void moviment(char j, char[][] table) {
        int x = 0;
        int y = 0;
        boolean winner = false;

        while(winner == false) {
            table[x][y] = j;
            System.out.println("Digite aonde deseja jogar: ");
            for (x = 0; x < 3; x++) {
                for (y = 0; y < 3; y++) {
                    System.out.print(table[x][y] + j);
                }
            }
        }
    }

    public static boolean tie(){
        return false;
    }
}



