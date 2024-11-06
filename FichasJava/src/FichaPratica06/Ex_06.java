package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex_02.lerInteiroPositivo;
import static FichaPratica06.Ex_05.*;
import static java.lang.Thread.sleep;

public class Ex_06 {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        int tamanhoVetor;

        System.out.print("Insira o tamanho do vetor: ");
        tamanhoVetor = lerInteiroPositivo();

        int[] vetor = preencherVetor(tamanhoVetor);
        int opcao;

        do {
            limparConsola();

            System.out.println("\n\n********** Programa de Análise de um Vetor **********\n");
            imprimirVetor(vetor);

            System.out.println("\n\n1. Maior Elemento");
            System.out.println("2. Menor ELemento");
            System.out.println("3. Crescente ou Não Crescente");
            System.out.println("0. Sair");
            System.out.print("Insira a opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("***** Maior Elemento *****");
                    System.out.println(maiorElementoVetor(vetor));
                    primaEnter();

                    break;

                case 2:
                    System.out.println("***** Menor Elemento *****");
                    System.out.println(menorElementoVetor(vetor));
                    primaEnter();
                    break;

                case 3:
                    System.out.println("***** Crescente ou Não Crescente *****");

                    if (vetorCrescente(vetor)) {
                        System.out.println("Crescente");
                    } else {
                        System.out.println("Não crescente");
                    }

                    // Fazer o código esperar
                    sleep(3000);

                    break;

                case 0: // Sair
                    System.out.println("Obrigado! Até à próxima! :D");
                    break;

                default:
                    System.out.println("***** Opção Inválida *****");
            }


        } while (opcao != 0);


    }
}
