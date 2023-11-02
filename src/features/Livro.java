package features;
public class Livro{
    // Atributos
    private static int nextID = 1;
    private int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean emEstoque;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.id = nextID;
        nextID ++;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emEstoque = true;
    }
    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean getEmEstoque() {
        return emEstoque;
    }
    public void exibirDetalhes() {
        System.out.println("ID: "+ id);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Disponível no Estoque: " + (emEstoque ? "Sim" : "Não"));
    }
    public void emprestar(int id) {
        if (id == getId() && getEmEstoque()) {
            emEstoque = false;
            System.out.println("O livro "+getTitulo()+" foi emprestado.");
        } else {
            System.out.println("O livro não está disponível no estoque no momento.");
        }
    }
    public void devolver(int id) {
        if (id == getId() && !getEmEstoque()) {
            emEstoque = true;
            System.out.println("O livro "+getTitulo()+" foi devolvido com sucesso.");
        } else {
            System.out.println("Este livro já está no estoque.");
        }
    }
}

