import java.util.Scanner;

public class Exercicio_banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scanner input = new Scanner(System.in);


//COLOCAR VARIAVEIS COMO APRENDI A INICIO
        int selectPWord, selectConta, option, deposito, levantamento, transfer, newacc, emprestimo, optionMargin, newmargin;
        boolean login = false;

        //INFORMAÇAO DAS CONTAS
        //Conta 1:
        int conta1 = 1, pword1 = 123;
        double saldo1 = 0, credito = 0.1;
        String titular1 = "Relhatónamo";

        //Conta 2:
        int conta2 = 2, pword2 = 456;
        double saldo2 = 0;
        String titular2 = "Panuca";

        //Conta 3:
        int conta3 = 3, pword3 = 789;
        double saldo3 = 0;
        String titular3 = "Tinoco";

//Continha admin
        int admin = 9999;
        String admPw;


        System.out.print("Escolha uma conta: 1, 2, 3, admin");
        selectConta = input.nextInt();

        while (!login) {
            switch (selectConta) {
                case 1:
                    System.out.print("Introduza a Password da conta 1: ");
                    selectPWord = input.nextInt();
                    if (selectPWord == 123) {
                        login = true;
                        System.out.println("Escolha uma das opções:\n1: Consultar Informações\n 2: Depositar\n3: Levantar\n4:Transferir\n5:Simular Crédito\n6:Logout");
                        option = input.nextInt();
                        switch (option) {
                            case 1:
                                System.out.println("Número da conta: " + conta1 + "\nNome do titular: " + titular1 + "\nSaldo actual: " + saldo1 + "€\nMargem de Crédito: " + (credito * 100) + "%");
                                break;
                            case 2:
                                System.out.print("Introduza o valor a depositar: ");
                                deposito = input.nextInt();
                                saldo1 += deposito;
                                System.out.println("O seu saldo actual é " + saldo1 + "€");
                                break;
                            case 3:
                                System.out.println("Quanto pretende levantar? ");
                                levantamento = input.nextInt();
                                if (saldo1 < levantamento) {
                                    System.out.println("Não tem saldo suficiente para esta operação");
                                } else {
                                    saldo1 -= levantamento;
                                    System.out.println("Salto actual: " + saldo1 + "€");
                                }
                                break;
                            case 4:
                                System.out.println("Quanto pretende transferir? ");
                                transfer = input.nextInt();
                                System.out.println("Quer transferir para qual conta?\n" + conta2 + "\n" + conta3);
                                newacc = input.nextInt();
                                if (saldo1 < transfer) {
                                    System.out.println("Não tem saldo suficiente para esta operação");
                                } else {
                                    switch (newacc) {
                                        case 2:
                                            System.out.println("Saldo da sua conta: " + (saldo1 -= transfer) + "€\nSaldo da conta de destino: " + (saldo2 += transfer) + "€");
                                            break;
                                        case 3:
                                            System.out.println("Saldo da sua conta: " + (saldo1 -= transfer) + "€\nSaldo da conta de destino: " + (saldo3 += transfer) + "€");
                                            break;
                                        default:
                                            System.out.println("Conta seleccionada não existe!");
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("Qual é o valor do empréstimo pretende?");
                                emprestimo = input.nextInt();
                                if (emprestimo <= (saldo1 * credito)) {
                                    System.out.println("Crédito aprovado! Novo saldo: " + (saldo1 += emprestimo) + "€");
                                } else {
                                    System.out.println("Empréstimo não aprovado!");
                                }
                                break;
                            case 6:
                                System.out.println("Logout");
                                break;
                        }
                    } else {
                        System.out.println("Password Incorreta");
                        break;
                    }

                case 2:
                    System.out.print("Introduza a Password da conta 2: ");
                    selectPWord = input.nextInt();
                    if (selectPWord == 456) {
                        login = true;
                        System.out.println("Escolha uma das opções:\n1: Consultar Informações\n 2: Depositar\n3: Levantar\n4:Transferir\n5:Simular Crédito\n6:Logout");
                        option = input.nextInt();
                        switch (option) {
                            case 1:
                                System.out.println("Número da conta: " + conta2 + "\nNome do titular: " + titular2 + "\nSaldo actual: " + saldo2 + "€\nMargem de Crédito: " + (credito * 100) + "%");
                                break;
                            case 2:
                                System.out.print("Introduza o valor a depositar: ");
                                deposito = input.nextInt();
                                saldo2 += deposito;
                                System.out.println("O seu saldo actual é " + saldo2 + "€");
                                break;
                            case 3:
                                System.out.println("Quanto pretende levantar? ");
                                levantamento = input.nextInt();
                                if (saldo2 < levantamento) {
                                    System.out.println("Não tem saldo suficiente para esta operação");
                                } else {
                                    saldo2 -= levantamento;
                                    System.out.println("Salto actual: " + saldo2 + "€");
                                }
                                break;
                            case 4:
                                System.out.println("Quanto pretende transferir? ");
                                transfer = input.nextInt();
                                System.out.println("Quer transferir para qual conta?\n" + conta1 + "\n" + conta3);
                                newacc = input.nextInt();
                                if (saldo2 < transfer) {
                                    System.out.println("Não tem saldo suficiente para esta operação");
                                } else {
                                    switch (newacc) {
                                        case 1:
                                            System.out.println("Saldo da sua conta: " + (saldo2 -= transfer) + "€\nSaldo da conta de destino: " + (saldo1 += transfer) + "€");
                                            break;
                                        case 3:
                                            System.out.println("Saldo da sua conta: " + (saldo2 -= transfer) + "€\nSaldo da conta de destino: " + (saldo3 += transfer) + "€");
                                            break;
                                        default:
                                            System.out.println("Conta seleccionada não existe!");
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("Qual é o valor do empréstimo pretende?");
                                emprestimo = input.nextInt();
                                if (emprestimo <= (saldo2 * credito)) {
                                    System.out.println("Crédito aprovado! Novo saldo: " + (saldo2 += emprestimo) + "€");
                                } else {
                                    System.out.println("Empréstimo não aprovado!");
                                }
                                break;
                            case 6:
                                System.out.println("Logout");
                                break;
                        }
                    } else {
                        System.out.println("Password Incorreta");
                        break;
                    }

                case 3:
                    System.out.print("Introduza a Password da conta 3: ");
                    selectPWord = input.nextInt();
                    if (selectPWord == 789) {
                        login = true;
                        System.out.println("Escolha uma das opções:\n1: Consultar Informações\n 2: Depositar\n3: Levantar\n4:Transferir\n5:Simular Crédito\n6:Logout");
                        option = input.nextInt();
                        switch (option) {
                            case 1:
                                System.out.println("Número da conta: " + conta3 + "\nNome do titular: " + titular3 + "\nSaldo actual: " + saldo3 + "€\nMargem de Crédito: " + (credito * 100) + "%");
                                break;
                            case 2:
                                System.out.print("Introduza o valor a depositar: ");
                                deposito = input.nextInt();
                                saldo3 += deposito;
                                System.out.println("O seu saldo actual é " + saldo3 + "€");
                                break;
                            case 3:
                                System.out.println("Quanto pretende levantar? ");
                                levantamento = input.nextInt();
                                if (saldo3 < levantamento) {
                                    System.out.println("Não tem saldo suficiente para esta operação");
                                } else {
                                    saldo3 -= levantamento;
                                    System.out.println("Salto actual: " + saldo3 + "€");
                                }
                                break;
                            case 4:
                                System.out.println("Quanto pretende transferir? ");
                                transfer = input.nextInt();
                                System.out.println("Quer transferir para qual conta?\n" + conta2 + "\n" + conta1);
                                newacc = input.nextInt();
                                if (saldo1 < transfer) {
                                    System.out.println("Não tem saldo suficiente para esta operação");
                                } else {
                                    switch (newacc) {
                                        case 2:
                                            System.out.println("Saldo da sua conta: " + (saldo3 -= transfer) + "€\nSaldo da conta de destino: " + (saldo2 += transfer) + "€");
                                            break;
                                        case 1:
                                            System.out.println("Saldo da sua conta: " + (saldo3 -= transfer) + "€\nSaldo da conta de destino: " + (saldo1 += transfer) + "€");
                                            break;
                                        default:
                                            System.out.println("Conta seleccionada não existe!");
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("Qual é o valor do empréstimo pretende?");
                                emprestimo = input.nextInt();
                                if (emprestimo <= (saldo3 * credito)) {
                                    System.out.println("Crédito aprovado! Novo saldo: " + (saldo3 += emprestimo) + "€");
                                } else {
                                    System.out.println("Empréstimo não aprovado!");
                                }
                                break;
                            case 6:
                                System.out.println("Logout");
                                break;
                        }
                    } else {
                        System.out.println("Password Incorreta");
                        break;
                    }
                case 9999:
                    System.out.print("Introduza a Password da conta de Administrador: ");
                    admPw = input.next();
                    if (admPw == "admin123") {
                        login = true;
                        System.out.println("Escolha uma das seguintes opções:\n1: Consultar informações\n2:Modificar Margem de empréstimo");
                        option = input.nextInt();
                        switch (option) {
                            case 1:
                                System.out.println("Conta 1:");
                                System.out.println("Número da conta: " + conta1 + "\nNome do titular: " + titular1 + "\nSaldo actual: " + saldo1 + "€\nMargem de Crédito: " + (credito * 100) + "%");
                                System.out.println("Conta 2:");
                                System.out.println("Número da conta: " + conta2 + "\nNome do titular: " + titular2 + "\nSaldo actual: " + saldo2 + "€\nMargem de Crédito: " + (credito * 100) + "%");
                                System.out.println("Conta 3:");
                                System.out.println("Número da conta: " + conta3 + "\nNome do titular: " + titular3 + "\nSaldo actual: " + saldo3 + "€\nMargem de Crédito: " + (credito * 100) + "%");
                                break;
                            case 2:
                                System.out.println("Alterar margem de crédito: Qual conta pretende alterar? 1, 2 ou 3?");
                                optionMargin = input.nextInt();

                                switch (optionMargin) {
                                    case 1:
                                        System.out.println("Qual é a nova de empréstimo que pretende?");
                                        newmargin = input.nextInt();
                                        if (newmargin < 0 || newmargin > 200) {
                                            System.out.println("Margem inválida");
                                        } else {
                                            credito = (newmargin / 100);
                                        }
                                }
                        }


                    } else {
                        System.out.println("Password Incorreta");
                        break;
                    }
            }
        }
    }
}
//Aguentei sem chorar :,)