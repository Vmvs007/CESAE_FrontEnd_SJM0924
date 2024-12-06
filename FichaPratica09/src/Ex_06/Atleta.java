package Ex_06;

public class Atleta {
    private String nome;
    private String modalidade;
    private double altura;
    private double peso;
    private String paisOrigem;

    public Atleta(String nome, String modalidade, double altura, double peso, String paisOrigem) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.paisOrigem = paisOrigem;
    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | " + this.paisOrigem + " | " + this.altura + " m. | " + this.peso + " Kg. | " + this.modalidade);
    }
}
