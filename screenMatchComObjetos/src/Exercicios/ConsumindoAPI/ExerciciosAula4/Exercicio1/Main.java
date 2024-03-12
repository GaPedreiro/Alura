package Exercicios.ConsumindoAPI.ExerciciosAula4.Exercicio1;

/*
Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt": "Conteúdo a ser gravado no arquivo."
Utilize as classes do pacote java.io.
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String mensagem = "Conteúdo a ser gravado no arquivo.";
        FileWriter writer = new FileWriter("arquivo.txt");
        writer.write(mensagem);
        writer.close();
    }
}
