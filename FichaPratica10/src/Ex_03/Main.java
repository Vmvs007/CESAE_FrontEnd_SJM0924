package Ex_03;

public class Main {
    public static void main(String[] args) {

        BarcoPesca amorDeMae = new BarcoPesca("Amor de Mãe", "Branco e Azul", 1965, 4, 1000, MarcaBarco.WOOLRIDGE);

        Peixe sardinha = new Peixe("Sardinha", 100, 9.5);
        Peixe atum = new Peixe("Atum Atlântico",200,50);
        Peixe robalo = new Peixe("Robalo",400,25);
        Peixe dourada = new Peixe("Dourada",500,15);
        Peixe faneca = new Peixe("Faneca",50,10.5);

        Marisco lagosta = new Marisco("Lagosta",100,150);
        Marisco ameijoa = new Marisco("Ameijoa",200,30);
        Marisco camarao = new Marisco("Camarão Tigre",20,300);
        Marisco mexilhao = new Marisco("Mexilhão",50,100);

        amorDeMae.pescarPeixe(sardinha);
        amorDeMae.pescarPeixe(atum);
        amorDeMae.pescarPeixe(dourada);
        amorDeMae.pescarPeixe(robalo);

        amorDeMae.largarPeixe(dourada);

        amorDeMae.pescarMarisco(lagosta);
        amorDeMae.pescarMarisco(camarao);
        amorDeMae.pescarMarisco(ameijoa);
        amorDeMae.pescarMarisco(mexilhao);
        amorDeMae.pescarMarisco(camarao);
        amorDeMae.pescarMarisco(camarao);

        System.out.println();
        amorDeMae.exibirDetalhes();

        System.out.println();
        amorDeMae.pescarPeixe(atum);

        System.out.println();
        amorDeMae.exibirDetalhes();
    }
}
