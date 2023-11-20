package features;
public class Livro{
    // Atributos
    private static int nextID = 1;
    private int id;
    private String isbn;
    private String titulo;
    private int qtdDisponivel;
    private int anoPublicacao;
    private boolean emEstoque;

    public Livro(String isbn, String titulo, String autor, int anoPublicacao,int qtdDisponivel) {
        this.id = nextID;
        nextID ++;
        this.isbn = isbn;
        this.titulo = titulo;
        this.qtdDisponivel = qtdDisponivel;
        this.anoPublicacao = anoPublicacao;
        this.emEstoque = true;
    }
    public int getId() {
        return id;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getQtdDisponivel(){ return qtdDisponivel; };

    public boolean getEmEstoque() {
        return emEstoque;
    }
    public void exibirDetalhes() {
        System.out.println("ID: "+ id);
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Disponível no Estoque: " + (emEstoque ? "Sim" : "Não"));
    }
    public void emprestar(int id) {
        if (getQtdDisponivel() == 0) {
            emEstoque = false;
        }
        if (id == getId() && getEmEstoque()) {
            System.out.println("O livro "+getTitulo()+" foi emprestado.");
            this.qtdDisponivel --;
        } else {
            System.out.println("O livro não está disponível no estoque no momento.");
        }
    }
    public void devolver(int id) {
        if (id == getId()) {
            System.out.println("O livro "+getTitulo()+" foi devolvido com sucesso.");
            this.emEstoque = true;
            this.qtdDisponivel ++;
        } else {
            System.out.println("Este livro já está no estoque.");
        }
    }
}

