import java.util.Scanner;

/**
* A partir do diametro de um circulo que sera digitado, calcular e exibir sua area.
 * @author Leandro Felix e Matheus Angelo
 */


class TP01Ex10 {

    public static void main(String[] args) {

        Double grausCelsius;
        Double grausFahrenheit;
        Scanner scan = new Scanner(System.in);


        System.out.println("Informe a temperatura em graus Celsius");
        grausCelsius = scan.nextDouble();


        grausFahrenheit = ((grausCelsius * 1.8) + 32);
        System.out.println("A temperatura em graus Fahrenheit e " + grausFahrenheit);


    }

}
