package FichaPratica05;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[][] matriz = new int[10][2];


        // Ler vetor1
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Insira no vetor1[" + i + "]: ");
            vetor1[i] = input.nextInt();
        }

        // Ler vetor2
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Insira no vetor2[" + i + "]: ");
            vetor2[i] = input.nextInt();
        }

        // Passar os elementos dos vetores para a matriz
        for (int i = 0; i < 10; i++) {
            matriz[i][0] = vetor1[i];
            matriz[i][1] = vetor2[i];
        }

        // Imprimir a matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna]+"\t|\t");
            }
            System.out.println();
        }

    }
}
