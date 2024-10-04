package FichaPratica03;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int limite, contador = 2;

        // Ler limite
        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        while (contador <= limite) {
            System.out.println(contador);
            contador = contador + 2; // A mesma coisa que: contador += 2;
        }

    }
}
