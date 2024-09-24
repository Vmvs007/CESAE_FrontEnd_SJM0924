package FichaPratica02;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as Variáveis
        int opcao;

        // Apresentar as opções
        System.out.println("********** Selecione uma opção **********");
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");

        System.out.print("\nSelecione uma opção: ");
        opcao = input.nextInt();

        switch (opcao){
            case 1: // Criar
                System.out.println("___ Criar ___");
                break;

            case 2: // Atualizar
                System.out.println("___ Atualizar ___");
                break;

            case 3: // Eliminar
                System.out.println("___ Eliminar ___");
                break;

            case 4: // Sair
                break;

            default: // Opção Inválida
                System.out.println("!!! Opção Inválida !!!");
                break;
        }

    }
}
