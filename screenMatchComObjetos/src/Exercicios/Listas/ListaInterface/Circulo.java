package Exercicios.Listas.ListaInterface;

import java.util.ArrayList;
import java.util.List;

/*
Crie uma interface Forma com um método calcularArea().
Implemente a interface em duas classes, por exemplo, Circulo e Quadrado.
Em seguida, crie uma lista de formas (objetos da interface Forma)
e utilize um loop para calcular e imprimir a área de cada forma.
 */
public class Circulo implements Forma {
    // (Raio^2) * 3,14.
    private double raio = 0;
    private double area;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
       this.area = (this.raio * this.raio) * 3.14;
        System.out.println("- A área do círculo é: " + this.area);
    }
}
