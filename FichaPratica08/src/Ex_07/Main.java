package Ex_07;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Programação em Java","Vitor S.","Informática",950,"12345678901");
        Livro livro2 = new Livro("Programação em Python","Joaquim A.","Informática",90,"09876543211");

        livro1.exibirDetalhesCompleto();

        System.out.println();

        livro2.exibirDetalhesCompleto();

        System.out.println();

        livro1.exibirDetalhesCompacto();


    }
}
