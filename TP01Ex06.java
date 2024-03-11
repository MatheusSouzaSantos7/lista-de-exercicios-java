// 6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.

 /**
 * @author: Matheus Angelo de Souza Santos, CB3025489
 * @author: Leandro Felix
 */

import java.util.Scanner;
public class TP01Ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double n1;
        double n2;
        double n3;
        double n4;
        double mediaAritimetica;

        System.out.println("Escreva o valor 1: ");
        n1 = ler.nextDouble();

        System.out.println("Escreva o valor 2: ");
        n2 = ler.nextDouble();

        System.out.println("Escreva o valor 3: ");
        n3 = ler.nextDouble();

        System.out.println("Escreva o valor 4: ");
        n4 = ler.nextDouble();

        mediaAritimetica = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Media: " + mediaAritimetica);
    }
}
