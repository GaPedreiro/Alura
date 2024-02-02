package Exercicios.Listas.OrdenandoListas.NumerosOrdemCrescente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumerosOrdemCrescente {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(8);
        numeros.add(2);
        numeros.add(5);

        Collections.sort(numeros);
        System.out.println("Números ordenados: " + numeros);
    }
}
