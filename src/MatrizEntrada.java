public class MatrizEntrada extends Matriz {
    char[][] matriz = new char[super.ordemMatriz][super.ordemMatriz];

    public MatrizEntrada(int ordemMatriz) {
        super.ordemMatriz = ordemMatriz;
    }
}