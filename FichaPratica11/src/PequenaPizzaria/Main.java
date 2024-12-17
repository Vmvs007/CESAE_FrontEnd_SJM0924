package PequenaPizzaria;

import PequenaPizzaria.Enums.*;
import PequenaPizzaria.Ingredientes.*;


public class Main {
    public static void main(String[] args) {

        Base baseItaliana = new Base("I-100", "Base Fina Italiana", 2.5, BasePizza.FINA, "Tradicional");

        Vegetal molhoTomate = new Vegetal("I-001", "Molho Tomate", UnidadeMedida.LITROS, 400, OrigemIngrediente.NACIONAL, TipoVegetal.TOMATE);
        Vegetal cogumelos = new Vegetal("I-033", "Cogumelos", UnidadeMedida.UNIDADES, 5, OrigemIngrediente.NACIONAL, TipoVegetal.COGUMELOS);

        Queijo queijoMozzarela = new Queijo("I-002", "Queijo Mozzarela", UnidadeMedida.GRAMAS, 4, OrigemIngrediente.IMPORTADO, TipoQueijo.MOZZARELA);

        Carne fiambre = new Carne("I-050", "Fiambre", UnidadeMedida.GRAMAS, 6.5, OrigemIngrediente.IMPORTADO, TipoCarne.FIAMBRE);

        Pizza pizza4EstacoesMedia = new Pizza("P-001", "Pizza 4 Estações", "Muito saborosa", 12.5, TamanhoPizza.MEDIA);
        pizza4EstacoesMedia.adicionarIngredientePizza(new IngredientePizza(baseItaliana, 250));
        pizza4EstacoesMedia.adicionarIngredientePizza(new IngredientePizza(molhoTomate, 0.150));
        pizza4EstacoesMedia.adicionarIngredientePizza(new IngredientePizza(queijoMozzarela, 100));
        pizza4EstacoesMedia.adicionarIngredientePizza(new IngredientePizza(fiambre, 100));
        pizza4EstacoesMedia.adicionarIngredientePizza(new IngredientePizza(cogumelos, 10));

//        pizza4EstacoesMedia.removerIngredientePizza("I-100");
//
//        pizza4EstacoesMedia.removerIngredientePizza("I-001");
//        pizza4EstacoesMedia.removerIngredientePizza("I-033");
//        pizza4EstacoesMedia.removerIngredientePizza("I-002");
//        pizza4EstacoesMedia.removerIngredientePizza("I-050");

//        Pizza pizzaQueijoFiambrePequena = new Pizza("P-020", "Pizza Queijo e Fiambre", "Simples não falha", 7.5, TamanhoPizza.PEQUENA);
//
//        pizzaQueijoFiambrePequena.adicionarIngredientePizza(new IngredientePizza(molhoTomate, 0.125));
//        pizzaQueijoFiambrePequena.adicionarIngredientePizza(new IngredientePizza(queijoMozzarela, 90));
//        pizzaQueijoFiambrePequena.adicionarIngredientePizza(new IngredientePizza(fiambre, 110));

        pizza4EstacoesMedia.exibirDetalhes();


    }
}
