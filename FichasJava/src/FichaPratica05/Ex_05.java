package FichaPratica05;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double[] vetor = new double[10];
        double somatorio = 0, media;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextDouble();
        }

        // Calcular o somatorio de todos os elementos
        for (int i = 0; i < vetor.length; i++) {
            somatorio = somatorio + vetor[i];
        }

        // System.out.println("Somatório: " + somatorio);
        // System.out.println("Quant. Elementos: " + vetor.length);

        // Calcular a média, dividindo o somatório pela quantidade de elementos do vetor
        media = somatorio / vetor.length;

        System.out.println("Média do Vetor: " + media);
    }
}
