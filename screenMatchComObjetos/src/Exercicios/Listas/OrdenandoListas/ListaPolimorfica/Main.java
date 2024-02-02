package Exercicios.Listas.OrdenandoListas.ListaPolimorfica;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaPolimorfica; // Repare que não informamos instanciamos o tipo de lista que ela vai ser, não demos o "new"

        listaPolimorfica = new ArrayList<>();

        listaPolimorfica.add("A");
        listaPolimorfica.add("B");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();

        listaPolimorfica.add("C");
        listaPolimorfica.add("D");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
