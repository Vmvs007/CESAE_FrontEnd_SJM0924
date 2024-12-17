package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.OrigemIngrediente;
import PequenaPizzaria.Enums.TipoCarne;
import PequenaPizzaria.Enums.UnidadeMedida;

public class Carne extends  Cobertura{
    private TipoCarne tipo;

    public Carne(String codigo, String nome, UnidadeMedida medida, double kcalUnidade, OrigemIngrediente origem, TipoCarne tipo) {
        super(codigo, nome, medida, kcalUnidade, origem);
        this.tipo = tipo;
    }
}
