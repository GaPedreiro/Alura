package Exercicios.Listas.MaiorSaldoContaBancaria;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public ContaBancaria(int numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }
}
