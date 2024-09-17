package FichaPratica02;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as Variáveis
        int num;

        // Ler num
        System.out.print("Insira um número:");
        num = input.nextInt();

        // Avaliar se é par ou não - usamos resto da divisão inteira (%)
        // Slides 03 - Tipos de Dados - Operações Aritmética com Inteiros
        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
