package FichaPratica05;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][5];
        int pesquisa, contador=0;

        // Ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();

            }
        }

        // Imprimir a matriz
        System.out.println("________________________________________________");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna]+"\t|\t");
            }
            System.out.println();
        }
        System.out.println("________________________________________________");

        // Ler pesquisa
        System.out.print("\nNúmero a pesquisa: ");
        pesquisa = input.nextInt();

        // Procurar quantas vezes o número a pesquisar existe na matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                if(matriz[linha][coluna]==pesquisa){ // Encontramos uma ocorrência
                    contador++;
                }

            }
        }

        System.out.println("O número "+pesquisa+" existe "+contador+" vezes na matriz.");



    }
}
