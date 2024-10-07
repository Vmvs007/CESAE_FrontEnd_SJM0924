package FichaPratica03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int quantidadeNumeros, contador = 1, numAnt, numAtual;
        boolean crescente = true;

        // Ler quantidade
        System.out.print("Quantos números deseja inserir: ");
        quantidadeNumeros = input.nextInt();

        System.out.print("Insira um numero: ");
        numAnt = input.nextInt();

        while (contador < quantidadeNumeros) {
            System.out.print("Insira um número: ");
            numAtual = input.nextInt();

            if (numAtual <= numAnt) { // Sequência deixa de ser crescente
                crescente = false;
            }

            numAnt = numAtual;
            contador++;
        }

        if (crescente) {  // a mesma coisa que: crescente == true
            System.out.println("Crescente");
        } else {
            System.out.println("Não crescente");
        }


    }
}
