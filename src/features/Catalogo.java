package features;
import java.util.ArrayList;
import java.util.Scanner;

public class Catalogo {

    public static void main(String[]args) {
       ArrayList<Livro> ll = new ArrayList<>();
        Estoque estoque = new Estoque();
        Livro livro1 = new Livro("sing", "shilin", 2000);
        Livro livro2 = new Livro("sing2", "shilin", 2006);
        Livro livro3 = new Livro("sing3", "shilin", 2010);
        Livro livro4 = new Livro("sing4", "shilin", 2018);
        Livro livro5 = new Livro("sing5", "shilin", 2022);
        ll.add(livro1);
        ll.add(livro2);
        ll.add(livro3);
        ll.add(livro4);
        ll.add(livro5);

        estoque.setListaLivros(ll);
        System.out.println("--------Catálogo de livros--------");
        // exibir livros
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
            default:
                System.out.println("Número inválido!");
                break;
        }
    }
}
