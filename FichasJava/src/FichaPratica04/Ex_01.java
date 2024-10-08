package FichaPratica04;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num1, num2, resultado;
        String operacao, repeticao; // + - / *

        do {

            // Ler valor
            System.out.print("Insira o numero 1: ");
            num1 = input.nextDouble();

            System.out.print("Insira o numero 2: ");
            num2 = input.nextDouble();

            // Ler operacao
            System.out.print("Operação desejada ( + - * / ): ");
            operacao = input.next();

            switch (operacao) {
                case "+": // Soma
                    resultado = num1 + num2;
                    System.out.println("Soma: " + resultado);
                    break;

                case "-": // Subtracao
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

                default: // Operação inválida
                    System.out.println("Operação não suportada");
            }

            // Perceber se o utilizador quer continuar
            do {
                System.out.print("Deseja continuar (s/n): ");
                repeticao = input.next();
            }while (!repeticao.equals("n") && !repeticao.equals("s"));

            // Se a resposta do utilizador for diferente do "n", então repete
        } while (!repeticao.equals("n")); // repeticao != "n"

    }
}
