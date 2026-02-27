public class MatrizCriptografada extends Matriz {
    int[] chaveAleatoria = new int[ordemMatriz];



    private void geraChaveAleatoria() {
        for (int i = 0; i < ordemMatriz * ordemMatriz; i++) {
            int numeroAleatorio = (int) (Math.random() * 255) + 1;
            chaveAleatoria[i] = numeroAleatorio;
        }
    }
}