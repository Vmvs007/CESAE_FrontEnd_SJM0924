package FichaPratica05;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double[] vetor = new double[10];
        boolean crescente = true;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextDouble();
        }

        // Descobrir se é crescente
        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] <= vetor[i - 1]) { // Deixa de ser crescente
                crescente = false;
            }

        }

        if(crescente){ // crescente == true
            System.out.println("Crescente");
        }else{
            System.out.println("Não crescente");
        }


    }
}

