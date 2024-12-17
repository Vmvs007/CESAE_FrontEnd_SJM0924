package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.OrigemIngrediente;
import PequenaPizzaria.Enums.UnidadeMedida;

public class Cobertura extends Ingrediente{
    private OrigemIngrediente origem;

    public Cobertura(String codigo, String nome, UnidadeMedida medida, double kcalUnidade, OrigemIngrediente origem) {
        super(codigo, nome, medida, kcalUnidade);
        this.origem = origem;
    }
}
