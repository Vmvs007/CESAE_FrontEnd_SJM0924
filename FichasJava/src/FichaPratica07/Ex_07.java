package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {

    public static int contarLinhas(String path) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));

        int linhas = 0;

        while (sc.hasNextLine()) {
            linhas++;
            sc.nextLine();
        }

        return linhas;
    }

    public static int contarPalavras(String path) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));

        int palavras = 0;

        while (sc.hasNext()) {
            palavras++;
            sc.next();
        }

        return palavras;
    }


    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Linhas: " + contarLinhas("Ficheiros/exercicio_07.txt"));
        System.out.println("Palavras: " + contarPalavras("Ficheiros/exercicio_07.txt"));
    }
}
