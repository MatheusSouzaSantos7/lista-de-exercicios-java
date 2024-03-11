import java.util.Scanner;

/**
 *Entrar via teclado com o valor de um angulo em graus, calcular e exibir as
seguintes funcoes trigonometricas: seno, cosseno, tangente e secante deste angulo.
Lembre-se que uma funcao trigonometrica trabalha em radianos.
 * author Leandro Felix e Matheus Angelo
 */

public class TP01Ex16  {
    public static void main(String[] args) {
        // Criacao de um objeto Scanner para entrada de dados pelo teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitacao e leitura do valor do angulo em graus
        System.out.print("Digite o valor do angulo em graus: ");
        double anguloGraus = scanner.nextDouble();

        // Fechamento do Scanner apos a leitura
        scanner.close();

        // Conversao do angulo de graus para radianos
        double anguloRadianos = Math.toRadians(anguloGraus);

        // Calculo das funcoes trigonometricas
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);
        double secante = 1 / cosseno; // secante e o inverso do cosseno

        // Exibicao dos resultados
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);
    }
}
