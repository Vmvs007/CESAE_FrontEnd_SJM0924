package FichaPratica05;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[4][4];
        int somatorio = 0;

        // Ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();

            }
        }

        // Imprimir a matriz
        System.out.println("____________________________");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }
        System.out.println("____________________________");


        // Calcular o somatorio
        for (int i = 0; i < matriz.length; i++) {
            somatorio += matriz[i][i];
        }

        System.out.println("Somatório da Diagonal Principal: " + somatorio);

    }
}
