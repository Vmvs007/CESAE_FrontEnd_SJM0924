package PequenaPizzaria;

import PequenaPizzaria.Enums.TamanhoPizza;
import PequenaPizzaria.Ingredientes.*;

import java.util.ArrayList;

public class Pizza {
    private int MAX_INGREDIENTES = 5;
    private String codigo;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanho;
    private ArrayList<IngredientePizza> listaIngredientesPizza;

    public Pizza(String codigo, String nome, String descricao, double preco, TamanhoPizza tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.listaIngredientesPizza = new ArrayList<IngredientePizza>();
    }

    public void adicionarIngredientePizza(IngredientePizza ingredientePizzaNovo) {
        if (this.listaIngredientesPizza.size() < MAX_INGREDIENTES) {

            if (this.listaIngredientesPizza.isEmpty() && ingredientePizzaNovo.getIngrediente() instanceof Base) { // É o primeiro ingrediente e é base
                System.out.println("Base adicionada");
                this.listaIngredientesPizza.add(ingredientePizzaNovo);
            } else if (this.listaIngredientesPizza.isEmpty() && !(ingredientePizzaNovo.getIngrediente() instanceof Base)) { // É o primeiro ingrediente, mas não é base
                System.out.println("Falta a base. Não foi possível adicionar a cobertura.");
            } else if (this.listaIngredientesPizza.size() > 0 && ingredientePizzaNovo.getIngrediente() instanceof Base) {// Já tem base, e o ingrediente novo é base na mesma
                System.out.println("Não é possível ter mais do que uma base.");
            } else if (this.listaIngredientesPizza.size() > 0 && ingredientePizzaNovo.getIngrediente() instanceof Cobertura) {// Já tem base, e o ingrediente novo é cobertura
                System.out.println("Cobertura adicionada");
                this.listaIngredientesPizza.add(ingredientePizzaNovo);
            }

        } else {
            System.out.println("Não pode ter mais do que " + MAX_INGREDIENTES + " ingredientes");
        }
    }

    public void removerIngredientePizza(String codigoIngredienteRemover) {

        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientesPizza) {
            if (ingredientePizzaAtual.getIngrediente().getCodigo().equals(codigoIngredienteRemover)) { // Encontramos o ingrediente com o código do ingrediente a remover

                if (ingredientePizzaAtual.getIngrediente() instanceof Base) {
                    System.out.println("Não pode remover a base");
                }

                if (ingredientePizzaAtual.getIngrediente() instanceof Cobertura) {

                    if (this.listaIngredientesPizza.size() > 2) {
                        this.listaIngredientesPizza.remove(ingredientePizzaAtual);
                        return; // Se já removeu, terminamos o método para não ficarmos com uma exceção de modificação concorrente
                    } else {
                        System.out.println("Não é possível remover a única cobertura");
                    }

                }

            }
        }
    }

    public void atualizarQuantidadeIngredientePizza(String codigoIngredienteAtualizar, double novaQuantidade) {

        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientesPizza) {
            if (ingredientePizzaAtual.getIngrediente().getCodigo().equals(codigoIngredienteAtualizar)) {
                ingredientePizzaAtual.setQuantidade(novaQuantidade);
            }
        }
    }

    public void exibirDetalhes() {
        System.out.println("******************** " + this.nome + "********************");
        System.out.println("Tipo da Pizza: "+this.tipoPizza());
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco + " €");
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Kcal Totais: " + this.kcalTotaisPizza() + " Kcal");
        int contadorIngredientes = 1;

        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientesPizza) {
            System.out.print("Ingrediente " + contadorIngredientes++ + ": ");
            ingredientePizzaAtual.exibirDetalhes();
        }
    }

    public double kcalTotaisPizza() {
        double kcalTotais = 0;

        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientesPizza) {

            double kcalUnidade = ingredientePizzaAtual.getIngrediente().getKcalUnidade();
            double quantidade = ingredientePizzaAtual.getQuantidade();

            kcalTotais += kcalUnidade * quantidade;
        }

        return kcalTotais;
    }

    public String tipoPizza() {

        int contadorCarne = 0;
        int contadorVegetais = 0;
        int contadorQueijos = 0;
        int contadorFrutosMar = 0;


        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientesPizza) {

            if (ingredientePizzaAtual.getIngrediente() instanceof Carne) {
                contadorCarne++;
            }

            if (ingredientePizzaAtual.getIngrediente() instanceof Vegetal) {
                contadorVegetais++;
            }

            if (ingredientePizzaAtual.getIngrediente() instanceof FrutoMar) {
                contadorFrutosMar++;
            }

            if (ingredientePizzaAtual.getIngrediente() instanceof Queijo) {
                contadorQueijos++;
            }

        }

        if (contadorCarne > 0 && contadorVegetais == 0 && contadorFrutosMar == 0 && contadorQueijos == 0) {
            return "Pizza Carne";
        } else if (contadorCarne == 0 && contadorVegetais > 0 && contadorFrutosMar == 0 && contadorQueijos == 0) {
            return "Pizza Vegetariana";
        } else if (contadorCarne == 0 && contadorVegetais == 0 && contadorFrutosMar > 0 && contadorQueijos == 0) {
            return "Pizza do Mar";
        } else if (contadorCarne == 0 && contadorVegetais == 0 && contadorFrutosMar == 0 && contadorQueijos > 0) {
            return "Pizza de Queijo";
        } else if (contadorCarne > 0 && contadorVegetais > 0 && contadorFrutosMar > 0 && contadorQueijos > 0) {
            return "Pizza Completa";
        } else {
            return "Pizza Mista";
        }
    }
}
