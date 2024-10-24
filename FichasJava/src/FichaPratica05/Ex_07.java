package FichaPratica05;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[5];
        int maiorPar;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        maiorPar = -1;

        // Descobrir o maior par (caso exista)
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] % 2 == 0) { // Se o elemento atual for par

                if (maiorPar % 2 != 0) { // Se o maiorPar estiver com o primeiro valor (impar)
                    maiorPar = vetor[i];
                }

                if (vetor[i] > maiorPar) { // Se o elemento atual for maior que maiorPar
                    maiorPar = vetor[i];
                }

            }

        }

        if (maiorPar % 2 == 0) {
            System.out.println("Maior Par: " + maiorPar);
        } else {
            System.out.println("Não há pares");
        }


    }
}
