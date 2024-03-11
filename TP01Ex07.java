// 7. Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.

 /**
 * @author: Matheus Angelo de Souza Santos, CB3025489
 * @author: Leandro Felix
 */

 import java.util.Scanner;

public class TP01Ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1;
        double n2;
        double mediaGeometrica;

        System.out.println("Escreva o numero 1: ");
        n1 = ler.nextDouble();

        System.out.println("Escreva o numero 2: ");
        n2 = ler.nextDouble();

        mediaGeometrica = Math.sqrt(n1 * n2);
        System.out.println("Media geometrica: " + mediaGeometrica);
    }
}
