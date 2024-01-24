package Modelos;

import Calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme (String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) retornaMedia() / 2;

    }

    @Override // esse toString é nativo do Java, aqui sobre escrevemos ele para ele funcionar da forma que a gente quer
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoLancamento() + ")";
    }
}
