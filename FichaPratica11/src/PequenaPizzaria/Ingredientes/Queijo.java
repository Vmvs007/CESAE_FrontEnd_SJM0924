package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.OrigemIngrediente;
import PequenaPizzaria.Enums.TipoQueijo;
import PequenaPizzaria.Enums.UnidadeMedida;

public class Queijo extends Cobertura{
    private TipoQueijo tipo;

    public Queijo(String codigo, String nome, UnidadeMedida medida, double kcalUnidade, OrigemIngrediente origem, TipoQueijo tipo) {
        super(codigo, nome, medida, kcalUnidade, origem);
        this.tipo = tipo;
    }
}
