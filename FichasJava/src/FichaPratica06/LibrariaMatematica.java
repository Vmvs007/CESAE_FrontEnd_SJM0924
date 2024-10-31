package FichaPratica06;

public class LibrariaMatematica {

    /**
     * Função que retorna se um número é ou não primo
     *
     * @param num Número a ser analisado
     * @return true: primo || false: não primo
     */
    public static boolean primo(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) { // Numero não é primo
                return false;
            }
        }
        return true;
    }

    /**
     * Função que retorna o menor de 3 números inteiros
     * @param num1 Número a ser analisado
     * @param num2 Número a ser analisado
     * @param num3 Número a ser analisado
     * @return Menor dos 3 números || 0 se dois ou mais números forem iguais
     */
    public static int menor3Numeros(int num1, int num2, int num3) {


        if (num1 < num2 && num1 < num3) {
            return num1;
        }

        if (num2 < num1 && num2 < num3) {
            return num2;
        }

        if (num3 < num1 && num3 < num2) {
            return num3;
        }

        return 0;
    }

    /**
     * Função que retorna o maior de 3 números inteiros
     * @param num1 Número a ser analisado
     * @param num2 Número a ser analisado
     * @param num3 Número a ser analisado
     * @return Maior dos 3 números || 0 se dois ou mais números forem iguais
     */
    public static int maior3Numeros(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {
            return num1;
        }

        if (num2 > num1 && num2 > num3) {
            return num2;
        }

        if (num3 > num1 && num3 > num2) {
            return num3;
        }

        return 0;
    }


}
