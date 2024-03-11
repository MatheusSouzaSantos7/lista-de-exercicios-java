import java.util.Scanner;

/**
 *Entrar via teclado com dois valores quaisquer "X" e "Y". Calcular e exibir o
calculo XY ("X" elevado a "Y"). Pesquisar as funcoes Exp e Ln.


 * author Leandro Felix e Matheus Angelo
 */

public class TP01Ex17  {
    public static void main(String[] args) {
        // Criacao de um objeto Scanner para entrada de dados pelo teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitacao e leitura dos valores de X e Y
        System.out.print("Digite o valor de X: ");
        double x = scanner.nextDouble();

        System.out.print("Digite o valor de Y: ");
        double y = scanner.nextDouble();

        // Fechamento do Scanner apos a leitura
        scanner.close();

        // Calculo de X elevado a Y
        double resultadoPotencia = Math.pow(x, y);

        // Calculo da exponenciacao de X
        double resultadoExp = Math.exp(x);

        // Calculo do logaritmo natural de X
        double resultadoLn = Math.log(x);

        // Exibicao dos resultados
        System.out.println("X elevado a Y: " + resultadoPotencia);
        System.out.println("Exponencial de X (exp(X)): " + resultadoExp);
        System.out.println("Logaritmo natural de X (ln(X)): " + resultadoLn);
    }
}
