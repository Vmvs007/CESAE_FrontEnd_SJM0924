package Ex_06;

public class Main {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta("Cristiano Ronaldo", "Futebol", 1.85, 85, "Portugal");
        Atleta atleta2 = new Atleta("Usain Bolt", "Atletismo", 1.9, 78, "Jamaica");
        Atleta atleta3 = new Atleta("Joaquim A.", "Ping Pong", 1.6, 90, "Portugal");
        Atleta atleta4 = new Atleta("Conor McGregor", "MMA", 1.75, 65, "Irlanda");
        Atleta atleta5 = new Atleta("Mike Tyson", "Boxe", 1.85, 70, "USA");
        Atleta atleta6 = new Atleta("Joaquim A.", "Matrecos", 1.62, 92, "Portugal");

        Competicao torneioXadrez = new Competicao("Torneio Internacional Xadrez","Marrocos",30);
        Competicao torneioMatrecos = new Competicao("Torneio Nacional de Matrecos","Portugal",10);

        // _______________________________________________________________

        torneioXadrez.inscreverAtleta(atleta3);
        torneioXadrez.inscreverAtleta(atleta4);
        torneioXadrez.inscreverAtleta(atleta5);

        torneioXadrez.exibirDetalhes();

        // _______________________________________________________________

        torneioMatrecos.inscreverAtleta(atleta1);
        torneioMatrecos.inscreverAtleta(atleta3);
        torneioMatrecos.inscreverAtleta(atleta6);
        torneioMatrecos.inscreverAtleta(atleta5);

        torneioMatrecos.exibirDetalhes();


    }
}
