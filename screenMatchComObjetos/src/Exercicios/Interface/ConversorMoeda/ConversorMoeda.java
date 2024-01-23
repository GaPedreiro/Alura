package Exercicios.Interface.ConversorMoeda;

public class ConversorMoeda implements ConversaoFinanceira{
    private double real = 0;

    public void setReal(double real) {
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    @Override
    public double converterDolarParaReal(Double dolar) {
        return this.real / 4.97;
    }
}
