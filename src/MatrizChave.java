import java.util.Arrays;

public class MatrizChave extends Matriz{
    int[][] chaveAleatoria = new int[ordemMatriz][ordemMatriz];

    public MatrizChave(){
        geraChaveAleatoria();
        System.out.println(Arrays.deepToString(chaveAleatoria));
    }

    private void geraChaveAleatoria() {
        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                int numeroAleatorio = (int) (Math.random() * 255) + 1;
                chaveAleatoria[i][j] = numeroAleatorio;
            }

        }
    }
}
