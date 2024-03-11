// 3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.
/*
 * Precisamos primeiramente encontrar a fórmula direta para que possamos calcular a área pela diagonal.
 * Começaremos o cálculo a partir do teorema de Pitágoras:
 * 
 * s^2 + s^2 = d^2
 * s = cateto. d = diagonal. a = area
 * 
 * Vamos começar a manipular a fórmula
 * 2s^2 = d^2
 * s^2 = d^2/2
 * 
 * Se a = s^2, então
 * a = d^2/2
 * 
 * area = (diagonal * diagonal) / 2
 */

 /**
 * @author: Matheus Angelo de Souza Santos, CB3025489
 * @author: Leandro Felix
 */

import java.util.Scanner;

public class TP01Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double diagonal;
        double area;

        System.out.println("Escreva a diagonal do quadrado: ");
        diagonal = ler.nextDouble();
        area = Math.pow(diagonal, 2) / 2;
        System.out.println("Valor da area: " + area);
    }
}