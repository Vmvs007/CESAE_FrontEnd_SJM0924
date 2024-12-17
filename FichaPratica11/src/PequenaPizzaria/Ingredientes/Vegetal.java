package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.OrigemIngrediente;
import PequenaPizzaria.Enums.TipoVegetal;
import PequenaPizzaria.Enums.UnidadeMedida;

public class Vegetal extends Cobertura{
    private TipoVegetal tipo;

    public Vegetal(String codigo, String nome, UnidadeMedida medida, double kcalUnidade, OrigemIngrediente origem, TipoVegetal tipo) {
        super(codigo, nome, medida, kcalUnidade, origem);
        this.tipo = tipo;
    }
}
