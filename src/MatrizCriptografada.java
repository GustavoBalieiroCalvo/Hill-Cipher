public class MatrizCriptografada extends Matriz {
 int[][] matrizCriptografada = new int[ordemMatriz][ordemMatriz];
    private char[][] matrizCriptografadaAscii = new char[ordemMatriz][ordemMatriz];
    StringBuilder mensagemCriptografada = new StringBuilder();


    public MatrizCriptografada(int[][] matrizMensagem, int[][] matrizChave){
        geraChaveAleatoria(matrizMensagem, matrizChave);
        geraMatrizAleatoriaAscii(matrizCriptografada);
        geraMensagemCriptografada(matrizCriptografadaAscii);
    }

    private void geraChaveAleatoria(int[][] matrizMensagem, int[][] matrizChave) {
        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                int totalSoma = 0;
                for (int k = 0; k < ordemMatriz; k++) {

                    totalSoma += matrizMensagem[i][k] * matrizChave[k][j];
                }
                matrizCriptografada[i][j] = totalSoma % NUMERO_CARACTERES_ASCII + PRIMEIRO_CARACTER_VALIDO_ASCII;
            }
        }
    }

    private void geraMatrizAleatoriaAscii(int[][] matrizCriptografada) {
        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                matrizCriptografadaAscii[i][j] = (char) matrizCriptografada[i][j];
            }

        }
    }

    private void geraMensagemCriptografada(char[][]matrizCriptografadaAscii){

        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                char c = matrizCriptografadaAscii[i][j];
                mensagemCriptografada.append(c);
            }
        }


    }

    public StringBuilder getMensagemCriptografada() {
        return mensagemCriptografada;
    }
}