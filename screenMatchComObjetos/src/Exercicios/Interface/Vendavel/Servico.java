package Exercicios.Interface.Vendavel;

public class Servico implements Vendavel{
    double valorServico;
    int quantidadeDeHoras;

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public int getQuantidadeDeHoras() {
        return quantidadeDeHoras;
    }

    public void setQuantidadeDeHoras(int quantidadeDeHoras) {
        this.quantidadeDeHoras = quantidadeDeHoras;
    }

    @Override
    public double calculaValorTotal(double valor) {
        return this.valorServico * this.quantidadeDeHoras;
    }
}
