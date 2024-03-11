import java.util.Scanner;

/**
 * Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serao digitados.
 * @author Leandro Felix e Matheus Angelo
 */

public class TP01Ex12 {
    public static void main(String[] args) {
        // Criacao de um objeto Scanner para entrada de dados pelo teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitacao e leitura dos valores da altura e do raio da base do cone
        System.out.print("Digite a altura do cone: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o raio da base do cone: ");
        double raio = scanner.nextDouble();

        // Fechamento do Scanner apos a leitura
        scanner.close();

        // Calculo do volume do cone utilizando a formula V = (1/3) * 3,14 * raio^2 * altura
        double volume = (1.0 / 3.0) * Math.PI * raio * raio * altura;

        // Exibicao do resultado
        System.out.println("O volume do cone e: " + volume);
    }
}
