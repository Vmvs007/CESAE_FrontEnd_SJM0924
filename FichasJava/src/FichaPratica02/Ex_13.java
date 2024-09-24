package FichaPratica02;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as Variáveis
        int horas, minutos;

        // Ler horas e minutos
        System.out.print("Insira as horas: ");
        horas = input.nextInt();

        System.out.print("Insira os minutos: ");
        minutos = input.nextInt();

        if (horas < 12) { // AM - Manhã
            System.out.println(horas + ":" + minutos + " AM");
        }

        if (horas > 12) { // PM - Tarde
            horas = horas - 12;
            System.out.println(horas + ":" + minutos + " PM");
        }

        if (horas == 12) { // PM - Meio-dia
            System.out.println(horas + ":" + minutos + " PM");
        }

    }
}
