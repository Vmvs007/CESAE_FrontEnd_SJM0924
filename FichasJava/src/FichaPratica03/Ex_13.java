package FichaPratica03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int contador, limite;

        // Ler inicio
        System.out.print("Inicio do Intervalo: ");
        contador = input.nextInt();

        // Ler limite
        System.out.print("Fim do Intervalo: ");
        limite = input.nextInt();

        // Imprimir os numeros multiplos de 5
        while (contador <= limite) {

            // Se for múltiplo de 5, imprime o contador
            if (contador % 5 == 0) {
                System.out.println(contador);
            }

            contador++;
        }

    }
}
