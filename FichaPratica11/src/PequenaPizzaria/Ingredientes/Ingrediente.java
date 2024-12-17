package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.UnidadeMedida;

public class Ingrediente {
    private String codigo;
    private String nome;
    private UnidadeMedida medida;
    private double kcalUnidade;

    public Ingrediente(String codigo, String nome, UnidadeMedida medida, double kcalUnidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.medida = medida;
        this.kcalUnidade = kcalUnidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public UnidadeMedida getMedida() {
        return medida;
    }

    public double getKcalUnidade() {
        return kcalUnidade;
    }

    public void exibirDetalhes() {
        System.out.print("[ " + this.codigo + " | " + this.nome + " | " + this.medida + " | " + this.kcalUnidade + " Kcal ]");
    }
}
