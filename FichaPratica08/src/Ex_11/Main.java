package Ex_11;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta("12345",500,"Vitor S.");
        Conta conta2 = new Conta("11111", 100,"Joaquim A.");
        Conta conta3 = new Conta("22222",10000,"Primo da Suiça");

        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
        conta3.mostrarSaldo();

        System.out.println();

        // deposito
        conta1.depositar(1000);
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
        conta3.mostrarSaldo();

        System.out.println();

        // tentar levantar
        conta2.levantar(3000);
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
        conta3.mostrarSaldo();

        System.out.println();

        // levantar
        conta2.levantar(20);
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
        conta3.mostrarSaldo();

        System.out.println();

        // tentar transferir
        conta2.transferencia(conta1,9000);
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
        conta3.mostrarSaldo();

        System.out.println();

        // transferencia
        conta3.transferencia(conta1,500);
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
        conta3.mostrarSaldo();
    }
}
