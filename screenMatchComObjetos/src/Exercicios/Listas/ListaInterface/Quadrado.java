package Exercicios.Listas.ListaInterface;

public class Quadrado implements Forma {
    // L^2.
    private double area;
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        this.area = lado * lado;
        System.out.println("- A área do quadrado é: " + this.area);
    }
}
