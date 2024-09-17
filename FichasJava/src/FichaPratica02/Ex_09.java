package FichaPratica02;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as Variáveis
        int a, b, c;

        // Ler numeros
        System.out.print("Insira a: ");
        a = input.nextInt();

        System.out.print("Insira b: ");
        b = input.nextInt();

        System.out.print("Insira c: ");
        c = input.nextInt();

        // Avaliar o menor
        if (a < b && a < c) {
            System.out.println("Menor: " + a);
        }

        if (b < a && b < c) {
            System.out.println("Menor: " + b);
        }

        if (c < a && c < b) {
            System.out.println("Menor: " + c);
        }

    }
}
