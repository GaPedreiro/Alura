package Modelos;

public class Filme {
    private String nome;
    private int anoLancamento;
    private boolean incluidoPlano;

    // O private aqui faz com que somaDasAvaliacoes não possa ser manipulada e nem mesmo lida fora da Classe dela.
    // É necessário criar um método que manipule esse atributo, no caso o getSomaDasAvaliações ou o getTotalAvaliacoes.
    private double somaDasAvaliacoes;

    private int totalAvaliacoes = 0;
    private int duracaoEmMinutos;

    // methods


    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeInformacoes() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }
    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double nota) {
        this.somaDasAvaliacoes = nota;
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public double retornaMedia() {
        double media = (somaDasAvaliacoes / totalAvaliacoes);
        return media;
    }
}
