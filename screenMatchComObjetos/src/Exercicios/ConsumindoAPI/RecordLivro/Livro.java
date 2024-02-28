package Exercicios.ConsumindoAPI.RecordLivro;

public class Livro {
    private String titulo;
    private String autor;
    Editora editora;

    public Livro(String titulo, String autor, Editora editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Editora getEditora() {
        return editora;
    }
}
