import java.util.Scanner;

/**
 *Entrar via teclado com o valor de cinco produtos. Apos as entradas, digitar um
valor referente ao pagamento da somatoria destes valores. Calcular e exibir o troco
que devera ser devolvido.


 * author Leandro Felix e Matheus Angelo
 */

public class TP01Ex18  {
    public static void main(String[] args) {
        // Criacao de um objeto Scanner para entrada de dados pelo teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitacao e leitura dos valores dos cinco produtos
        double totalProdutos = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o valor do produto " + i + ": ");
            double valorProduto = scanner.nextDouble();
            totalProdutos += valorProduto;
        }

        // Solicitacao e leitura do valor do pagamento
        System.out.print("Digite o valor do pagamento: ");
        double pagamento = scanner.nextDouble();

        // Fechamento do Scanner apos a leitura
        scanner.close();

        // Calculo do troco
        double troco = pagamento - totalProdutos;

        // Exibicao do troco
        System.out.println("O troco a ser devolvido e: " + troco);
    }
}
