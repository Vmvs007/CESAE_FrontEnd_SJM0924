package FichaPratica02;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as Variáveis
        double nota1, nota2, nota3, mediaPonderada;

        // Ler notas
        System.out.print("Nota 1: ");
        nota1 = input.nextDouble();

        System.out.print("Nota 2: ");
        nota2 = input.nextDouble();

        System.out.print("Nota 3: ");
        nota3 = input.nextDouble();

        mediaPonderada = (nota1 * 0.25) + (nota2 * 0.35) + (nota3 * 0.4);

        // System.out.println("Média Ponderada: " + mediaPonderada);

        if (mediaPonderada >= 9.5) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Não Aprovado");
        }
    }
}
