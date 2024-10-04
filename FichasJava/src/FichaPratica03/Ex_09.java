package FichaPratica03;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num = 0, soma = 1, media, contador = -1;

        // Ciclo que executa até o utilizador introduzir o -1
        while (num != -1) {

            // Ler num
            System.out.print("Insira um número: ");
            num = input.nextDouble();

            // Acumular na soma
            soma = soma + num;

            // Contar os números
            contador++;
        }

//        System.out.println("Soma: " + soma);
//        System.out.println("Contador: " + contador);

        // Calcular e apresentar a media
        media = soma / contador;

        System.out.println("Média: " + media);

    }
}
