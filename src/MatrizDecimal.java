public class MatrizDecimal extends Matriz {

    int[][] matrizDecimal = new int[ordemMatriz][ordemMatriz];

    public MatrizDecimal(char[][] matrizMensagem) {
        geraMatrizDecimal(matrizMensagem);
    }


    private void geraMatrizDecimal(char[][] matriz) {
        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                int ascii = matriz[i][j];
                matrizDecimal[i][j] = ascii;
            }

        }
    }
    void imprimeMatriz() {
        for (int i = 0; i < ordemMatriz ; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                System.out.print(" | " + matrizDecimal[i][j]);
            }
            System.out.print(" |");
            System.out.println();
        }
    }
}