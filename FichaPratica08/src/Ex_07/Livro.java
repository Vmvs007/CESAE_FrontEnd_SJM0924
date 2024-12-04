package Ex_07;

public class Livro {

    private String titulo;
    private String autor;
    private String categoria;
    private int nPaginas;
    private String isbn;

    // alt + insert || RMB + Generate
    public Livro(String titulo, String autor, String categoria, int nPaginas, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.nPaginas = nPaginas;
        this.isbn = isbn;
    }

    public void exibirDetalhesCompleto() {
        System.out.println("********************** " + this.titulo + " **********************");
        System.out.println(this.autor + "\t| " + this.categoria + "\t| " + this.nPaginas + " páginas\t| ISBN: " + this.isbn);
    }

    public void exibirDetalhesCompacto() {
        System.out.println(this.titulo + "\t| " + this.autor + "\t| " + this.categoria + "\t| " + this.nPaginas + " páginas\t| ISBN: " + this.isbn);
    }

}
