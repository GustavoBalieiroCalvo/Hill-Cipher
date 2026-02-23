public class MatrizMensagem extends Matriz {
    char[][] matrizMensagem;
    String entrada;

    public MatrizMensagem(String entrada) {
        this.entrada = entrada;
        ordemMatriz = 1;
        while (ordemMatriz * ordemMatriz < entrada.length()) {
            ordemMatriz++;
        }
        this.matrizMensagem = new char[ordemMatriz][ordemMatriz];
        geraMatrizMensagem();
    }

    private void geraMatrizMensagem() {
        int caracterNoString = 0;
        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                if (caracterNoString < entrada.length()) {
                    matrizMensagem[i][j] = entrada.charAt(caracterNoString);

                } else {
                    matrizMensagem[i][j] = '*';
                }
                caracterNoString++;
            }

        }
    }

    void imprimeMatriz() {
        for (int i = 0; i < ordemMatriz ; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                System.out.print(" | " + matrizMensagem[i][j]);
            }
            System.out.print(" |");
            System.out.println();
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }
}