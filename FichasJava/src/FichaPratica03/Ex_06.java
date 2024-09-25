package FichaPratica03;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int inicio, fim;

        // Ler inicio e fim
        System.out.print("Introduza o número de ínicio: ");
        inicio = input.nextInt();

        System.out.print("Introduza o número de fim: ");
        fim = input.nextInt();

        while (inicio <= fim) {
            System.out.println(inicio);
            inicio++;
        }

    }
}
