import java.util.Scanner;

/**
 * Calcular e exibir o volume livre de um ambiente que contem uma esfera de raio
 "r" inscrita em um cubo perfeito de aresta "a". Os valores de "r" e "a" serao
 digitados.
 *
 * author Leandro Felix e Matheus Angelo
 */

public class TP01Ex14  {
    public static void main(String[] args) {
        // Criacao de um objeto Scanner para entrada de dados pelo teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitacao e leitura dos valores do raio da esfera e da aresta do cubo
        System.out.print("Digite o raio da esfera (r): ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a aresta do cubo (a): ");
        double aresta = scanner.nextDouble();

        // Fechamento do Scanner apos a leitura
        scanner.close();

        // Calculo do volume do cubo
        double volumeCubo = aresta * aresta * aresta;

        // Calculo do volume da esfera
        double volumeEsfera = (4.0 / 3.0) * Math.PI * raio * raio * raio;

        // Calculo do volume livre (volume do cubo - volume da esfera)
        double volumeLivre = volumeCubo - volumeEsfera;

        // Exibicao do resultado
        System.out.println("O volume livre do ambiente e: " + volumeLivre);
    }
}
