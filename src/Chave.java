import java.util.Arrays;

public class Chave {
    int[] chaveAleatoria = new int[Matriz.ordemMatriz * Matriz.ordemMatriz];

    public Chave(){
        geraChaveAleatoria();
        System.out.println(Arrays.toString(chaveAleatoria));
    }

    private void geraChaveAleatoria() {
        for (int i = 0; i < Matriz.ordemMatriz * Matriz.ordemMatriz; i++) {
            int numeroAleatorio = (int) (Math.random() * 255) + 1;
            chaveAleatoria[i] = numeroAleatorio;
        }
    }
}
