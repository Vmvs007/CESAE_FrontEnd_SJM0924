package FichaPratica01;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as Variáveis
        int segundosLidos, minutosLidos, segundosTotaisAlbum = 0, horas, minutos, segundos;

        // Ler minutos e segundos de cada música
        System.out.print("Introduza os minutos da música 1: ");
        minutosLidos = input.nextInt();

        System.out.print("Introduza os segundos da música 1: ");
        segundosLidos = input.nextInt();

        segundosTotaisAlbum = segundosTotaisAlbum + (minutosLidos * 60) + segundosLidos;


        System.out.print("Introduza os minutos da música 2: ");
        minutosLidos = input.nextInt();

        System.out.print("Introduza os segundos da música 2: ");
        segundosLidos = input.nextInt();

        segundosTotaisAlbum = segundosTotaisAlbum + (minutosLidos * 60) + segundosLidos;


        System.out.print("Introduza os minutos da música 3: ");
        minutosLidos = input.nextInt();

        System.out.print("Introduza os segundos da música 3: ");
        segundosLidos = input.nextInt();

        segundosTotaisAlbum = segundosTotaisAlbum + (minutosLidos * 60) + segundosLidos;


        System.out.print("Introduza os minutos da música 4: ");
        minutosLidos = input.nextInt();

        System.out.print("Introduza os segundos da música 4: ");
        segundosLidos = input.nextInt();

        segundosTotaisAlbum = segundosTotaisAlbum + (minutosLidos * 60) + segundosLidos;


        System.out.print("Introduza os minutos da música 5: ");
        minutosLidos = input.nextInt();

        System.out.print("Introduza os segundos da música 5: ");
        segundosLidos = input.nextInt();

        segundosTotaisAlbum = segundosTotaisAlbum + (minutosLidos * 60) + segundosLidos;

        System.out.println("Segundos Totais do Álbum: " + segundosTotaisAlbum);

        // Calcular as horas, minutos e segundos
        horas = segundosTotaisAlbum / 3600;
        minutos = (segundosTotaisAlbum / 60) - (horas * 60);
        segundos = segundosTotaisAlbum - (horas * 3600) - (minutos * 60);


        System.out.println(horas + "h " + minutos + "m " + segundos + "s");

    }
}
