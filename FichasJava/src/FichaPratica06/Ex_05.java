package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex_02.lerInteiroPositivo;

public class Ex_05 {

    public static int[] preencherVetor(int tamanho){

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[tamanho];

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        return vetor;
    }


    public static void imprimirVetor(int[] vetor){

        System.out.print("[\t");
        for(int i =0; i< vetor.length; i++){
            if(i== vetor.length-1){
                System.out.print(vetor[i]+"\t");
            }else{
                System.out.print(vetor[i]+"\t|\t");
            }

        }
        System.out.print("]");
    }

    public static void limparConsola(){
        for(int i =0; i<500; i++){
            System.out.println();
        }
    }

    public static void primaEnter(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n[Prima Enter para Continuar]");
        input.nextLine();
    }

    public static int maiorElementoVetor(int[] vetor){
        int maior;

        // Inicializar o maior
        maior = vetor[0];

        // Encontrar o maior elemento
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    public static int menorElementoVetor(int[] vetor){
        int menor;

        // Inicializar o maior
        menor = vetor[0];

        // Encontrar o maior elemento
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;
    }

    public static boolean vetorCrescente(int[] vetor){

        // Descobrir se é crescente
        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] <= vetor[i - 1]) { // Deixa de ser crescente
                return false;
            }

        }

        return true;
    }
}
