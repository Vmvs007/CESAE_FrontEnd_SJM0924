package FichaPratica02;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as Variáveis
        double num1, num2, resultado;
        String operacao;

        // Ler numeros
        System.out.print("Insira o num1: ");
        num1 = input.nextDouble();

        System.out.print("Insira o num2: ");
        num2 = input.nextDouble();

        // Ler operacao
        System.out.print("Operação desejada ( + - * / ): ");
        operacao = input.next();

        switch (operacao) {
            case "+": // Soma
                resultado = num1 + num2;
                System.out.println("Soma: " + resultado);
                break;

            case "-": // Subtração
                resultado = num1 - num2;
                System.out.println("Subtração: " + resultado);
                break;

            case "*": // Multiplicação
                resultado = num1 * num2;
                System.out.println("Multiplicação: " + resultado);
                break;

            case "/": // Divisão
                resultado = num1 / num2;
                System.out.println("Divisão: " + resultado);
                break;

            default:
                System.out.println("Operação Inválida");
                break;
        }

    }
}
