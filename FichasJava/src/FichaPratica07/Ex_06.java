package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("Ficheiros/exercicio_06.txt"));

        int idadePessoaMaisVelha = 0;
        String nomePessoaMaisVelha = "";

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] linhaSeparada = linha.split(",");

            if (Integer.parseInt(linhaSeparada[1]) > idadePessoaMaisVelha) {
                idadePessoaMaisVelha = Integer.parseInt(linhaSeparada[1]);
                nomePessoaMaisVelha = linhaSeparada[0];
            }

        }

        System.out.println("***** Pessoa Mais Velha *****");
        System.out.println(nomePessoaMaisVelha + " com " + idadePessoaMaisVelha + " anos.");

    }



}
