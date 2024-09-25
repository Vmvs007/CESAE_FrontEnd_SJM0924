package FichaPratica03;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, antecessor;

        // Ler num
        System.out.print("Insira o número: ");
        num = input.nextInt();

        antecessor = num - 5;

        while (antecessor <= num + 5) {
            if(antecessor!=num){
                System.out.println(antecessor);
            }
            antecessor++;
        }
    }
}
