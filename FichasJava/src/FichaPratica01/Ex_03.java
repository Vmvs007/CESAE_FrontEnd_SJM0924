package FichaPratica01;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as Variáveis
        int comprimento, largura, perimetro, area;

        // Ler dimensões
        System.out.print("Insira o comprimento: ");
        comprimento = input.nextInt();

        System.out.print("Insira a largura: ");
        largura = input.nextInt();

        // Calcular o perimetro
        perimetro = comprimento + comprimento + largura + largura;

        // Calcular o area
        area = comprimento * largura;

        // Apresentar os resultados
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
    }
}
