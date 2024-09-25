package FichaPratica03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int limite, contador = 0;

        // Ler limite
        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        // Imprimir os número de 0 até limite
        while (contador <= limite) {
            System.out.println(contador);
            contador++; // contador = contador + 1;
        }


    }
}
