package FichaPratica03;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int limite, salto, contador=0;

        // Ler limite e salto
        System.out.print("Insira o limite: ");
        limite= input.nextInt();

        System.out.print("Insira o salto: ");
        salto= input.nextInt();


        while (contador<=limite){
            System.out.println(contador);
            contador=contador+salto;
        }

    }
}
