package FichaPratica02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as Variáveis
        double salario, taxa;

        // Ler o salário
        System.out.print("Insira o salário anual: ");
        salario = input.nextDouble();

        if (salario <= 15000) {
            // Salário menor ou igual a 15.000
            taxa = salario * 0.2;
            System.out.println("Taxa de 20%: " + taxa);
        } else {
            // Salário maior que 15.000
            taxa = salario * 0.3;
            System.out.println("Taxa de 30%: " + taxa);
        }

    }
}
