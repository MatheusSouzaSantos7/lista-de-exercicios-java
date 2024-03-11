/*************************************************************************

15) Entrar via teclado com o valor da cotacao do dolar e uma certa quantidade de
dolares. Calcular e exibir o valor correspondente em Reais (R$).
@author Leandro Felix e Matheus Angelo

Leia a cotacao do dolar
Leia um valor em dolares
Converta esse valor para Real
Mostre o resultado
*************************************************************************/
import java.util.Scanner;

public class TP01Ex15  {

public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
double cotacao_dolar, valor_dolar,valor_real;

System.out.print("Conversor de dolar em real\n\n");


System.out.print("Digite a cotacao do dolar: ");
cotacao_dolar = entrada.nextDouble();


System.out.print("Digite o valor em dolar: ");
valor_dolar = entrada.nextDouble();


valor_real = cotacao_dolar * valor_dolar;


System.out.print("O Valor em reais e " + valor_real + "\n");
}

}
