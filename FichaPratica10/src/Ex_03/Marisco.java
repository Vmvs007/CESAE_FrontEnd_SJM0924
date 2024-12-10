package Ex_03;

public class Marisco {
    private String especie;
    private double peso;
    private double precoKg;

    /**
     * Método construtor de <b>Marisco</b>
     * @param especie Espécie de <b>Marisco</b>
     * @param peso Peso (Kg.)
     * @param precoKg Preço/Kg. (€)
     */
    public Marisco(String especie, double peso, double precoKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoKg = precoKg;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecoKg() {
        return precoKg;
    }

    /**
     * Método para exibir detalhes de um <b>Marisco</b>
     */
    public void exibirDetalhes(){
        System.out.println(this.especie+" | "+this.peso+" Kg. | "+this.precoKg+" €/Kg.");
    }
}
