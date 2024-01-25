package Exercicios.Listas.ListaInterface;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Quadrado quadrado = new Quadrado(8);

        circulo.calcularArea();
        quadrado.calcularArea();
    }
}
