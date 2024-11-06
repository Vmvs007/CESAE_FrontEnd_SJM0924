package FichaPratica06;

import java.util.Scanner;

public class Ex_02 {

    /**
     * Função que lê um número inteiro e positivo (repete input até que as condições sejam cumpridas)
     *
     * @return Número Inteiro e Positivo
     */
    public static int lerInteiroPositivo() {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.print("Insira inteiro positivo: ");
            num = input.nextInt();
        } while (num < 0);

        return num;
    }

    /**
     * Função que imprime n asteriscos
     *
     * @param quantidade Asteriscos a serem impressos
     */
    public static void imprimirAsteriscos(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.print("*");
        }
    }

    public static void imprimirCaracter(int quantidade, String caracter) {
        for (int i = 0; i < quantidade; i++) {
            System.out.print(caracter);
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //imprimirAsteriscos(lerInteiroPositivo());

        System.out.print("Insira um caracter: ");
        String caract = input.next();

        imprimirCaracter(lerInteiroPositivo(), caract);


    }


}
