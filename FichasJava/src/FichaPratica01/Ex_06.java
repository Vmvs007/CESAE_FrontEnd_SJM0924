package FichaPratica01;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as Variáveis
        int valor1, valor2;

        // Ler valor 1
        System.out.print("Insira o valor 1: ");
        valor1 = input.nextInt();

        // Ler valor 2
        System.out.print("Insira o valor 2: ");
        valor2 = input.nextInt();

        // Apresentar variáveis atuais
        System.out.println("_________________________________");
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
        System.out.println("_________________________________");

        // Trocar as variáveis
        System.out.println("\nA trocar variáveis...\n");

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;


        // Apresentar as variáveis trocadas
        System.out.println("_________________________________");
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
        System.out.println("_________________________________");

    }
}
