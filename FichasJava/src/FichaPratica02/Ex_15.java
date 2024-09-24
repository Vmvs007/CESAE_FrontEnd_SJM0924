package FichaPratica02;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as Variáveis
        int a, b, c;
        String opcao;

        // Ler numeros
        System.out.print("Insira a: ");
        a = input.nextInt();

        System.out.print("Insira b: ");
        b = input.nextInt();

        System.out.print("Insira c: ");
        c = input.nextInt();

        // Ler opcao
        System.out.println("Crescente (C) ou Decrescente (D): ");
        opcao=input.next();

        switch (opcao){
            case "C": // Crescente
                if (a < b && a < c) { // a ... ...

                    if (b < c) { // a b c
                        System.out.println(a + "\t" + b + "\t" + c);
                    } else { // a c b
                        System.out.println(a + "\t" + c + "\t" + b);
                    }
                }

                if (b < a && b < c) { // b ... ...

                    if (a < c) { // b a c
                        System.out.println(b + "\t" + a + "\t" + c);
                    } else { // b c a
                        System.out.println(b + "\t" + c + "\t" + a);
                    }
                }

                if (c < a && c < b) { // c ... ...

                    if (a < b) { // c a b
                        System.out.println(c + "\t" + a + "\t" + b);
                    } else { // c b a
                        System.out.println(c + "\t" + b + "\t" + a);
                    }
                }
                break;

            case "D": // Descrecente
                if (a < b && a < c) {

                    if (b < c) {
                        System.out.println(c + "\t" + b + "\t" + a);
                    } else {
                        System.out.println(b + "\t" + c + "\t" + a);
                    }
                }

                if (b < a && b < c) {

                    if (a < c) {
                        System.out.println(c + "\t" + a + "\t" + b);
                    } else {
                        System.out.println(a + "\t" + c + "\t" + b);
                    }
                }

                if (c < a && c < b) {

                    if (a < b) {
                        System.out.println(b + "\t" + a + "\t" + c);
                    } else {
                        System.out.println(a + "\t" + b + "\t" + c);
                    }
                }
                break;

            default:
                System.out.println("Opção não reconhecida...");
                break;
        }


    }
}
