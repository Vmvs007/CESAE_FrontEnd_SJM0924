package FichaPratica01;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as Variáveis
        double num1, num2, soma, subtracao, multiplicacao, divisao;

        // Ler num1
        System.out.print("Insira um número: ");
        num1 = input.nextDouble();

        // Ler num2
        System.out.print("Insira outro número: ");
        num2 = input.nextDouble();

        // Calcular a soma
        soma = num1 + num2;

        // Calcular a subtracao
        subtracao = num1 - num2;

        // Calcular a multiplicação
        multiplicacao = num1 * num2;

        // Calcular a divisão
        divisao = num1 / num2;

        // Apresentar os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
