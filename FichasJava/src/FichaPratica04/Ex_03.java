package FichaPratica04;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numSecreto, palpite, contadorTentativas = 0;

        System.out.print("Jogador 1, insira o número secreto ( 0 - 100 ): ");
        numSecreto = input.nextInt();

        // Ciclo para imprimir 50 enters "limpar a consola"
        for(int i = 0; i<200; i++){
            System.out.println();
        }

        do {
            // Ler palpite
            System.out.print("Jogador 2, tenta adivinhar: ");
            palpite = input.nextInt();

            contadorTentativas++;

            if (palpite < numSecreto) {
                System.out.println("Está muito baixo");
            }

            if (palpite > numSecreto) {
                System.out.println("Está muito alto");
            }

        } while (palpite != numSecreto);

        System.out.println("Parabéns! Adivinhaste!");
        System.out.println("Foram precisas " + contadorTentativas + " tentativas");


    }
}
