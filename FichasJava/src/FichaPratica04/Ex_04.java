package FichaPratica04;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num;
        boolean primo = true;

        // Ler num
        System.out.print("Insira um numero: ");
        num = input.nextInt();

        // Avaliar se o número é ou não primo
        for (int i = 2; i < num; i++) {

            if (num % i == 0) { // O num conseguiu dividir por um numero, deixa de ser primo
                primo = false;
            }
        }

        if(primo){ // primo == true
            System.out.println("Primo");
        }else{
            System.out.println("Não Primo");
        }

    }
}
