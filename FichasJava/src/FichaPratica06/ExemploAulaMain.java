package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.LibrariaMatematica.*;

public class ExemploAulaMain {

    public static void main(String[] args) {

        // PROGRAMA DE ANÁLISE DE 3 NÚMEROS

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;
        int a, b, c;

        // Ler a b c
        System.out.print("Insira o 1º número: ");
        a = input.nextInt();

        System.out.print("Insira o 2º número: ");
        b = input.nextInt();

        System.out.print("Insira o 3º número: ");
        c = input.nextInt();

        do {
            // Apresentar as opções
            System.out.println("\n\n********** \uD83E\uDDEE PROGRAMA DE ANÁLISE MATEMÁTICA \uD83E\uDDEE **********");
            System.out.println("******************** " + a + "\t|\t" + b + "\t|\t" + c + " ********************\n");

            System.out.println("1. Par ou Impar");
            System.out.println("2. Positivos ou Negativos");
            System.out.println("3. Primos ou Não Primos");
            System.out.println("4. Menor e Maior");
            System.out.println("5. Perfeito ou Não Perfeito");
            System.out.println("6. Triangular ou Não Triangular");
            System.out.println("7. Trocar os Números");
            System.out.println("0. Sair");

            System.out.print("Opção pretendida: ");
            opcao = input.nextInt();

            System.out.println("\n____________________________________________________");

            switch (opcao) {

                case 1: // Par ou Impar
                    break;

                case 2: // Positivos ou Negativos
                    break;

                case 3: // Primos ou Não Primos

                    if (primo(a)) {
                        System.out.println(a + ": Primo");
                    } else {
                        System.out.println(a + ": Não Primo");
                    }

                    if (primo(b)) {
                        System.out.println(b + ": Primo");
                    } else {
                        System.out.println(b + ": Não Primo");
                    }

                    if (primo(c)) {
                        System.out.println(c + ": Primo");
                    } else {
                        System.out.println(c + ": Não Primo");
                    }

                    break;

                case 4: // Menor e Maior
                    System.out.println("Menor: "+ menor3Numeros(a,b,c));
                    System.out.println("Maior: "+ maior3Numeros(a,b,c));
                    break;

                case 5: // Perfeito ou Não Perfeito
                    break;

                case 6: //  Triangular ou Não Triangular
                    break;

                case 7: // Trocar os Números

                    // Ler a b c
                    System.out.print("Insira o 1º número: ");
                    a = input.nextInt();

                    System.out.print("Insira o 2º número: ");
                    b = input.nextInt();

                    System.out.print("Insira o 3º número: ");
                    c = input.nextInt();
                    
                    break;

                case 0: // Sair
                    System.out.println("\n\n\uD83E\uDD13 OBRIGADO! ATÉ À PRÓXIMA! \uD83E\uDD13");
                    break;

                default: // Opção Inválida
                    System.out.println("❌ Opção Inválida ❌");
            }

            System.out.println("____________________________________________________");

        } while (opcao != 0);

    }
}
