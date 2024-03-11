// 4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

 /**
 * @author: Matheus Angelo de Souza Santos, CB3025489
 * @author: Leandro Felix
 */

import java.util.Scanner;

public class TP01Ex04 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    double base;
    double altura;
    double area;

    System.out.println("Escreva a base do triangulo: ");
    base = ler.nextDouble();

    System.out.println("Escreva a altura do triangulo: ");
    altura = ler.nextDouble();
    area = (base * altura) / 2;

    System.out.println("Area do triangulo: " + area);
    }
}
