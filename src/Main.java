import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();

        MatrizMensagem matrizMensagem = new MatrizMensagem(entrada);

        System.out.println("Ordem da matriz: " + Matriz.ordemMatriz);

        matrizMensagem.imprimeMatriz();

        MatrizDecimal matrizDecimal = new MatrizDecimal(matrizMensagem.matrizMensagem);

        matrizDecimal.imprimeMatriz();

//        int[][] matrizChave = geraMatrizChave(ordemMatriz);
//
//    }
//
//    static void subsituiVazio(char[][] matriz, int ordemMatriz){
//        for (int i = 0; i < ordemMatriz; i++) {
//            for (int j = 0; j < ordemMatriz; j++) {
//                if (matriz[i][j] == ' ' || matriz[i][j] == '\u0000') {
//                    matriz[i][j] = '*';
//                }
//            }
//        }
//    }

//    static int[][] geraMatrizAscii(char[][] matriz, int ordemMatriz) {
//        int[][] matrizAscii = new int[ordemMatriz][ordemMatriz];
//        for (int i = 0; i < ordemMatriz; i++) {
//            for (int j = 0; j < ordemMatriz; j++) {
//                int ascii = matriz[i][j];
//                matrizAscii[i][j] = ascii;
//            }
//
//        }
//        return matrizAscii;
//    }
//
//    static int[][] geraMatrizChave(int ordemMatriz) {
//        int[][] matrizChave = new int[ordemMatriz][ordemMatriz];
//        for (int i = 0; i < ordemMatriz; i++) {
//            for (int j = 0; j < ordemMatriz; j++) {
//                int numeroAleatorio = (int) (Math.random() * 100) + 1;
//                matrizChave[i][j] = numeroAleatorio;
//            }
//        }
//        return matrizChave;
    }
}
