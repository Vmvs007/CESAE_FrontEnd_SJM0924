package FichaPratica03;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, fatorial = 1, contador = 1;

        System.out.print("Insira um número: ");
        num = input.nextInt();

        // Calcular o fatorial
        while (contador <= num) {
            fatorial = fatorial * contador;
            contador++;
        }

        System.out.println("Fatorial de " + num + ": " + fatorial);

    }
}
