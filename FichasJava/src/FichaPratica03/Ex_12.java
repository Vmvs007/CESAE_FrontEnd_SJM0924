package FichaPratica03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num = 0, cont_0_25 = 0, cont_26_50 = 0, cont_51_75 = 0, cont_76_100 = 0;

        // Ciclo que executa enquanto o numero introduzido pelo utilizador for positivo
        while (num >= 0) {

            // Ler num
            System.out.print("Insira um número (negativo para sair): ");
            num = input.nextInt();

            // Avaliar em que intervalo é que se encaixa
            if (num >= 0 && num <= 25) {
                cont_0_25++;
            }

            if (num >= 26 && num <= 50) {
                cont_26_50++;
            }

            if (num >= 51 && num <= 75) {
                cont_51_75++;
            }

            if (num >= 76 && num <= 100) {
                cont_76_100++;
            }
        }

        System.out.println(" [00,25]: " + cont_0_25);
        System.out.println(" [26,50]: " + cont_26_50);
        System.out.println(" [51,75]: " + cont_51_75);
        System.out.println("[76,100]: " + cont_76_100);

    }
}
