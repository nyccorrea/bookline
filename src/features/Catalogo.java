package features;
import users.Discente;

import java.util.ArrayList;
import java.util.Scanner;

public class Catalogo {

    public static void main(String[]args) {
       ArrayList<Livro> ll = new ArrayList<>();
        Exemplar exemplar = new Exemplar();
        Livro livro1 = new Livro( "132","sing", "shilin", 2000,2);
        Livro livro2 = new Livro("133","sing2", "shilin", 2006, 2);
        Livro livro3 = new Livro("134","sing3", "shilin", 2010,2);
        Livro livro4 = new Livro("135","sing4", "shilin", 2018,2);
        Livro livro5 = new Livro("136","sing5", "shilin", 2022,1);
        ll.add(livro1);
        ll.add(livro2);
        ll.add(livro3);
        ll.add(livro4);
        ll.add(livro5);

        exemplar.setListaLivros(ll);
        System.out.println("--------Catálogo de livros--------");
        // exibir livros
        for(Livro livro: ll){
            livro.exibirDetalhes();
            System.out.println("--------------------");
        }

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Digite 1 para emprestar livro");
            System.out.println("Digite 2 para devolver livro");
            System.out.println("Digite 0 para devolver sair");

            int escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Digite o id do livro que voçê quer emprestar:");
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
                case 0:
                    break;
                default:
                    System.out.println("Número inválido!");
                    break;
            }
            if(escolha == 0)
                System.out.println(" tchau usuário ");
                break;
        }
    }
}
