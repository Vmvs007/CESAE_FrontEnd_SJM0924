package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_09 {
    /**
     * Função que imprime um ficheiro na consola
     *
     * @param path Caminho do Ficheiro
     * @throws FileNotFoundException Caso ficheiro não seja encontrado
     */
    public static void imprimirFicheiro(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        while (scannerFicheiro.hasNextLine()) {
            System.out.println(scannerFicheiro.nextLine());
        }

        scannerFicheiro.close();

    }

    /**
     * Função para imprimir as músicas de um determinado género
     *
     * @param path   Caminho do ficheiro
     * @param genero Genério a ser pesquisado
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static void pesquisarMusicasGenero(String path, String genero) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] linhaSeparada = linha.split(",");

            if (linhaSeparada[2].equals(genero)) {
                imprimirMusica(linhaSeparada);
            }


        }
    }

    /**
     * Função para imprimir as músicas de um determinado artista
     *
     * @param path    Caminho do ficheiro
     * @param artista Artista a ser pesquisado
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static void pesquisarMusicasArtista(String path, String artista) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] linhaSeparada = linha.split(",");

            if (linhaSeparada[1].equals(artista)) {
                imprimirMusica(linhaSeparada);
            }


        }
    }

    /**
     * Função para imprimir uma música na consola
     *
     * @param linhaMusica Array com a música
     */
    public static void imprimirMusica(String[] linhaMusica) {
        System.out.println("\uD83C\uDFBC " + linhaMusica[0] + "\t|\t" + linhaMusica[1] + "\t|\t" + linhaMusica[2] + "\t|\t" + linhaMusica[3] + " \uD83C\uDFBC");
    }

    /**
     * Função para imprimir a maior música do ficheiro
     *
     * @param path Caminho para o ficheiro
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static void maiorMusica(String path) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));

        int duracaoMaiorMusica = 0;
        String[] maiorMusica = new String[4];

        // Avançar a linha do cabeçalho
        sc.nextLine();

        // Ciclo que vai iterar todas as músicas do ficheiro
        while (sc.hasNextLine()) {

            // Ler a linha atual
            String linha = sc.nextLine();
            // Divido a linha atual pela vírgula
            String[] linhaSeparada = linha.split(",");

            // Gravar a duração na variável "duracao" - vem da posição 3 da linhaDividida
            String duracao = linhaSeparada[3]; // Exemplo: "5:58"
            // Divido a duração pelos dois pontos - minutos à esquerda [0] e segundos à direita [1]
            String[] duracaoSeparada = duracao.split(":"); // Exemplo: ["5"]["58"]

            // Calcular a duração, em segundos, da música
            // Multiplicar os minutos por 60, e somar os segundos
            int duracaoSegundos = (Integer.parseInt(duracaoSeparada[0]) * 60) + Integer.parseInt(duracaoSeparada[1]);

            // Se a musica atual tiver uma duração maior que a maiorMusica, assume o lugar dela
            if (duracaoSegundos > duracaoMaiorMusica) {
                duracaoMaiorMusica = duracaoSegundos;
                maiorMusica = linhaSeparada;
            }
        }
        imprimirMusica(maiorMusica);
    }

    /**
     * Função para limpar a consola
     */
    public static void limparConsola() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    /**
     * Função para premir enter para continuar
     */
    public static void primaEnter() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n[Prima Enter para Continuar]");
        input.nextLine();
    }

    public static void pesquisarMusicasDuracao(String path, int minutosPesquisa, int segundosPesquisa) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));

        // Avançar a linha do cabeçalho
        sc.nextLine();

        // Calcular o minimo de segundos que uma musica tem que ter
        int duracaoMinima = minutosPesquisa * 60 + segundosPesquisa;

        // Ciclo que vai iterar todas as músicas do ficheiro
        while (sc.hasNextLine()) {

            // Ler a linha atual
            String linha = sc.nextLine();
            // Divido a linha atual pela vírgula
            String[] linhaSeparada = linha.split(",");

            // Gravar a duração na variável "duracao" - vem da posição 3 da linhaDividida
            String duracao = linhaSeparada[3]; // Exemplo: "5:58"
            // Divido a duração pelos dois pontos - minutos à esquerda [0] e segundos à direita [1]
            String[] duracaoSeparada = duracao.split(":"); // Exemplo: ["5"]["58"]

            // Calcular a duração, em segundos, da música
            // Multiplicar os minutos por 60, e somar os segundos
            int duracaoSegundos = (Integer.parseInt(duracaoSeparada[0]) * 60) + Integer.parseInt(duracaoSeparada[1]);

            if (duracaoSegundos >= duracaoMinima) {
                imprimirMusica(linhaSeparada);
            }

        }

    }


    /**
     * Função para apresentar o menu
     */
    public static void menu() throws FileNotFoundException {
        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Variáveis
        int opcao;
        String path = "FicheirosEx09/exercicio_09.csv";

        do {
            imprimirFicheiro("FicheirosEx09/Playlist.txt");
            System.out.println("1. Pesquisar Género");
            System.out.println("2. Pesquisar Artista");
            System.out.println("3. Maior Música");
            System.out.println("4. Pesquisar Duração");
            System.out.println("0. Sair\n");

            System.out.print("Opção:");
            opcao = input.nextInt();

            System.out.println("\n\n\n");
            limparConsola();
            switch (opcao) {
                case 1: // Pesquisar Género
                    imprimirFicheiro("FicheirosEx09/PesquisarGenero.txt");
                    System.out.print("\nGénero a Pesquisar: ");
                    input.nextLine();
                    String generoPesquisa = input.nextLine();
                    pesquisarMusicasGenero(path, generoPesquisa);
                    primaEnter();
                    limparConsola();
                    break;

                case 2: // Pesquisar Artista
                    imprimirFicheiro("FicheirosEx09/PesquisarArtista.txt");
                    System.out.print("\nArtista a Pesquisar: ");
                    input.nextLine();
                    String artistaPesquisa = input.nextLine();
                    pesquisarMusicasArtista(path, artistaPesquisa);
                    primaEnter();
                    limparConsola();
                    break;

                case 3: // Maior Música
                    imprimirFicheiro("FicheirosEx09/MaiorMusica.txt");
                    maiorMusica(path);
                    primaEnter();
                    limparConsola();
                    break;

                case 4: // Pesquisar Duração
                    imprimirFicheiro("FicheirosEx09/PesquisarDuracao.txt");
                    System.out.print("\nMinutos: ");
                    int minutos = input.nextInt();
                    System.out.print("Segundos: ");
                    int segundos = input.nextInt();

                    pesquisarMusicasDuracao(path, minutos, segundos);
                    primaEnter();
                    limparConsola();
                    break;

                case 0: // Sair
                    imprimirFicheiro("FicheirosEx09/Sair.txt");
                    System.out.println("\n\n\n\n");
                    imprimirFicheiro("FicheirosEx09/Copyright.txt");
                    break;

                default:

            }

        } while (opcao != 0);

    }

    public static void main(String[] args) throws FileNotFoundException {

        /*
        1. Criar menu
        2. Desenvolver as funções
        3. Invocar as funções na respetiva opção menu
        Ir comentando o código
         */
        menu();

    }
}
