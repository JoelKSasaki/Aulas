import java.util.Arrays;
import java.util.Scanner;
public class velha {
    public static void main(String[] args) {
        char [][] tab = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
        char p1 = 'X';
        char p2 = 'O';
        boolean ganhador = false;

        System.out.println("considerando:");
        for(int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.print("|" + tab[i][j] + "|");
            }
            System.out.println();
        }

        for (int i = 0; i < tab.length; i++)
        {
            Arrays.fill(tab[i], ' ');
        }

        mostrartab(tab);

        for(int z = 1;z <= 9;z++) {


            if(ganhador == true) {
                System.exit(0);
            }
            else {

                if (z % 2 == 0) {
                    moviment(p1, tab);
                    mostrartab(tab);
                    ganhador = checkvictoryp1(tab);
                }
                else {
                    moviment(p2, tab);
                    mostrartab(tab);
                    ganhador = checkvictoryp2(tab);
                }
            }

        }
    }
    public static void mostrartab(char[][] tabuleiro){
        for(int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.print("|" + tabuleiro[i][j] + "|");
            }
            System.out.println();
        }

    }
    public static void moviment(char j, char[][] table) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite a posição da sua peça: ");

        char pos = scan.nextLine().charAt(0);

        int row = (pos - 'A') / 3;
        int column = (pos - 'A') % 3;

        table[row][column] = j;

        System.out.println(row);
        System.out.println(column);
    }

    public static boolean checkvictoryp1(char[][] tabuleiro){

        //vertical
        for(int i=0;i<3;i++){
            if (tabuleiro[0][i] == 'X' && tabuleiro[1][i] == 'X' && tabuleiro[2][i] == 'X') {
                System.out.println("jogador 1 ganhou");
            }
        }

        //horizontal
        for(int i=0;i<3;i++){
            if (tabuleiro[i][0] == 'X' && tabuleiro[i][1] == 'X' && tabuleiro[i][2] == 'X') {
                System.out.println("jogador 1 ganhou");
            }
        }

        if (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') //diagonal principal
            System.out.println("jogador 1 ganhou");

        else if(tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X')  //diagonal secundária
            System.out.println("jogador 1 ganhou");

        return false;
    }
    public static boolean checkvictoryp2(char[][] tabuleiro){

        for(int i=0;i<3;i++){
            if (tabuleiro[0][i] == 'O' && tabuleiro[1][i] == 'O' && tabuleiro[2][i] == 'O'){
                System.out.println("jogador 2 ganhou");
            }
        }

        for(int i=0;i<3;i++){
            if (tabuleiro[i][0] == 'O' && tabuleiro[i][1] == 'O' && tabuleiro[i][2] == 'O') {
                System.out.println("jogador 2 ganhou");
            }
        }

        if (tabuleiro[0][0] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][2] == 'o') //diagonal principal
            System.out.println("jogador 2 ganhou");

        else if(tabuleiro[0][2] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][0] == 'o')  //diagonal secundária
            System.out.println("jogador 2 ganhou");

        return false;
    }
}



