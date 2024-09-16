package FichaPratica01;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as Variáveis
        double preco1, preco2, preco3, total, totalComDesconto;

        // Ler preços
        System.out.print("Insira o preço 1: ");
        preco1 = input.nextDouble();

        System.out.print("Insira o preço 2: ");
        preco2 = input.nextDouble();

        System.out.print("Insira o preço 3: ");
        preco3 = input.nextDouble();

        // Calcular o total (sem desconto)
        total = preco1 + preco2 + preco3;

        // Aplicar o desconto
        totalComDesconto = total * 0.9;

        // Apresentar o total
        System.out.println("Total: " + total + "€");
        System.out.println("Total com 10% de desconto: " + totalComDesconto + "€");
    }
}
