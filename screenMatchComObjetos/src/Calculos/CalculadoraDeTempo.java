package Calculos;

import Modelos.Filme;
import Modelos.Serie;
import Modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

//    public void inclui(Filme filme) {
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie serie) {
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    }

    // TROCAMOS PARA A SUPER CLASSE TITULO SENDO PASSADA COMO PARÂMETRO PARA OTIMIZAR O CÓDIGO, TANTO SÉRIE QUANTO FILME PERTENCEM À TÍTULO.
    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
