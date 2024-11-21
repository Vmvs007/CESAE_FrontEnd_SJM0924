package FichaPratica07;

import java.io.*;
import java.util.Scanner;

public class Ex_02 {

    public static void escreverFicheiroPW(String path, String mensagem) throws FileNotFoundException {
        File newFile = new File(path);
        PrintWriter pw = new PrintWriter(newFile);

        pw.println(mensagem);

        pw.close();

    }

    public static void escreverFicheiroFW(String path, String mensagem) throws IOException {
        File newFile = new File(path);
        FileWriter fw = new FileWriter(newFile, true);

        fw.append(mensagem+"\n");

        fw.close();
    }


    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira a mensagem: ");
        String mensagemUtilizador = input.nextLine();

        // escreverFicheiroPW("Ficheiros/exercicio_02.txt", mensagemUtilizador);
        // escreverFicheiroPW("Ficheiros/exercicio_02_v2.txt","Mensagem :D");

        escreverFicheiroFW("Ficheiros/exercicio_02.txt", mensagemUtilizador);

    }
}
