package FichaPratica01;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as Variáveis
        double raio, area, pi = 3.1415;

        // Ler raio
        System.out.print("Insira o raio: ");
        raio = input.nextDouble();

        // Calcular a área
        area = pi * raio * raio;

        // Apresentar o resultado
        System.out.println("Área da Circunferência: " + area);
    }
}
