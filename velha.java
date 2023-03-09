import java.util.Arrays;
public class velha {
    public static void main(String[] args) {
        int [][] tabuleiro = new int [3][3];
        char p1[10];
        char p2[10];

        for (int i = 0; i < tabuleiro.length; i++)
        {
            Arrays.fill(tabuleiro[i], '.');
        }

        for(int i=0;i<3;i++)
        {
            for (int j = 0;j < 3;j++) {
                System.out.print(tabuleiro[i][j]);
            }
            System.out.println();
        }
        moviment(p1, p2);

    }

    public static void moviment(int j1, int j2){
        int x;
        int y;
        int i;
        int j;

        for(int x=0;x<9;x++){
            for (int i = 0; i < tabuleiro.length; i++)
            {
                Arrays.fill(tabuleiro[i], 'o');

                for(int i=0;i<3;i++)
                {
                    for (int j = 0;j < 3;j++) {
                        System.out.print(tabuleiro[i][j]);
                    }
                }
            }
        }
    }
}


