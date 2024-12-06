package Ex_06;

public class Competicao {

    private String nome;
    private String pais;
    private Atleta[] listaInscritos;

    public Competicao(String nome, String pais, int maxInscritos) {
        this.nome = nome;
        this.pais = pais;
        this.listaInscritos = new Atleta[maxInscritos];
    }

    public void inscreverAtleta(Atleta atletaNovo) {
        for (int i = 0; i < this.listaInscritos.length; i++) {
            if (this.listaInscritos[i] == null) {
                this.listaInscritos[i] = atletaNovo;
                return;
            }
        }
    }

    public void exibirDetalhes() {
        System.out.println("\n***** " + this.nome + " | " + this.pais + " *****");
        for (int i = 0; i < this.listaInscritos.length; i++) {
            if (this.listaInscritos[i] != null) {
                this.listaInscritos[i].exibirDetalhes();
            }
        }
    }
}
