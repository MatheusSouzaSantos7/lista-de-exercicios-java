/*
 * 9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
 * valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
 */

 /**
 * @author: Matheus Angelo de Souza Santos, CB3025489
 * @author: Leandro Felix
 */

// resistenciaEletrica * correnteEletrica = tensaoEletrica

 import java.util.Scanner;

public class TP01Ex08 {
    public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

	double resistenciaEletrica;
	double correnteEletrica;
	double tensaoEletrica;

	System.out.println("Digite a resistencia Eletrica: ");
	resistenciaEletrica = ler.nextDouble();
	
	System.out.println("Digite a corrente eletrica: ");
	correnteEletrica = ler.nextDouble();

	tensaoEletrica = resistenciaEletrica * correnteEletrica;

	System.out.println("Valor da corrente eletrica: " + tensaoEletrica);
    }
}