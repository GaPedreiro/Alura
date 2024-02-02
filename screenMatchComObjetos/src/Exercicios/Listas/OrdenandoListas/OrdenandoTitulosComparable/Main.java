package Exercicios.Listas.OrdenandoListas.OrdenandoTitulosComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Titulo titulo = new Titulo("Gabriel");
//        Titulo outroTitulo = new Titulo("Caimla");
//        Titulo terceiroTitulo = new Titulo("Regina");
//        Titulo quartoTitulo = new Titulo("Isadora");
//        Titulo quintoTitulo = new Titulo("Bernado");
        // Foi criado um novo título direto no .add

        List<Titulo> listaDeTitulos = new ArrayList<>();

        listaDeTitulos.add(new Titulo("Gabriel"));
        listaDeTitulos.add(new Titulo("Camila"));
        listaDeTitulos.add(new Titulo("Regina"));
        listaDeTitulos.add(new Titulo("Bernardo"));
        listaDeTitulos.add(new Titulo("Isadora"));

        System.out.println("Lista fora de ordem: " + listaDeTitulos);

        Collections.sort(listaDeTitulos); // Utilizando a interface Comparable

        System.out.println("\nLista ordenada: " + listaDeTitulos);
    }
}
