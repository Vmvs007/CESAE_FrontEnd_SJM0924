package FichaPratica02;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as Variáveis
        int num1, num2;

        // Ler num1 e num2
        System.out.print("Insira o num1: ");
        num1 = input.nextInt();

        System.out.print("Insira o num2: ");
        num2 = input.nextInt();

        // Perceber qual o num maior
        if (num1 > num2) {
            System.out.println(num2 + "\t" + num1);
        }else{
            System.out.println(num1 + "\t" + num2);
        }

        // TODO Atenção ao + nos System.out.print, pode funcionar como operador da soma

    }
}
