package FichaPratica01;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as Variáveis
        double valor1, valor2, valor3, mediaAritmetica, mediaPonderada;

        // Ler valores
        System.out.print("Insira o 1º valor: ");
        valor1 = input.nextDouble();

        System.out.print("Insira o 2º valor: ");
        valor2 = input.nextDouble();

        System.out.print("Insira o 3º valor: ");
        valor3 = input.nextDouble();

        // Calcular a media aritmetica
        mediaAritmetica = (valor1 + valor2 + valor3) / 3;

        // Apresentar a media aritmetica
        System.out.println("Média Aritmética: " + mediaAritmetica);

        // Calcular a media ponderada
        mediaPonderada = (valor1 * 0.2) + (valor2 * 0.3) + (valor3 * 0.5);

        // Apresentar a media ponderada
        System.out.println("Média Ponderada: "+mediaPonderada);

        // 5%   * 0.05
        // 10%  * 0.1
        // 25%  * 0.25
        // 90%  * 0.9
        // 100% * 1.0
        // 150% * 1.5
    }
}
