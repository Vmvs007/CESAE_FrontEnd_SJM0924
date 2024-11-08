package FichaPratica07;

import java.util.InputMismatchException;
import java.util.Scanner;

import static FichaPratica06.Ex_05.preencherVetor;

public class ExemploTryCatch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = preencherVetor(5);
        int pesquisa = 0;

      while(true) {

          try {
              System.out.println("\n\n***** Pesquisa no vetor *****");
              System.out.print("Índice a pesquisar: ");
              pesquisa = input.nextInt();

              System.out.println(vetor[pesquisa]);
          }catch (ArrayIndexOutOfBoundsException exc){
              System.out.println("Index inválido!");
          } catch (InputMismatchException exc){
              System.out.println("Tem de ser um número inteiro entre 0 e 4");
              input.nextLine(); // Limpeza de buffer
          }

      }

    }
}
