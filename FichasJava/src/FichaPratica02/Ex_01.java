package FichaPratica02;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as Variáveis
        int num1, num2;

        // Ler números
        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        System.out.print("Insira outro número: ");
        num2 = input.nextInt();

        // Avaliar qual dos dois o maior
        if (num1 > num2) {
            System.out.println("Maior: " + num1);
        } else {
            System.out.println("MAIOR: " + num2);
        }

    }
}
