package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_03 {

    public static void copiarFicheiro(String pathOriginal, String pathCopia) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(pathOriginal));
        PrintWriter pw = new PrintWriter(new File(pathCopia));

        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            pw.println(linhaAtual);
        }

        pw.close();

    }

    public static void main(String[] args) throws FileNotFoundException {

        copiarFicheiro("Ficheiros/exercicio_03_Alternativa01.txt","Ficheiros/exercicio_03_copia.txt");
    }
}
