package Exercicios.Interface.Vendavel;

public class Produto implements Vendavel{
    private double valorProduto;

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    private int quantidadeProduto;

    @Override
    public double calculaValorTotal(double valor) {
        return this.quantidadeProduto * this.valorProduto;
    }
}
