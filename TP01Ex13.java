import java.util.Scanner;

/**
 *Calcular e exibir a velocidade final (em km/h) de um automovel, a partir dos
valores da velocidade inicial (em m/s), da aceleracao (m/s2) e do tempo de percurso
(em s) que serao digitados.
 * author Leandro Felix e Matheus Angelo
 */

public class TP01Ex13 {
    public static void main(String[] args) {
        // Criacao de um objeto Scanner para entrada de dados pelo teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitacao e leitura dos valores da velocidade inicial, aceleracao e tempo de percurso
        System.out.print("Digite a velocidade inicial (m/s): ");
        double velocidadeInicial = scanner.nextDouble();

        System.out.print("Digite a aceleracao (m/s^2): ");
        double aceleracao = scanner.nextDouble();

        System.out.print("Digite o tempo de percurso (s): ");
        double tempo = scanner.nextDouble();

        // Fechamento do Scanner apos a leitura
        scanner.close();

        // Calculo da velocidade final utilizando a formula: vf = vi + (a * t)
        double velocidadeFinal = velocidadeInicial + (aceleracao * tempo);

        // Convertendo a velocidade final de m/s para km/h
        velocidadeFinal *= 3.6;

        // Exibicao do resultado
        System.out.println("A velocidade final do automovel e: " + velocidadeFinal + " km/h");
    }
}
