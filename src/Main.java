import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Digíte a mensagem: ");
        String entrada = sc.nextLine();

        MatrizMensagem matrizMensagem = new MatrizMensagem(entrada);

        System.out.println("Ordem da matriz: " + Matriz.ordemMatriz);

        matrizMensagem.imprimeMatriz();

        MatrizDecimal matrizDecimal = new MatrizDecimal(matrizMensagem.matrizMensagem);

        matrizDecimal.imprimeMatriz();

        MatrizChave matrizChave = new MatrizChave();

        var matrizCriptografada = new MatrizCriptografada(matrizDecimal.matrizDecimal, matrizChave.chaveAleatoria);

        System.out.println(Arrays.deepToString(matrizCriptografada.matrizCriptografada));
//        System.out.println(Arrays.deepToString(matrizCriptografada.getMatrizCriptografadaAscii));
        System.out.println(matrizCriptografada.getMensagemCriptografada());
    }
}
