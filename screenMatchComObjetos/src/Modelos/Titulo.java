package Modelos;

import com.google.gson.annotations.SerializedName;
import excecao.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo> { //Comparable está aqui para que possamos utilizá-lo para ordenar a lista, foi passado o Título que será o tipo de objeto a ser comparado
    /*
    Esse @SerializedName é um recurso que vem com a biblioteca que implementamos no PrincipalComBusca.java
    implementamos ele para converter um json recebido da API em um objeto da classe Titulo,
    a função do @SerializedName é mapear as nossas variáveis porque a biblioteca de conversão, mapea os atributos da
    classe (lembra que que fizemos isso para transformar um json em um objeto de uma classe)
    buscando pelo nome deles em inglês, e nossos atributos estão com nomes em português, então estamos
    dizendo que quando o conversor for buscar pela propriedade "Title", ele vai encontrar ela em nosso
    código como sendo "nome".
     */
    //@SerializedName("Title") // Não há mais necessidade do Serialized pois estamos utilizando o Record.
    private String nome;

    @SerializedName("Year")
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

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não foi possível converter o ano de lançamento do filme" +
                    " porque ele possui mais de 4 caracteres. ");
        }
        this.anoLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
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

    @Override  //Comparable é uma interface, toda interface exige que um determinado método seja implementado, que no caso é esse método que há de ser implementado.
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome()); //Aqui vai: Qual atributo de título que eu quero comparar com outro
    }

    @Override
    public String toString() {
        return "nome: " + nome +
                ", ano de lançamento: " + anoLancamento +
                ", duração: " + duracaoEmMinutos +
                " minutos.";
    }
}
