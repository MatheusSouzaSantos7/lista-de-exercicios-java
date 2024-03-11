import java.util.Scanner;

/**
* A partir do diametro de um circulo que sera digitado, calcular e exibir sua area.
 * @author Leandro Felix e Matheus Angelo
 */


public class TP01Ex11  {
    public static void main(String[] args) {
        // Criacao de um objeto Scanner para entrada de dados pelo teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitacao e leitura do diametro do circulo
        System.out.print("Digite o diametro do circulo: ");
        double diametro = scanner.nextDouble();

        // Fechamento do Scanner apos a leitura
        scanner.close();

        // Calculo do raio utilizando o diametro (raio = diametro / 2)
        double raio = diametro / 2.0;

        // Calculo da area do circulo utilizando a formula A = 3,14 * r^2
        double area = Math.PI * raio * raio;

        // Exibicao do resultado
        System.out.println("A area do circulo e: " + area);
    }
}
