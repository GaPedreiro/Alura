package Exercicios.ConsumindoAPI.ExerciciosAula4.Exercicio4;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private String flex;

    public Carro(String modelo, int ano, String cor, String flex) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.flex = flex;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public String isFlex() {
        return flex;
    }

    @Override
    public String toString() {
        return "\nDados do veículo." +
                "\nModelo: " + modelo +
                "\nAno: " + ano +
                "\nCor: " + cor +
                "\nFlex: " + flex;
    }
}
