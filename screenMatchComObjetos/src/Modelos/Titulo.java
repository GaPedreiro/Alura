package Modelos;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluidoPlano;

    // O private aqui faz com que somaDasAvaliacoes não possa ser manipulada e nem mesmo lida fora da Classe dela.
    // É necessário criar um método que manipule esse atributo, no caso o getSomaDasAvaliações ou o getTotalAvaliacoes.
    private double somaDasAvaliacoes;

    private int totalAvaliacoes = 0;
    private int duracaoEmMinutos;

    /*
    Os construtores são os responsáveis por popular o objeto, também podem ser feitas validações nele
    Por exemplo, para popular determinado objeto, faz-se necessário validar as informações passadas como
    parâmetros.
     */
    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

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

    public boolean exibeInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        return false;
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
