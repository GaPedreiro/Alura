package Exercicios.Listas.OrdenandoListas.OrdenandoTitulosComparable;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.getNome());
    }

    @Override // O toString aqui é somente pra formatar a apresentação da lista.
    public String toString() {
        return this.getNome();
    }
}
