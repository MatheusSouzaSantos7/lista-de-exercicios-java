// 5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.
// volume = (4 * pi * r^3) / 3

 /**
 * @author: Matheus Angelo de Souza Santos, CB3025489
 * @author: Leandro Felix
 */

import java.util.Scanner;

public class TP01Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double diametro;
        double raio;
        double volume;
        double pi = Math.PI;

        System.out.println("Digite o valor do diametro:");
        diametro = ler.nextDouble();
        raio = diametro / 2;

        volume = (4 * pi * Math.pow(raio, 3)) / 3;
        System.out.println("Valor do volume da esfera: " + volume);
    }
}
