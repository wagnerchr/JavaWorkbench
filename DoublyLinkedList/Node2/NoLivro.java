package DoublyLinkedList.Node2;

public class NoLivro {
    public String autor, titulo, edicao, local, editora;
    public int anoPubli;
    public NoLivro prox;
    public NoLivro ant;

    public NoLivro(String autor, String titulo, String edicao, String local, String editora, int anoPubli) {
        this.autor = autor;
        this.titulo = titulo;
        this.edicao = edicao;
        this.local = local;
        this.editora = editora;
        this.anoPubli = anoPubli;
        this.prox = null;
        this.ant = null;
    }
}
