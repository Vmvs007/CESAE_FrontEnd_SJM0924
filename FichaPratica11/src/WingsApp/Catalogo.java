package WingsApp;

import WingsApp.Avioes.Aviao;
import WingsApp.Avioes.AviaoCombate;
import WingsApp.Avioes.JatoParticular;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Aviao> stand;

    public Catalogo() {
        this.stand = new ArrayList<Aviao>();
    }

    /**
     * Método para adicionar novos Aviões à lista
     *
     * @param aviaoNovo Avião a ser adicionado
     */
    public void adicionarAviao(Aviao aviaoNovo) {
        this.stand.add(aviaoNovo);
    }

    /**
     * Método para vender um Avião
     *
     * @param indexAviaoRemover Index do Avião a ser Removido
     */
    public void venderAviao(int indexAviaoRemover) {
        this.stand.remove(indexAviaoRemover);
    }

    /**
     * Método para vender um avião
     *
     * @param aviaoRemover Avião a ser removido
     */
    public void venderAviao(Aviao aviaoRemover) {
        this.stand.remove(aviaoRemover);
    }

    public double valorTotalCatalogo() {
        double valorTotal = 0;
        for (Aviao aviaoAtual : this.stand) {
            valorTotal += aviaoAtual.getPreco();
        }
        return valorTotal;
    }

    public void imprimirCatalogoInstanceOf() {

        System.out.println("****************************** Catálogo de Aviões ******************************\n");
        for (Aviao aviaoAtual : this.stand) {

            if (aviaoAtual instanceof JatoParticular) {
                JatoParticular jatoAtual = (JatoParticular) aviaoAtual;
                jatoAtual.exibirDetalhesJato();
            }

            if (aviaoAtual instanceof AviaoCombate) {
                AviaoCombate aviaoCombateAtual = (AviaoCombate) aviaoAtual;
                aviaoCombateAtual.exibirDetalhesAviaoCombate();
            }

        }

    }

    public void imprimirCatalogoOverride() {

        System.out.println("****************************** Catálogo de Aviões ******************************\n");
        for (Aviao aviaoAtual : this.stand) {
            aviaoAtual.exibirDetalhes();
        }

    }
}
