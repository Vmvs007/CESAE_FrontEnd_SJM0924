package FichaPratica03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int limite, contador = 0;
        String mensagem;

        // Ler limite
        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        // Ler mensagem
        System.out.print("Insira a mensagem: ");
        input.nextLine(); // Limpeza de buffer
        mensagem = input.nextLine();

        // Imprimir os número de 0 até limite
        while (contador < limite) {
            System.out.println(mensagem);
            contador++;
        }


    }
}
