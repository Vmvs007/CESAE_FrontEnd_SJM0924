package Ex_03;

public class Retangulo {
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public int area() {
        return this.largura * this.altura;
    }

    public int perimetro() {
        return 2 * (this.largura + this.altura);
    }
}
