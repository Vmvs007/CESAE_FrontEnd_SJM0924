package Ex_03;

import java.util.ArrayList;

public class BarcoPesca {
    private String nome;
    private String cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadeCarga;
    private MarcaBarco marca;
    private ArrayList<Peixe> peixesPescados;
    private ArrayList<Marisco> mariscoPescado;

    /**
     * Método construtor de <b>Barco</b>
     *
     * @param nome            Nome Artistico do <b>Barco</b>
     * @param cor             Cor do <b>Barco</b>
     * @param anoFabrico      Ano de Fabrico
     * @param tripulacao      Número de Tripulantes
     * @param capacidadeCarga Capacidade da Carga (Kg.)
     * @param marca           Marca do <b>Barco</b>
     */
    public BarcoPesca(String nome, String cor, int anoFabrico, int tripulacao, double capacidadeCarga, MarcaBarco marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marca = marca;
        this.peixesPescados = new ArrayList<Peixe>();
        this.mariscoPescado = new ArrayList<Marisco>();
    }

    /**
     * Método para pescar novos peixes
     *
     * @param peixeNovo Peixe a ser adicionado ao porão de carga
     */
    public void pescarPeixe(Peixe peixeNovo) {
        if (this.capacidadeCarga >= calcularCargaAtual() + peixeNovo.getPeso()) {
            this.peixesPescados.add(peixeNovo);
            System.out.println(peixeNovo.getEspecie() + " carregado com sucesso.");
        } else {
            System.out.println(calcularCargaAtual() + peixeNovo.getPeso() + " ultrapassa a capacidade do " + this.nome + " de " + this.capacidadeCarga + " Kg.");
        }
    }

    /**
     * Método para pescar novo marisco
     *
     * @param mariscoNovo Marisco a ser adicionado ao porão de carga
     */
    public void pescarMarisco(Marisco mariscoNovo) {
        if (this.capacidadeCarga >= calcularCargaAtual() + mariscoNovo.getPeso()) {
            this.mariscoPescado.add(mariscoNovo);
            System.out.println(mariscoNovo.getEspecie() + " carregado com sucesso.");
        } else {
            System.out.println(calcularCargaAtual() + mariscoNovo.getPeso() + " ultrapassa a capacidade do " + this.nome + " de " + this.capacidadeCarga + " Kg.");
        }
    }

    /**
     * Método para largar peixe - pelo index
     *
     * @param indexPeixeRemovido Index do Peixe a Remover
     */
    public void largarPeixe(int indexPeixeRemovido) {
        System.out.println(this.peixesPescados.get(indexPeixeRemovido).getEspecie() + " largado ao mar com sucesso.");
        this.peixesPescados.remove(indexPeixeRemovido);
    }

    /**
     * Método para largar peixe - pelo objeto
     *
     * @param peixeRemovido Peixe a Remover
     */
    public void largarPeixe(Peixe peixeRemovido) {

        System.out.println(peixeRemovido.getEspecie() + " largado ao mar com sucesso");
        this.peixesPescados.remove(peixeRemovido);
    }

    /**
     * Método para largar marisco - pelo index
     *
     * @param indexMariscoRemovido Index do Marisco a Remover
     */
    public void largarMarisco(int indexMariscoRemovido) {
        this.mariscoPescado.remove(indexMariscoRemovido);
    }

    /**
     * Método para largar marisco - pelo objeto
     *
     * @param mariscoRemovido Marisco a Remover
     */
    public void largarMarisco(Marisco mariscoRemovido) {
        this.mariscoPescado.remove(mariscoRemovido);
    }

    /**
     * Método que retorna a carga atual de Peixe e Marisco
     *
     * @return Carga Atual (Kg.)
     */
    public double calcularCargaAtual() {
        double cargaAtual = 0;

        for (Peixe peixeAtual : this.peixesPescados) {
            cargaAtual += peixeAtual.getPeso();
        }

        for (Marisco mariscoAtual : this.mariscoPescado) {
            cargaAtual += mariscoAtual.getPeso();
        }

        return cargaAtual;
    }

    /**
     * Método que calcula o preço total da carga atual
     *
     * @return Preço da Carga (€)
     */
    public double calcularPrecoCarga() {
        double precoTotal = 0;

        for (Peixe peixeAtual : this.peixesPescados) {
            precoTotal += peixeAtual.getPeso() * peixeAtual.getPrecoKg();
        }

        for (Marisco mariscoAtual : this.mariscoPescado) {
            precoTotal += mariscoAtual.getPeso() * mariscoAtual.getPrecoKg();
        }

        return precoTotal;
    }

    /**
     * Método para calcular o salário de um tripulante
     *
     * @return Salário Individual (€)
     */
    public double salarioTripulacao() {
        return (this.calcularPrecoCarga() * 0.6) / this.tripulacao;
    }

    public void exibirDetalhes() {
        System.out.println("******* *** " + this.nome + " ******* ***");
        System.out.println(this.cor + " | Ano Fabrico: " + this.anoFabrico + " | " + this.capacidadeCarga + " Kg. | Tripulação:" + this.tripulacao + " | " + this.marca);

        System.out.println("\n__________ Carga __________");

        for (Peixe peixeAtual : this.peixesPescados) {
            peixeAtual.exibirDetalhes();
        }

        for (Marisco mariscoAtual : this.mariscoPescado) {
            mariscoAtual.exibirDetalhes();
        }

        System.out.println("\nTotal de Carga: " + this.calcularCargaAtual() + " Kg.");
        System.out.println("Salário Atual da Tripulação: " + this.salarioTripulacao() + " €");

    }

}
