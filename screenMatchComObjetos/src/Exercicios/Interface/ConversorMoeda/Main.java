package Exercicios.Interface.ConversorMoeda;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda converte = new ConversorMoeda();
        converte.setReal(1250.00);
        System.out.println("O valor de R$" + converte.getReal() + " é equivalente a: $" + converte.converterDolarParaReal(converte.getReal()));
    }
}
