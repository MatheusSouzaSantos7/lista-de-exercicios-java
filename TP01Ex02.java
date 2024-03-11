// 2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.

/**
 * @author: Matheus Angelo de Souza Santos, CB3025489
 * @author: Leandro Felix
 */

import java.util.Scanner;

public class TP01Ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double quadrado;
        double area;

        System.out.println("Escreva o lado do quadrado: ");
        quadrado = ler.nextDouble();
        area = quadrado * quadrado;
        System.out.println("Area do quadrado: " + area);
    }
}
