package FichaPratica05;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];

        // Ler vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        // Imprimir um vetor
        for (int i = 0; i < 10; i++) {
            System.out.println("vetor[" + i + "]: " + vetor[i]);
        }

    }
}
