package WingsApp.Avioes;

import WingsApp.Enums.CategoriaJato;
import WingsApp.Enums.Instalacao;

import java.util.ArrayList;

public class JatoParticular extends Aviao {

    private int lotacao;
    private double capacidadeBagagem;
    private CategoriaJato categoria;
    private ArrayList<Instalacao> listaInstalacoes;

    /**
     * Método Construtor para <b>Jato Particular</b>
     *
     * @param numSerie          Número de Série
     * @param modelo            Modelo do <b>Jato Particular</b>
     * @param anoFabrico        Ano de Fabrico
     * @param pesoKg            Peso (Kg.)
     * @param compFuselagem     Comprimento da Fuselagem (m.)
     * @param envAsas           Envergadura das Asas (m.)
     * @param altCauda          Altura de Cauda (m.)
     * @param numMotores        Número de Motores
     * @param autonomia         Autonomia (km.)
     * @param velMax            Velocidade Máxima (km/h)
     * @param preco             Preço (€)
     * @param lotacao           Lotação (Pessoas)
     * @param capacidadeBagagem Capacidade da Bagagem (cm3)
     * @param categoria         Categoria do <b>Jato Particular</b>
     */
    public JatoParticular(int numSerie, String modelo, int anoFabrico, double pesoKg, double compFuselagem, double envAsas, double altCauda, int numMotores, double autonomia, double velMax, double preco, int lotacao, double capacidadeBagagem, CategoriaJato categoria) {
        super(numSerie, modelo, anoFabrico, pesoKg, compFuselagem, envAsas, altCauda, numMotores, autonomia, velMax, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        this.listaInstalacoes = new ArrayList<Instalacao>();
    }

    /**
     * Método para adicionar uma nova <b>Instalacao</b>
     *
     * @param instalacaoNova Instalação a ser adicionada
     */
    public void adicionarInstalacao(Instalacao instalacaoNova) {
        this.listaInstalacoes.add(instalacaoNova);
        System.out.println(instalacaoNova + " instalada com sucesso.");
    }

    public void exibirInstalacoes() {
        System.out.println("Instalações: " + this.listaInstalacoes);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Lotação: " + this.lotacao + " | Capacidade Bagagem: " + this.capacidadeBagagem + " cm3 | Categoria: " + this.categoria);
        this.exibirInstalacoes();
    }

    public void exibirDetalhesJato() {
        super.exibirDetalhes();
        System.out.println("Lotação: " + this.lotacao + " | Capacidade Bagagem: " + this.capacidadeBagagem + " cm3 | Categoria: " + this.categoria);
        this.exibirInstalacoes();
    }
}
