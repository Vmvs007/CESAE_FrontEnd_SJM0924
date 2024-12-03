package Ex_04;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double area() {
        return 3.14 * this.raio * this.raio;
    }

    public double circunferencia() {
        return 3.14 * 2 * this.raio;
    }
}
