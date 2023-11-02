package tests;
import java.util.ArrayList;
import java.util.Scanner;

import features.Estoque;
import features.Livro;

public class TesteLivro {

    public static void catalogo() {
       ArrayList<Livro> ll = new ArrayList<>();
        Estoque estoque = new Estoque();
       Livro livro1 = new Livro("sing", "shilin", 2000);
        Livro livro2 = new Livro("sing2", "shilin", 2006);
        ll.add(livro1);
        ll.add(livro2);

        estoque.setListaLivros(ll);

        for(Livro livro: ll){
            livro.exibirDetalhes();
            System.out.println("--------------------");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para emprestar livro");
        System.out.println("Digite 2 para devolver livro");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite o id do livro que voçê quer: ");
                int id = sc.nextInt();
                for (Livro livro : ll) {
                    if (livro.getId() == id) {
                        livro.emprestar(id);
                    }
                }
                break;
            case 2:
                System.out.println("Digite o id do livro que voçê quer devolver: ");
                int id1 = sc.nextInt();
                for (Livro livro : ll) {
                    if (livro.getId() == id1) {
                        livro.devolver(id1);
                    }
                }
                break;
        }
    }
}
