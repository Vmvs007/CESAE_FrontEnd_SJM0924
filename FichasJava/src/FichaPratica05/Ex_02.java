package FichaPratica05;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {
        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double[] comissoes = new double[12];
        double total = 0;

        // Preencher o vetor
        for (int i = 0; i < comissoes.length; i++) { // A mesma coisa: for (int i = 0; i < 12; i++) {
            System.out.print("Insira no comissoes[" + i + "]: ");
            comissoes[i] = input.nextDouble();
        }

        // Iterar o vetor
        for (int i = 0; i < comissoes.length; i++) {
            total = total + comissoes[i];
        }

        System.out.println("Total Anual: " + total);
    }
}
