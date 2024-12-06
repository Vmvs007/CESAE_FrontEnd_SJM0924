package Ex_02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private double premio;
    private ArrayList<Pessoa> listaParticipantes;

    public Sorteio(double premio) {
        this.premio = premio;
        this.listaParticipantes = new ArrayList<Pessoa>();
    }

    public void adicionarParticipante(Pessoa novoInscrito) {

        if (novoInscrito.getIdade() >= 18) {
            System.out.println(novoInscrito.getNome() + " inscrito com sucesso.");
            listaParticipantes.add(novoInscrito);
        } else {
            System.out.println(novoInscrito.getNome() + " não tem idade para participar.");
        }

    }

    public void exibirDetalhes() {
        System.out.println("\n***** Sorteio de " + this.premio + " € *****");

//        for (int i = 0; i < this.listaParticipantes.size(); i++) {
//            this.listaParticipantes.get(i).exibirDetalhes();
//        }

        for (Pessoa pessoaAtual : this.listaParticipantes) {
            pessoaAtual.exibirDetalhes();
        }
    }

    public Pessoa sorteio(){
        Random randomGenerator = new Random();
        int indiceSorteado = randomGenerator.nextInt(0,this.listaParticipantes.size());

        return this.listaParticipantes.get(indiceSorteado);
    }
}
