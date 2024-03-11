// 1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
 /**
 * @author: Matheus Angelo de Souza Santos, CB3025489
 * @author: Leandro Felix
 */

import java.util.Scanner; // Para Imput de informações

public class TP01Ex01{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva a base do triângulo:");
        double base = ler.nextDouble();

        System.out.println("Escreva a altura do triângulo:");
        double altura = ler.nextDouble();
        double area = base * altura / 2;
        System.out.println("Area do triangulo: " + area);
    }
}