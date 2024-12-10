package WingsApp;

public class Aviao {
    private int numSerie;
    private String modelo;
    private int anoFabrico;
    private double pesoKg;
    private double compFuselagem;
    private double envAsas;
    private double altCauda;
    private int numMotores;
    private double autonomia;
    private double velMax;
    private double preco;

    /**
     * Método Construtor para <b>Avião</b>
     * @param numSerie Número de Série
     * @param modelo Modelo do <b>Avião</b>
     * @param anoFabrico Ano de Fabrico
     * @param pesoKg Peso (Kg.)
     * @param compFuselagem Comprimento da Fuselagem (m.)
     * @param envAsas Envergadura das Asas (m.)
     * @param altCauda Altura de Cauda (m.)
     * @param numMotores Número de Motores
     * @param autonomia Autonomia (km.)
     * @param velMax Velocidade Máxima (km/h)
     * @param preco Preço (€)
     */
    public Aviao(int numSerie, String modelo, int anoFabrico, double pesoKg, double compFuselagem, double envAsas, double altCauda, int numMotores, double autonomia, double velMax, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.pesoKg = pesoKg;
        this.compFuselagem = compFuselagem;
        this.envAsas = envAsas;
        this.altCauda = altCauda;
        this.numMotores = numMotores;
        this.autonomia = autonomia;
        this.velMax = velMax;
        this.preco = preco;
    }
}
