package FichaPratica07;

import java.util.Scanner;

public class LimpezaBuffer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        String frase;

        System.out.print("Insira um numero: ");
        numero = input.nextInt();

        System.out.print("Insira uma frase: ");
        input.nextLine(); // Limpeza de buffer
        frase = input.nextLine();

        System.out.println("\n\n\n");

        System.out.println("Número: " + numero);
        System.out.println("Frase: " + frase);
    }
}
