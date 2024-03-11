/*
 * 8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
 * dois metros e que um quilômetro possui mil metros, fazer um programa para
 * converter milhas marítimas em quilômetros. 
 */

 /**
 * @author: Matheus Angelo de Souza Santos, CB3025489
 * @author: Leandro Felix
 */

// milhas marítmas = 1,852km

 import java.util.Scanner;

public class TP01Ex08 {
    public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
        double milhasMaritmas;
        double quilometros;
	
	System.out.println("Digite o valor em milhas maritmas: ");
	milhasMaritmas = ler.nextDouble();
	
	quilometros = milhasMaritmas / 0.539957;
	
	System.out.println("Valor em quilometros: " + quilometros);

    }
}
