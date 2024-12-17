package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.OrigemIngrediente;
import PequenaPizzaria.Enums.TipoFrutoMar;
import PequenaPizzaria.Enums.UnidadeMedida;

public class FrutoMar extends Cobertura{
    private TipoFrutoMar tipo;

    public FrutoMar(String codigo, String nome, UnidadeMedida medida, double kcalUnidade, OrigemIngrediente origem, TipoFrutoMar tipo) {
        super(codigo, nome, medida, kcalUnidade, origem);
        this.tipo = tipo;
    }
}
