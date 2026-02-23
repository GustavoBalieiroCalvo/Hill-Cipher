public class MatrizMensagem extends Matriz {
    char[][] matriz = new char[super.ordemMatriz][super.ordemMatriz];

    public MatrizMensagem(int ordemMatriz) {
        super.ordemMatriz = ordemMatriz;
    }
}