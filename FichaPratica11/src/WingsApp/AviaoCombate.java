package WingsApp;

import java.util.ArrayList;

public class AviaoCombate extends Aviao {

    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Arma> arsenal;

    /**
     * Método Construtor para <b>Avião de Combate</b>
     *
     * @param numSerie      Número de Série
     * @param modelo        Modelo do <b>Avião de Combate</b>
     * @param anoFabrico    Ano de Fabrico
     * @param pesoKg        Peso (Kg.)
     * @param compFuselagem Comprimento da Fuselagem (m.)
     * @param envAsas       Envergadura das Asas (m.)
     * @param altCauda      Altura de Cauda (m.)
     * @param numMotores    Número de Motores
     * @param autonomia     Autonomia (km.)
     * @param velMax        Velocidade Máxima (km/h)
     * @param preco         Preço (€)
     * @param paisOrigem    País de Origem
     * @param camuflagem    Camuflagem
     */
    public AviaoCombate(int numSerie, String modelo, int anoFabrico, double pesoKg, double compFuselagem, double envAsas, double altCauda, int numMotores, double autonomia, double velMax, double preco, String paisOrigem, boolean camuflagem) {
        super(numSerie, modelo, anoFabrico, pesoKg, compFuselagem, envAsas, altCauda, numMotores, autonomia, velMax, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.arsenal = new ArrayList<Arma>();
    }

    public void adicionarArma(Arma armaNova) {
        if (this.arsenal.size() < 3) {
            this.arsenal.add(armaNova);
            System.out.println(armaNova + " adicionada ao arsenal.");
        } else {
            System.out.println("Arsenal Cheio. Falha ao adicionar " + armaNova);
        }
    }

    public void exibirArsenal(){
        System.out.println("********** Arsenal **********");
        System.out.println(this.arsenal);
    }
}
