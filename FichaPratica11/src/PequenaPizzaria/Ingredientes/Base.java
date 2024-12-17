package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.BasePizza;
import PequenaPizzaria.Enums.UnidadeMedida;

public class Base extends Ingrediente{
    private BasePizza tipoBase;
    private String descricao;

    public Base(String codigo, String nome, double kcalUnidade, BasePizza tipoBase, String descricao) {
        super(codigo, nome, UnidadeMedida.GRAMAS, kcalUnidade);
        this.tipoBase = tipoBase;
        this.descricao = descricao;
    }
}
