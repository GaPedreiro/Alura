package Exercicios.Listas.OrdenandoListas.ListELinkedList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaArrayList = new ArrayList<>();

        listaArrayList.add("A");
        listaArrayList.add("B");

        List<String> listaLinkedList = new LinkedList<>();

        listaLinkedList.add("A");
        listaLinkedList.add("B");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);

    }
}
