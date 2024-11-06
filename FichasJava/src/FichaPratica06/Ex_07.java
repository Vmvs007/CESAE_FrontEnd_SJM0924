package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex_02.lerInteiroPositivo;

public class Ex_07 {

    public static void desenharRetangulo(String caracter, int linhas, int colunas) {



        // Linha de cima
        for (int i = 0; i < colunas; i++) {
            System.out.print(caracter);
        }

        System.out.println();

        // Linhas do meio
        for (int h = 0; h < linhas - 2; h++) {

            for (int i = 0; i < colunas; i++) {

                // Primeiro e ultimo caracter da linha
                if (i == 0 || i == colunas - 1) {
                    System.out.print(caracter);
                } else {
                    // Espaços do meio
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        // Linha de baixo
        for (int i = 0; i < colunas; i++) {
            System.out.print(caracter);
        }

        linhas--;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um caracter: ");
        String caract = input.next();

        int nLinhas = lerInteiroPositivo();
        int nColunas = lerInteiroPositivo();

        desenharRetangulo(caract, nLinhas, nColunas);
        System.out.println(nLinhas);
    }
}
