package FichaPratica05;

import java.util.Scanner;

public class Ex_03_v2 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[5];
        int maior = 0;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();

            if (i == 0) {
                maior = vetor[0];
            } else {
                if (vetor[i] > maior) {
                    maior = vetor[i];
                }
            }
        }

        System.out.println("Maior: " + maior);

    }
}
