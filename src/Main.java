import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String codigo = sc.nextLine();

        int numeroCaracteresCodigo = codigo.length();
        int ordemMatriz = 1;
        while (ordemMatriz * ordemMatriz < numeroCaracteresCodigo) {
            ordemMatriz++;
        }


        System.out.println(ordemMatriz);

        char[][] matriz = new char[ordemMatriz][ordemMatriz];
        int caracterNoString = 0;
        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                if (caracterNoString < numeroCaracteresCodigo) {
                    matriz[i][j] = codigo.charAt(caracterNoString);
                    caracterNoString++;
                } else {
                    matriz[i][j] = '*';
                }
            }

        }
//        System.out.println(Arrays.deepToString(matriz));
        subsituiVazio(matriz, ordemMatriz);
//        System.out.println(Arrays.deepToString(matriz));
        System.out.println();
        imprimeMatriz(matriz, ordemMatriz);
        int[][] matrizAscii = geraMatrizAscii(matriz, ordemMatriz);
        System.out.println(Arrays.deepToString(matrizAscii));

        int[][] matrizChave = geraMatrizChave(ordemMatriz);

        System.out.println(Arrays.deepToString(matrizChave));
    }

    static void subsituiVazio(char[][] matriz, int ordemMatriz){
        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                if (matriz[i][j] == ' ' || matriz[i][j] == '\u0000') {
                    matriz[i][j] = '*';
                }
            }
        }
    }
    static void imprimeMatriz(char[][] matriz, int ordemMatriz) {
        for (int i = 0; i < ordemMatriz ; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                System.out.print(" | " + matriz[i][j]);
            }
            System.out.print(" |");
            System.out.println();
        }
    }
    static int[][] geraMatrizAscii(char[][] matriz, int ordemMatriz) {
        int[][] matrizAscii = new int[ordemMatriz][ordemMatriz];
        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                int ascii = matriz[i][j];
                matrizAscii[i][j] = ascii;
            }

        }
        return matrizAscii;
    }

    static int[][] geraMatrizChave(int ordemMatriz) {
        int[][] matrizChave = new int[ordemMatriz][ordemMatriz];
        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                int numeroAleatorio = (int) (Math.random() * 100) + 1;
                matrizChave[i][j] = numeroAleatorio;
            }
        }
        return matrizChave;
    }
}
