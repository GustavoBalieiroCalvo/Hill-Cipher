public class MatrizCriptografada extends Matriz {
    int[][] matrizAleatoria;



    private void geraMatrizAleatoria() {
        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                int numeroAleatorio = (int) (Math.random() * 255) + 1;
                matrizAleatoria[i][j] = numeroAleatorio;
            }
        }
    }
}