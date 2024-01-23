package Exercicios.Interface.Vendavel;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Servico servico = new Servico();

        produto.setValorProduto(1.50);
        produto.setQuantidadeProduto(8);
        System.out.println("Valor total da compra do produto: R$" + produto.calculaValorTotal(produto.getValorProduto() * produto.getQuantidadeProduto()));

        servico.setValorServico(30.00);
        servico.setQuantidadeDeHoras(6);
        System.out.println("Valor total da contratação do serviço R$:" + servico.calculaValorTotal(servico.getValorServico() * servico.getQuantidadeDeHoras()));
    }
}
