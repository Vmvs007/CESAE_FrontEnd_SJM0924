package FichaPratica05;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {


        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[2][2];
        int somatorio = 0;

        // Ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();

            }
        }

        // Calcular a soma
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                somatorio += matriz[linha][coluna]; // somatorio = somatorio + matriz[linha][coluna];
            }
        }

        System.out.println("Soma de todos os elementos: " + somatorio);


    }
}
