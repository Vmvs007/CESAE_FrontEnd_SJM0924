package Ex_02;

public class Main {
    public static void main(String[] args) {

        // Criar instância de Cão
        Cao rex = new Cao("Rex","Labrador");
        Cao bobby = new Cao("Bobby","Rafeiro");

        // Invocar o comportamento ladrar() para ambos os cães
        rex.ladrar();
        bobby.ladrar();

        // Trocar o ladrar do rex
        rex.setLatido("Ruffff");

        // Invocar o comportamento ladrar() para ambos os cães
        System.out.println();
        rex.ladrar();
        bobby.ladrar();

    }
}
