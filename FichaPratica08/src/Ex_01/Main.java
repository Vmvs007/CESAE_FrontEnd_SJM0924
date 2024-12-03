package Ex_01;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Vitor S.", 25, 1.7);
        Pessoa pessoa2 = new Pessoa("Joana M.", 40, 1.55);
        Pessoa pessoa3 = new Pessoa("Joaquim A.", 50, 1.75);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        System.out.println(pessoa2.getNome());

        pessoa1.setIdade(26);


        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
    }
}
