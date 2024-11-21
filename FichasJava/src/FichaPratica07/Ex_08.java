package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_08 {

    /**
     * Função que calcula o total de vendas do ficheiro
     *
     * @param path Ficheiro a ser analisado
     * @return Total de Vendas (€)
     */
    public static double totalVendas(String path) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(path));
        double totalVendas = 0;

        // Avançar a linha do cabeçalho à frente
        sc.nextLine();

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] linhaSeparada = linha.split(",");

            totalVendas += Double.parseDouble(linhaSeparada[2]) * Double.parseDouble(linhaSeparada[3]);

        }

        return totalVendas;

    }

    public static double totalVendasTipoProduto(String path, String tipoProduto) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(path));
        double totalVendas = 0;

        // Avançar a linha do cabeçalho à frente
        sc.nextLine();

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] linhaSeparada = linha.split(",");

            if (linhaSeparada[0].equals(tipoProduto)) {
                totalVendas += Double.parseDouble(linhaSeparada[2]) * Double.parseDouble(linhaSeparada[3]);
            }


        }

        return totalVendas;

    }

    public static String produtoMaisCaro(String path) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));

        String nomeProdutoMaisCaro = "";
        double precoMaisCaro = 0;

        sc.nextLine();

        while(sc.hasNextLine()){
            String linha = sc.nextLine();
            String[] linhaSeparada = linha.split(",");


            if(Double.parseDouble(linhaSeparada[3])>precoMaisCaro){
                precoMaisCaro=Double.parseDouble(linhaSeparada[3]);
                nomeProdutoMaisCaro=linhaSeparada[1];
            }
        }
        return nomeProdutoMaisCaro;
    }


    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Total Vendas: " + totalVendas("Ficheiros/exercicio_08.csv") + " €");

        String tipoProduto = "Higiene";
        System.out.println("Total Vendas " + tipoProduto + ": " + totalVendasTipoProduto("Ficheiros/exercicio_08.csv", tipoProduto) + " €");

        System.out.println("Produto Mais Caro: "+produtoMaisCaro("Ficheiros/exercicio_08.csv"));
    }
}
