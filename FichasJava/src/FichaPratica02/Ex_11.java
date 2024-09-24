package FichaPratica02;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as Variáveis
        double saldo, movimento;

        // Ler saldo
        System.out.print("Insira o saldo: ");
        saldo = input.nextDouble();

        // Ler movimento
        System.out.print("Insira o valor a movimentar: ");
        movimento = input.nextDouble();

        // Avaliar se o movimento é válido
        if (saldo + movimento >= 0) { // Movimento válido

            // Atualizamos o saldo
            saldo = saldo + movimento;

        } else { // Movimento inválido

            System.out.println("Operação inválida. Saldo insuficiente.");

        }

        System.out.println("Saldo Atual: " + saldo);

    }
}
