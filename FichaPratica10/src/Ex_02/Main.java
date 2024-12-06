package Ex_02;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Vitor S.", 25, 911222333, "vitor@email.pt");
        Pessoa pessoa2 = new Pessoa("Joaquim A.", 50, 922333444, "quim@email.pt");
        Pessoa pessoa3 = new Pessoa("Joana F.", 12, 988777666, "joana@email.pt");
        Pessoa pessoa4 = new Pessoa("Elisa T.", 40, 911444555, "elisa@mail.pt");
        Pessoa pessoa5 = new Pessoa("Fernando T.", 18, 944555666, "nando@email.pt");

        Sorteio euromilhoes = new Sorteio(105000);

        euromilhoes.adicionarParticipante(pessoa1);
        euromilhoes.adicionarParticipante(pessoa2);
        euromilhoes.adicionarParticipante(pessoa3);
        euromilhoes.adicionarParticipante(pessoa4);
        euromilhoes.adicionarParticipante(pessoa5);

        euromilhoes.exibirDetalhes();

        System.out.println("\n***** VENCEDOR *****");
        euromilhoes.sorteio().exibirDetalhes();
    }
}
