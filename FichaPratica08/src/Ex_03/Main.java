package Ex_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instanciar os Retangulos
        Retangulo retangulo1 = new Retangulo(10,15);
        Retangulo retangulo2 = new Retangulo(5, 4);

        // System.out.println("Área do Ret. 1: " + retangulo1.area());
        // System.out.println("Área do Ret. 2: " + retangulo2.area());

        if (retangulo1.area() > retangulo2.area()) {
            System.out.println("Área do Ret. 1 é Maior: " + retangulo1.area());
        }else{
            System.out.println("Área do Ret. 2 é Maior: " + retangulo2.area());
        }


    }
}
